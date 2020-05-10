package typingsSlinky.ejWebAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered after a Accordion item is active . Argument values are activeIndex, activeHeader, isInteraction and current model values.
    */
  var activate: js.UndefOr[js.Function1[/* e */ ActivateEventArgs, Unit]] = js.native
  /** Triggered before the AJAX content is loaded in a content panel. Arguments have location of the content (URL) and current model value.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
  /** Triggered after AJAX load failed action. Arguments have URL, error message, and current model value.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  /** Triggered after the AJAX content loads. Arguments have current model values.
    */
  var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, Unit]] = js.native
  /** Specifies the ajaxSettings option to load the content to the accordion control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.native
  /** Triggered after AJAX success action. Arguments have URL, content, and current model values.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  /** Accordion headers can be expanded and collapsed on keyboard action.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Triggered before a tab item is active. Arguments have active index and model values.
    */
  var beforeActivate: js.UndefOr[js.Function1[/* e */ BeforeActivateEventArgs, Unit]] = js.native
  /** Triggered before a Accordion item is inactive. Argument values are  inActiveIndex and  model values.
    */
  var beforeInactivate: js.UndefOr[js.Function1[/* e */ BeforeInactivateEventArgs, Unit]] = js.native
  /** To set the Accordion headers Collapse Speed.
    * @Default {300}
    */
  var collapseSpeed: js.UndefOr[Double] = js.native
  /** Specifies the collapsible state of accordion control.
    * @Default {false}
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** Triggered after Accordion control creation.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for Accordion theme, which is used customize.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Allows you to set the custom header Icon. It accepts two key values â€œheaderâ€, â€selectedHeaderâ€.
    * @Default {{ header: e-collapse, selectedHeader: e-expand }}
    */
  var customIcon: js.UndefOr[CustomIcon] = js.native
  /** Triggered after Accordion control destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Disables the specified indexed items in accordion.
    * @Default {[]}
    */
  var disabledItems: js.UndefOr[js.Array[Double]] = js.native
  /** Specifies the animation behavior in accordion.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Multiple content panels to activate at a time.
    * @Default {false}
    */
  var enableMultipleOpen: js.UndefOr[Boolean] = js.native
  /** Save current model value to browser cookies for maintaining states. When refreshing the accordion control page, the model value is applied from browser cookies or HTML 5local
    * storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Display headers and panel text from right-to-left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** With this enabled property, you can enable or disable the Accordion.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Used to enable the disabled items in accordion.
    * @Default {[]}
    */
  var enabledItems: js.UndefOr[js.Array[Double]] = js.native
  /** The events API binds the action for activating the accordion header. Users can activate the header by using mouse actions such as mouse-over, mouse-up, mouse-down, and soon.
    * @Default {click}
    */
  var events: js.UndefOr[String] = js.native
  /** To set the Accordion headers Expand Speed.
    * @Default {300}
    */
  var expandSpeed: js.UndefOr[Double] = js.native
  /** Sets the height for Accordion items header.
    */
  var headerSize: js.UndefOr[Double | String] = js.native
  /** Specifies height of the accordion.
    * @Default {null}
    */
  var height: js.UndefOr[Double | String] = js.native
  /** Adjusts the content panel height based on the given option (content, auto, or fill). By default, the panel heights are adjusted based on the content.
    * @Default {content}
    */
  var heightAdjustMode: js.UndefOr[HeightAdjustMode | String] = js.native
  /** It allows to define the characteristics of the Accordion control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Triggered after a Accordion item is inactive. Argument values are  inActiveHeader, inActiveIndex ,isInteraction and current model values.
    */
  var inActivate: js.UndefOr[js.Function1[/* e */ InActivateEventArgs, Unit]] = js.native
  /** The given index header will activate (open). If collapsible is set to true, and a negative value is given, then all headers are collapsed. Otherwise, the first panel isactivated.
    * @Default {0}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.native
  /** Activate the specified indexed items of the accordion
    * @Default {[0]}
    */
  var selectedItems: js.UndefOr[js.Array[Double]] = js.native
  /** Used to determines the close button visibility an each accordion items. This close button helps to remove the accordion item from the control.
    * @Default {false}
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /** Displays rounded corner borders on the Accordion control's panels and headers.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specifies width of the accordion.
    * @Default {null}
    */
  var width: js.UndefOr[Double | String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: /* e */ ActivateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxBeforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxLoad(value: /* e */ AjaxLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxSettings(value: AjaxSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeActivate(value: /* e */ BeforeActivateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeActivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInactivate(value: /* e */ BeforeInactivateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeInactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomIcon(value: CustomIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledItems(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledItems")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMultipleOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultipleOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMultipleOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultipleOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledItems(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledItems")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightAdjustMode(value: HeightAdjustMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightAdjustMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightAdjustMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightAdjustMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withInActivate(value: /* e */ InActivateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inActivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

