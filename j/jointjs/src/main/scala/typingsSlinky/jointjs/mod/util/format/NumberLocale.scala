package typingsSlinky.jointjs.mod.util.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberLocale extends js.Object {
  var currency: js.Tuple2[String, String] = js.native
  var decimal: String = js.native
  var grouping: js.Array[Double] = js.native
  var thousands: String = js.native
}

object NumberLocale {
  @scala.inline
  def apply(
    currency: js.Tuple2[String, String],
    decimal: String,
    grouping: js.Array[Double],
    thousands: String
  ): NumberLocale = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLocale]
  }
  @scala.inline
  implicit class NumberLocaleOps[Self <: NumberLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrouping(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThousands(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousands")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

