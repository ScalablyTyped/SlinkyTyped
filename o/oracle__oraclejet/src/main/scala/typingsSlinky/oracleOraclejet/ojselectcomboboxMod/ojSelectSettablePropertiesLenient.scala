package typingsSlinky.oracleOraclejet.ojselectcomboboxMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojSelectSettableProperties<V, SV>> */
@js.native
trait ojSelectSettablePropertiesLenient[V, SV]
  extends /* key */ StringDictionary[js.Any] {
  var describedBy: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  var help: js.UndefOr[Instruction] = js.native
  var helpHints: js.UndefOr[Definition] = js.native
  var labelHint: js.UndefOr[String] = js.native
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  var translations: js.UndefOr[js.Object] = js.native
  var valid: js.UndefOr[
    typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  var value: js.UndefOr[SV] = js.native
}

object ojSelectSettablePropertiesLenient {
  @scala.inline
  def apply[V, SV](): ojSelectSettablePropertiesLenient[V, SV] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojSelectSettablePropertiesLenient[V, SV]]
  }
  @scala.inline
  implicit class ojSelectSettablePropertiesLenientOps[Self[v, sv] <: ojSelectSettablePropertiesLenient[v, sv], V, SV] (val x: Self[V, SV]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, SV] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, SV]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, SV]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, SV]) with Other]
    @scala.inline
    def withDescribedBy(value: String): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribedBy: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayOptions(value: ConverterHint): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOptions: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHelp(value: Instruction): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpHints(value: Definition): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpHints: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpHints")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHint(value: String): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHint: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHint")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesCustom(value: js.Array[^]): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesCustom: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesCustom")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: js.Object): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: valid | pending | invalidHidden | invalidShown): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: SV): Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[V, SV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

