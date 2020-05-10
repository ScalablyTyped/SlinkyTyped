package typingsSlinky.accounting.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencySettings[TFormat] extends js.Object {
      // controls output: %s = symbol, %v = value/number
  var decimal: js.UndefOr[String] = js.native
       // default currency symbol is '$'
  var format: js.UndefOr[TFormat] = js.native
     // thousands separator
  var precision: js.UndefOr[Double] = js.native
  var symbol: js.UndefOr[String] = js.native
      // decimal point separator
  var thousand: js.UndefOr[String] = js.native
}

object CurrencySettings {
  @scala.inline
  def apply[TFormat](): CurrencySettings[TFormat] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencySettings[TFormat]]
  }
  @scala.inline
  implicit class CurrencySettingsOps[Self[tformat] <: CurrencySettings[tformat], TFormat] (val x: Self[TFormat]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TFormat] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TFormat]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TFormat] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TFormat] with Other]
    @scala.inline
    def withDecimal(value: String): Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimal: Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: TFormat): Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: String): Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withThousand(value: String): Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousand: Self[TFormat] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousand")(js.undefined)
        ret
    }
  }
  
}

