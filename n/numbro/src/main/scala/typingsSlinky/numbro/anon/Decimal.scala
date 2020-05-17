package typingsSlinky.numbro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decimal extends js.Object {
  var decimal: String = js.native
  var thousands: String = js.native
  var thousandsSize: Double = js.native
}

object Decimal {
  @scala.inline
  def apply(decimal: String, thousands: String, thousandsSize: Double): Decimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any], thousandsSize = thousandsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal]
  }
  @scala.inline
  implicit class DecimalOps[Self <: Decimal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThousands(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThousandsSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

