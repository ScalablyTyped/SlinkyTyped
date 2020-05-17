package typingsSlinky.oracleOraclejet.ojcheckboxsetMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.Required
import typingsSlinky.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionContext
import typingsSlinky.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionsKeys
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcheckboxset.ojCheckboxsetSettableProperties<K, D>> */
@js.native
trait ojCheckboxsetSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var describedBy: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  var help: js.UndefOr[Instruction] = js.native
  var helpHints: js.UndefOr[Definition] = js.native
  var labelHint: js.UndefOr[String] = js.native
  var labelledBy: js.UndefOr[String] = js.native
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  var optionRenderer: js.UndefOr[js.Function1[/* param0 */ OptionContext[D], Element]] = js.native
  var options: js.UndefOr[DataProvider[K, D]] = js.native
  var optionsKeys: js.UndefOr[OptionsKeys] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var translations: js.UndefOr[Required] = js.native
  var valid: js.UndefOr[
    typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  var value: js.UndefOr[js.Array[_]] = js.native
}

object ojCheckboxsetSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojCheckboxsetSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojCheckboxsetSettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojCheckboxsetSettablePropertiesLenientOps[Self[k, d] <: ojCheckboxsetSettablePropertiesLenient[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withDescribedBy(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribedBy: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayOptions(value: ConverterHint): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOptions: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHelp(value: Instruction): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpHints(value: Definition): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpHints: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpHints")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHint(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHint: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHint")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelledBy(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelledBy: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesCustom(value: js.Array[^]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesCustom: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesCustom")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionRenderer(value: /* param0 */ OptionContext[D] => Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOptionRenderer: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsKeys(value: OptionsKeys): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsKeys: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: Required): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: valid | pending | invalidHidden | invalidShown): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[_]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

