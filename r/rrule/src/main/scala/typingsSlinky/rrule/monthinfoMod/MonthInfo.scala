package typingsSlinky.rrule.monthinfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthInfo extends js.Object {
  var lastmonth: Double = js.native
  var lastyear: Double = js.native
  var nwdaymask: js.Array[Double] = js.native
}

object MonthInfo {
  @scala.inline
  def apply(lastmonth: Double, lastyear: Double, nwdaymask: js.Array[Double]): MonthInfo = {
    val __obj = js.Dynamic.literal(lastmonth = lastmonth.asInstanceOf[js.Any], lastyear = lastyear.asInstanceOf[js.Any], nwdaymask = nwdaymask.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthInfo]
  }
  @scala.inline
  implicit class MonthInfoOps[Self <: MonthInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastmonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastmonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastyear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastyear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNwdaymask(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nwdaymask")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

