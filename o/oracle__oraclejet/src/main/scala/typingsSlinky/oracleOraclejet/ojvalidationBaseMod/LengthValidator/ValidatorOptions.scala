package typingsSlinky.oracleOraclejet.ojvalidationBaseMod.LengthValidator

import typingsSlinky.oracleOraclejet.anon.Max
import typingsSlinky.oracleOraclejet.anon.TooLong
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.codePoint
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.codeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ValidatorOptions extends js.Object {
  var countBy: js.UndefOr[codeUnit | codePoint] = js.native
  var hint: js.UndefOr[Max] = js.native
  var max: js.UndefOr[Double] = js.native
  var messageDetail: js.UndefOr[TooLong] = js.native
  var messageSummary: js.UndefOr[TooLong] = js.native
  var min: js.UndefOr[Double] = js.native
}

object ValidatorOptions {
  @scala.inline
  def apply(): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatorOptions]
  }
  @scala.inline
  implicit class ValidatorOptionsOps[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountBy(value: codeUnit | codePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countBy")(js.undefined)
        ret
    }
    @scala.inline
    def withHint(value: Max): Self = {
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
    def withMax(value: Double): Self = {
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
    def withMessageDetail(value: TooLong): Self = {
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
    def withMessageSummary(value: TooLong): Self = {
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
    def withMin(value: Double): Self = {
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
  }
  
}

