package typingsSlinky.formatjsIntlUtils.numberTypesMod

import typingsSlinky.formatjsIntlUtils.RecordDecimalFormatNumLDM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawCurrencyData extends js.Object {
  var accounting: String = js.native
  var currencySpacing: CurrencySpacingData = js.native
  var short: js.UndefOr[RecordDecimalFormatNumLDM] = js.native
  var standard: String = js.native
  var unitPattern: String = js.native
}

object RawCurrencyData {
  @scala.inline
  def apply(accounting: String, currencySpacing: CurrencySpacingData, standard: String, unitPattern: String): RawCurrencyData = {
    val __obj = js.Dynamic.literal(accounting = accounting.asInstanceOf[js.Any], currencySpacing = currencySpacing.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], unitPattern = unitPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawCurrencyData]
  }
  @scala.inline
  implicit class RawCurrencyDataOps[Self <: RawCurrencyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencySpacing(value: CurrencySpacingData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: RecordDecimalFormatNumLDM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(js.undefined)
        ret
    }
  }
  
}

