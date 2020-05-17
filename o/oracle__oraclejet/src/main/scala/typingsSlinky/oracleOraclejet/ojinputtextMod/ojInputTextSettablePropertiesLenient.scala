package typingsSlinky.oracleOraclejet.ojinputtextMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.Regexp
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.always
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.conditional
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.email
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.never
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.number
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.search
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.text
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.url
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties> */
@js.native
trait ojInputTextSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[_]]] = js.native
  var autocomplete: js.UndefOr[on | off | String] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var clearIcon: js.UndefOr[never | always | conditional] = js.native
  var converter: js.UndefOr[Converter[_] | RegisteredConverter] = js.native
  var describedBy: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  var help: js.UndefOr[Instruction] = js.native
  var helpHints: js.UndefOr[Definition] = js.native
  var labelHint: js.UndefOr[String] = js.native
  var list: js.UndefOr[String] = js.native
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var rawValue: js.UndefOr[js.Any] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var translations: js.UndefOr[Regexp] = js.native
  var valid: js.UndefOr[
    typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  var validators: js.UndefOr[js.Array[Validator[_] | RegisteredValidator]] = js.native
  var value: js.UndefOr[js.Any] = js.native
  var virtualKeyboard: js.UndefOr[auto | email | number | search | tel | text | url] = js.native
}

object ojInputTextSettablePropertiesLenient {
  @scala.inline
  def apply(): ojInputTextSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojInputTextSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojInputTextSettablePropertiesLenientOps[Self <: ojInputTextSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncValidators(value: js.Array[AsyncValidator[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocomplete(value: on | off | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withClearIcon(value: never | always | conditional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withConverter(value: Converter[_] | RegisteredConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(js.undefined)
        ret
    }
    @scala.inline
    def withDescribedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayOptions(value: ConverterHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHelp(value: Instruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpHints(value: Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpHints")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHint")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesCustom(value: js.Array[^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesCustom")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withRawValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: Regexp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: valid | pending | invalidHidden | invalidShown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[Validator[_] | RegisteredValidator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
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
    def withVirtualKeyboard(value: auto | email | number | search | tel | text | url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualKeyboard")(js.undefined)
        ret
    }
  }
  
}

