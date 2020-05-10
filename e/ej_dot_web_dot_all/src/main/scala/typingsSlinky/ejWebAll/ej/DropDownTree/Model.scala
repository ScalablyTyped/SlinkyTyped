package typingsSlinky.ejWebAll.ej.DropDownTree

import typingsSlinky.ejWebAll.ej.Textmode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires the action once the DropDownTree is created.
    */
  var Create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Uses the keyboard for any action, including opening and closing the drop-down tree; navigating, expanding, and collapsing nodes of the dropdown tree; and more.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Fires the action when the DropDownTree is about to lose focus.
    */
  var blur: js.UndefOr[js.Function1[/* e */ BlurEventArgs, Unit]] = js.native
  /** Fires the action when the DropDownTree control's value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires the action when the list item checkbox value is changed.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.native
  /** Fires the action once the popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  /** Sets the root CSS class for DropDownTree that allows customization of appearance.
    * @Default {``}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled. When you enter the delimiter value, the text after the delimiter is considered as a
    * separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,), semi-colon (;), or any other special
    * character.
    * @Default {,}
    */
  var delimiter: js.UndefOr[String] = js.native
  /** Fires the action when DropDownTree is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** The enabled animation property uses the easeOutQuad animation to SlideDown and SlideUp the popup wrapper in 200 and 100 milliseconds, respectively.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to continue the DropDownTree model state in the page using applicable medium, i.e., HTML5 localStorage or cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Sets the DropDownTree textbox direction from right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Indicates whether the DropDownTree control responds to user interaction or not. By default, the control is in the enabled mode and can be disabled by setting this to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** When the enableFilterSearch is enabled, the filtering action is fired as soon as you start typing in the DropDownTree.
    */
  var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, Unit]] = js.native
  /** Fires the action when the DropDownTree is focused.
    */
  var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, Unit]] = js.native
  /** Creates footer with text or HTML elements for the dropdown items.
    * @Default {null}
    */
  var footerTemplate: js.UndefOr[String] = js.native
  /** Serves as a patch of the entries comprising the path (that is set in the entry area) of the selected node.
    * @Default {'/'}
    */
  var fullPathDelimiter: js.UndefOr[String] = js.native
  /** Creates header with text or HTML elements for the dropdown items.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /** Defines the height of the DropDownTree textbox.
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Allows you to set a particular country or regional language for the DropDownTree.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Fires the action once the popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** Customizes the height and width of the popup wrapper.
    * @Default {{height: '152px',width: 'auto',showPopupOnLoad: false}}
    */
  var popupSettings: js.UndefOr[PopupSettings] = js.native
  /** Specifies that the DropDownTree textbox values should be read-only.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Fires the action when the list of nodes in the DropDownTree is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** The DropDownTree's textbox is displayed with rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specifies the targetID for the DropDownTree's items.
    * @Default {null}
    */
  var targetID: js.UndefOr[String] = js.native
  /** Specifies the delimiter between nodes (indicating their hierarchy).
    * @Default {ej.DropDownTree.TextMode.none}
    */
  var textMode: js.UndefOr[Textmode | String] = js.native
  /** Defines the popup settings of the DropDownTree widget. You can use any property which are in treeview using this property.
    * @Default {{}}
    */
  var treeViewSettings: js.UndefOr[js.Any] = js.native
  /** Sets the jQuery validation error message in the DropDownTree.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  /** Sets the jQuery validation rules in the DropDownTree.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** Specifies the value (text content) for the DropDownTree control. For the single selection mode, the selected item's value will be returned in its data type, and for
    * MultiSelectMode, returns the selected items values separated by delimiter in string type.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
  /** Specifies a short hint that describes the expected value of the DropDownTree control.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.native
  /** Defines the width of the DropDownTree textbox.
    * @Default {100%}
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
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Create")(js.undefined)
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
    def withBlur(value: /* e */ BlurEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckChange(value: /* e */ CheckChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCheckChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChange")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: /* e */ CloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
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
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
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
    def withFiltering(value: /* e */ FilteringEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: /* e */ FocusEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFullPathDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPathDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullPathDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPathDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
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
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: /* e */ OpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupSettings(value: PopupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ SelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
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
    def withTargetID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetID")(js.undefined)
        ret
    }
    @scala.inline
    def withTextMode(value: Textmode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeViewSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeViewSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeViewSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeViewSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWatermarkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermarkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(js.undefined)
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

