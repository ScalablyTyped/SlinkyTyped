package typingsSlinky.osrsJsonApi.mod.ge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrendPriceObject extends js.Object {
  var price: Double = js.native
  var trend: String = js.native
}

object TrendPriceObject {
  @scala.inline
  def apply(price: Double, trend: String): TrendPriceObject = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], trend = trend.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendPriceObject]
  }
  @scala.inline
  implicit class TrendPriceObjectOps[Self <: TrendPriceObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

