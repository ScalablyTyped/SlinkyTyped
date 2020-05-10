package typingsSlinky.ejWebAll.ej.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered before AJAX content has been loaded.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
  /** Triggered if error occurs in AJAX request.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  /** Triggered after AJAX content load action.
    */
  var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, Unit]] = js.native
  /** Specifies the ajaxSettings option to load the content to the Tab control.
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.native
  /** Triggered after a tab item activated.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  /** Tab items interaction with keyboard keys, like headers active navigation.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Triggered before a tab item activated.
    */
  var beforeActive: js.UndefOr[js.Function1[/* e */ BeforeActiveEventArgs, Unit]] = js.native
  /** Triggered before a tab item remove.
    */
  var beforeItemRemove: js.UndefOr[js.Function1[/* e */ BeforeItemRemoveEventArgs, Unit]] = js.native
  /** Allow to collapsing the active item, while click on the active header.
    * @Default {false}
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** Triggered before a tab item Create.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Set the root class for Tab theme. This cssClass API helps to use custom skinning option for Tab control.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Triggered before a tab item destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Disables the given tab headers and content panels.
    * @Default {[]}
    */
  var disabledItemIndex: js.UndefOr[js.Array[Double]] = js.native
  /** Specifies the animation behavior of the tab.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Save current model value to browser cookies for state maintains. While refresh the Tab control page the model value apply from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Display Right to Left direction for headers and panels text of tab.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specify to enable scrolling for Tab header.
    * @Default {false}
    */
  var enableTabScroll: js.UndefOr[Boolean] = js.native
  /** When this property is set to false, it disables the tab control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Enables the given tab headers and content panels.
    * @Default {[]}
    */
  var enabledItemIndex: js.UndefOr[js.Array[Double]] = js.native
  /** The event API to bind the action for active the tab items.
    * @Default {click}
    */
  var events: js.UndefOr[String] = js.native
  /** Specifies the position of Tab header as top, bottom, left or right. See below to get available Position
    * @Default {top}
    */
  var headerPosition: js.UndefOr[String | Position] = js.native
  /** Set the height of the tab header element. Default this property value is null, so height take content height.
    * @Default {null}
    */
  var headerSize: js.UndefOr[String | Double] = js.native
  /** Height set the outer panel element. Default this property value is null, so height take content height.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Adjust the content panel height for given option (content, auto and fill), by default panels height adjust based on the content.See below to get available HeightAdjustMode
    * @Default {content}
    */
  var heightAdjustMode: js.UndefOr[String | HeightAdjustMode] = js.native
  /** Specifies to hide a pane of Tab control.
    * @Default {[]}
    */
  var hiddenItemIndex: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the HTML Attributes of the Tab.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** The idPrefix property appends the given string on the added tab item idâ€™s in runtime.
    * @Default {ej-tab-}
    */
  var idPrefix: js.UndefOr[String] = js.native
  /** Triggered after a tab item activated.
    */
  var itemActive: js.UndefOr[js.Function1[/* e */ ItemActiveEventArgs, Unit]] = js.native
  /** Triggered after new tab item add
    */
  var itemAdd: js.UndefOr[js.Function1[/* e */ ItemAddEventArgs, Unit]] = js.native
  /** Triggered after tab item removed.
    */
  var itemRemove: js.UndefOr[js.Function1[/* e */ ItemRemoveEventArgs, Unit]] = js.native
  /** Specifies the Tab header in active for given index value.
    * @Default {0}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.native
  /** Display the close button for each tab items. While clicking on the close icon, particular tab item will be removed.
    * @Default {false}
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /** Display the Reload button for each tab items.
    * @Default {false}
    */
  var showReloadIcon: js.UndefOr[Boolean] = js.native
  /** Tab panels and headers to be displayed in rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Set the width for outer panel element, if not itâ€™s take parent width.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
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
    def withBeforeActive(value: /* e */ BeforeActiveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeActive")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeItemRemove(value: /* e */ BeforeItemRemoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeItemRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeItemRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeItemRemove")(js.undefined)
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
    def withDisabledItemIndex(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledItemIndex")(js.undefined)
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
    def withEnableTabScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTabScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTabScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTabScroll")(js.undefined)
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
    def withEnabledItemIndex(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledItemIndex")(js.undefined)
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
    def withHeaderPosition(value: String | Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderSize(value: String | Double): Self = {
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
    def withHeight(value: String | Double): Self = {
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
    def withHeightAdjustMode(value: String | HeightAdjustMode): Self = {
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
    def withHiddenItemIndex(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenItemIndex")(js.undefined)
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
    def withIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withItemActive(value: /* e */ ItemActiveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemActive")(js.undefined)
        ret
    }
    @scala.inline
    def withItemAdd(value: /* e */ ItemAddEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRemove(value: /* e */ ItemRemoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRemove")(js.undefined)
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
    def withShowReloadIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReloadIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowReloadIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReloadIcon")(js.undefined)
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
    def withWidth(value: String | Double): Self = {
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

