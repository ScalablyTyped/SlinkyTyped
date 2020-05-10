package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSelectInfo extends js.Object {
  var qMeasure: String = js.native
  var qRangeHi: Double = js.native
  var qRangeLo: Double = js.native
}

object RangeSelectInfo {
  @scala.inline
  def apply(qMeasure: String, qRangeHi: Double, qRangeLo: Double): RangeSelectInfo = {
    val __obj = js.Dynamic.literal(qMeasure = qMeasure.asInstanceOf[js.Any], qRangeHi = qRangeHi.asInstanceOf[js.Any], qRangeLo = qRangeLo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectInfo]
  }
  @scala.inline
  implicit class RangeSelectInfoOps[Self <: RangeSelectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQMeasure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeasure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRangeHi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRangeHi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRangeLo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRangeLo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

