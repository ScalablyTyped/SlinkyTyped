package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxiFareDetail extends js.Object {
  var initialFare: Double = js.native
  var totalFare: Double = js.native
  var unitFare: Double = js.native
}

object TaxiFareDetail {
  @scala.inline
  def apply(initialFare: Double, totalFare: Double, unitFare: Double): TaxiFareDetail = {
    val __obj = js.Dynamic.literal(initialFare = initialFare.asInstanceOf[js.Any], totalFare = totalFare.asInstanceOf[js.Any], unitFare = unitFare.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaxiFareDetail]
  }
  @scala.inline
  implicit class TaxiFareDetailOps[Self <: TaxiFareDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialFare(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalFare(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitFare(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitFare")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

