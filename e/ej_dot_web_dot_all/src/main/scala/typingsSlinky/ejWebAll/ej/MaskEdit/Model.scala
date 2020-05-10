package typingsSlinky.ejWebAll.ej.MaskEdit

import typingsSlinky.ejWebAll.ej.InputMode
import typingsSlinky.ejWebAll.ej.TextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires when value changed in mask edit textbox control.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires after MaskEdit control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the cssClass to achieve custom theme.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Specify the custom character allowed to entered in mask edit textbox control.
    * @Default {null}
    */
  var customCharacter: js.UndefOr[String] = js.native
  /** Fires when the MaskEdit is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specify the enablePersistence to mask edit textbox to save current model value to browser cookies for state maintains.
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Specify the state of the mask edit textbox control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Fires when focused in mask edit textbox control.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  /** Fires when focused out in mask edit textbox control.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  /** Specifies the height for the mask edit textbox control.
    * @Default {28 px}
    */
  var height: js.UndefOr[String] = js.native
  /** Specifies whether hide the prompt characters with spaces on blur. Prompt chars will be shown again on focus the textbox.
    * @Default {false}
    */
  var hidePromptOnLeave: js.UndefOr[Boolean] = js.native
  /** Specifies the list of HTML attributes to be added to mask edit textbox.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Specify the inputMode for mask edit textbox control. See InputMode
    * @Default {ej.InputMode.Text}
    */
  var inputMode: js.UndefOr[InputMode | String] = js.native
  /** Fires when key press in mask edit textbox control.
    */
  var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, Unit]] = js.native
  /** Fires when keyup in mask edit textbox control.
    */
  var keyUp: js.UndefOr[js.Function1[/* e */ KeyUpEventArgs, Unit]] = js.native
  /** Defines the localization culture for MaskEdit.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the input mask.
    * @Default {null}
    */
  var maskFormat: js.UndefOr[String] = js.native
  /** Fires when mouse out in mask edit textbox control.
    */
  var mouseOut: js.UndefOr[js.Function1[/* e */ MouseOutEventArgs, Unit]] = js.native
  /** Fires when mouse over in mask edit textbox control.
    */
  var mouseOver: js.UndefOr[js.Function1[/* e */ MouseOverEventArgs, Unit]] = js.native
  /** Specifies the name attribute value for the mask edit textbox.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.native
  /** Fires when keydown in mask edit textbox control.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ OnKeyDownEventArgs, Unit]] = js.native
  /** Toggles the readonly state of the mask edit textbox. When the mask edit textbox is readonly, it doesn't allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Specifies whether the error will show until correct value entered in the mask edit textbox control.
    * @Default {false}
    */
  var showError: js.UndefOr[Boolean] = js.native
  /** when showPromptChar is true, the hide the prompt characters are shown in focus of the control and hides in focus out of the control.
    * @Default {true}
    */
  var showPromptChar: js.UndefOr[Boolean] = js.native
  /** MaskEdit input is displayed in rounded corner style when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specify the text alignment for mask edit textbox control.See TextAlign
    * @Default {left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  /** Sets the jQuery validation error message in mask edit. This property works when the widget is present inside the form. Include jquery.validate.min.js plugin additionally.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  /** Sets the jQuery validation rules to the MaskEdit. This property works when the widget is present inside the form. Include jquery.validate.min.js plugin additionally.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** Specifies the value for the mask edit textbox control.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
  /** Specifies the water mark text to be displayed in input text.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.native
  /** Specifies the width for the mask edit textbox control.
    * @Default {143pixel}
    */
  var width: js.UndefOr[String] = js.native
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
    def withCustomCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCharacter")(js.undefined)
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
    def withFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
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
    def withHidePromptOnLeave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePromptOnLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePromptOnLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePromptOnLeave")(js.undefined)
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
    def withInputMode(value: InputMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPress(value: /* e */ KeyPressEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyUp(value: /* e */ KeyUpEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUp")(js.undefined)
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
    def withMaskFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOut(value: /* e */ MouseOutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOver(value: /* e */ MouseOverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ OnKeyDownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
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
    def withShowError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPromptChar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPromptChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPromptChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPromptChar")(js.undefined)
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
    def withTextAlign(value: TextAlign | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
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
    def withWidth(value: String): Self = {
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

