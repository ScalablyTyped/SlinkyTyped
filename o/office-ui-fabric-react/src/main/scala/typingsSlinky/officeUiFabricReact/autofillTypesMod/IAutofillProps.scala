package typingsSlinky.officeUiFabricReact.autofillTypesMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.autofillAutofillMod.Autofill
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutofillProps extends InputHTMLAttributes[HTMLInputElement | Autofill] {
  /**
    * Gets the compoonent ref.
    */
  var componentRef: js.UndefOr[IRefObject[IAutofill]] = js.native
  /**
    * The default value to be visible. This is different from placeholder
    * because it actually sets the current value of the picker
    * Note: This will only be set upon component creation
    * and will not update with subsequent prop updates.
    */
  var defaultVisibleValue: js.UndefOr[String] = js.native
  /**
    * When the user uses left arrow, right arrow, clicks, or deletes text autofill is disabled
    * Since the user has taken control. It is automatically reenabled when the user enters text and the
    * cursor is at the end of the text in the input box. This specifies other key presses that will reenabled
    * autofill.
    * @defaultvalue [KeyCodes.down, KeyCodes.up]
    */
  var enableAutofillOnKeyPress: js.UndefOr[js.Array[KeyCodes]] = js.native
  /**
    * A callback used to modify the input string.
    *
    * @param composing - true if the change event was triggered while the
    * inner input was in the middle of a multi-character composition.
    * (for example, jp-hiragana IME input)
    */
  var onInputChange: js.UndefOr[js.Function2[/* value */ String, /* composing */ Boolean, String]] = js.native
  /**
    * A callback for when the current input value changes.
    *
    * @param composing - true if the change event was triggered while the
    * inner input was in the middle of a multi-character composition.
    * (for example, jp-hiragana IME input)
    */
  var onInputValueChange: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[String], /* composing */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /**
    * Should the value of the input be selected? True if we're focused on our input, false otherwise.
    * We need to explicitly not select the text in the autofill if we are no longer focused.
    * In IE11, selecting a input will also focus the input, causing other element's focus to be stolen.
    */
  var preventValueSelection: js.UndefOr[Boolean] = js.native
  /**
    * Handler for checking if the full value of the input should
    * be seleced in componentDidUpdate
    *
    * @returns - should the full value of the input be selected?
    */
  var shouldSelectFullInputValueInComponentDidUpdate: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * The suggested autofill value that will display.
    */
  var suggestedDisplayValue: js.UndefOr[String] = js.native
  /**
    * Handler for checking and updating the value if needed
    * in componentWillReceiveProps
    *
    * @returns - the updated value to set, if needed
    */
  var updateValueInWillReceiveProps: js.UndefOr[js.Function0[String | Null]] = js.native
}

object IAutofillProps {
  @scala.inline
  def apply(): IAutofillProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAutofillProps]
  }
  @scala.inline
  implicit class IAutofillPropsOps[Self <: IAutofillProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IAutofill | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IAutofill]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IAutofill]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultVisibleValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVisibleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVisibleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVisibleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutofillOnKeyPress(value: js.Array[KeyCodes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutofillOnKeyPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutofillOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutofillOnKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputChange(value: (/* value */ String, /* composing */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInputChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputValueChange(value: (/* newValue */ js.UndefOr[String], /* composing */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputValueChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInputValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventValueSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventValueSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventValueSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventValueSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldSelectFullInputValueInComponentDidUpdate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSelectFullInputValueInComponentDidUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShouldSelectFullInputValueInComponentDidUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSelectFullInputValueInComponentDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDisplayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedDisplayValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDisplayValue")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateValueInWillReceiveProps(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateValueInWillReceiveProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdateValueInWillReceiveProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateValueInWillReceiveProps")(js.undefined)
        ret
    }
  }
  
}

