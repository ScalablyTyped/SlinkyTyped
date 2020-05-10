package typingsSlinky.jalaaliJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JalCalResult extends js.Object {
  /** Gregorian year of the beginning of Jalaali year */
  var gy: Double = js.native
  /** Number of years since the last leap year (0 to 4) */
  var leap: Double = js.native
  /** The March day of Farvardin the 1st (1st day of jy) */
  var march: Double = js.native
}

object JalCalResult {
  @scala.inline
  def apply(gy: Double, leap: Double, march: Double): JalCalResult = {
    val __obj = js.Dynamic.literal(gy = gy.asInstanceOf[js.Any], leap = leap.asInstanceOf[js.Any], march = march.asInstanceOf[js.Any])
    __obj.asInstanceOf[JalCalResult]
  }
  @scala.inline
  implicit class JalCalResultOps[Self <: JalCalResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("march")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

