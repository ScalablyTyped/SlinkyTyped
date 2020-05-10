package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonElementEventJQueryEvent
import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.clear
import typingsSlinky.devextreme.devextremeStrings.filled
import typingsSlinky.devextreme.devextremeStrings.onFocus
import typingsSlinky.devextreme.devextremeStrings.outlined
import typingsSlinky.devextreme.devextremeStrings.underlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTextEditorOptions[T] extends EditorOptions[T] {
  /** Allows you to add custom buttons to the input text field. */
  var buttons: js.UndefOr[js.Array[String | clear | dxTextEditorButton]] = js.native
  /** Specifies the attributes to be passed on to the underlying HTML element. */
  var inputAttr: js.UndefOr[js.Any] = js.native
  /** The editor mask that specifies the custom format of the entered string. */
  var mask: js.UndefOr[String] = js.native
  /** Specifies a mask placeholder. A single character is recommended. */
  var maskChar: js.UndefOr[String] = js.native
  /** A message displayed when the entered text does not match the specified pattern. */
  var maskInvalidMessage: js.UndefOr[String] = js.native
  /** Specifies custom mask rules. */
  var maskRules: js.UndefOr[js.Any] = js.native
  /** The value to be assigned to the `name` attribute of the underlying HTML element. */
  var name: js.UndefOr[String] = js.native
  /** A function that is executed when the widget loses focus after the text field's content was changed using the keyboard. */
  var onChange: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed when the widget's input has been copied. */
  var onCopy: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed when the widget's input has been cut. */
  var onCut: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed when the Enter key has been pressed while the widget is focused. */
  var onEnterKey: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed when the widget gets focus. */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed when the widget loses focus. */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed each time the widget's input is changed while the widget is focused. */
  var onInput: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed when a user is pressing a key on the keyboard. */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed when a user presses a key on the keyboard. */
  var onKeyPress: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed when a user releases a key on the keyboard. */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** A function that is executed when the widget's input has been pasted. */
  var onPaste: js.UndefOr[js.Function1[/* e */ AnonElementEventJQueryEvent[T], _]] = js.native
  /** The text displayed by the widget when the widget value is empty. */
  var placeholder: js.UndefOr[String] = js.native
  /** Specifies whether to display the Clear button in the widget. */
  var showClearButton: js.UndefOr[Boolean] = js.native
  /** Specifies when the widget shows the mask. Applies only if useMaskedValue is true. */
  var showMaskMode: js.UndefOr[always | onFocus] = js.native
  /** Specifies whether or not the widget checks the inner text for spelling mistakes. */
  var spellcheck: js.UndefOr[Boolean] = js.native
  /** Specifies how the widget's text field is styled. */
  var stylingMode: js.UndefOr[outlined | underlined | filled] = js.native
  /** The read-only option that holds the text displayed by the widget input element. */
  var text: js.UndefOr[String] = js.native
  /** Specifies whether the value should contain mask characters or not. */
  var useMaskedValue: js.UndefOr[Boolean] = js.native
  /** Specifies the DOM events after which the widget's value should be updated. */
  var valueChangeEvent: js.UndefOr[String] = js.native
}

object dxTextEditorOptions {
  @scala.inline
  def apply[T](): dxTextEditorOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextEditorOptions[T]]
  }
  @scala.inline
  implicit class dxTextEditorOptionsOps[Self[t] <: dxTextEditorOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withButtons(value: js.Array[String | clear | dxTextEditorButton]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withInputAttr(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAttr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskChar(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskChar: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskInvalidMessage(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskInvalidMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskInvalidMessage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskInvalidMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskRules(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskRules: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskRules")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCut(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCut: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnterKey(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnterKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusIn(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusIn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusOut(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusOut: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: /* e */ AnonElementEventJQueryEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaste: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClearButton(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClearButton: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMaskMode(value: always | onFocus): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMaskMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaskMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellcheck(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withStylingMode(value: outlined | underlined | filled): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylingMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMaskedValue(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaskedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMaskedValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaskedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValueChangeEvent(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueChangeEvent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChangeEvent")(js.undefined)
        ret
    }
  }
  
}

