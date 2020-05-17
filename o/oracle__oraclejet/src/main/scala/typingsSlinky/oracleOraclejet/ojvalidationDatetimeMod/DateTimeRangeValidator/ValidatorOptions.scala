package typingsSlinky.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator

import typingsSlinky.oracleOraclejet.anon.Min
import typingsSlinky.oracleOraclejet.anon.RangeOverflowRangeUnderflow
import typingsSlinky.oracleOraclejet.ojvalidationDatetimeMod.DateTimeConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ValidatorOptions extends js.Object {
  var converter: DateTimeConverter = js.native
  var hint: js.UndefOr[Min] = js.native
  var max: js.UndefOr[String] = js.native
  var messageDetail: js.UndefOr[RangeOverflowRangeUnderflow] = js.native
  var messageSummary: js.UndefOr[RangeOverflowRangeUnderflow] = js.native
  var min: js.UndefOr[String] = js.native
  var translationKey: js.UndefOr[String] = js.native
}

object ValidatorOptions {
  @scala.inline
  def apply(converter: DateTimeConverter): ValidatorOptions = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
  @scala.inline
  implicit class ValidatorOptionsOps[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverter(value: DateTimeConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHint(value: Min): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageDetail(value: RangeOverflowRangeUnderflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageSummary(value: RangeOverflowRangeUnderflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslationKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationKey")(js.undefined)
        ret
    }
  }
  
}

