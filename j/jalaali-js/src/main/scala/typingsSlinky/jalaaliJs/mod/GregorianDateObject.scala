package typingsSlinky.jalaaliJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GregorianDateObject extends js.Object {
  /** Gregorian day */
  var gd: Double = js.native
  /** Gregorian month */
  var gm: Double = js.native
  /** Gregorian year */
  var gy: Double = js.native
}

object GregorianDateObject {
  @scala.inline
  def apply(gd: Double, gm: Double, gy: Double): GregorianDateObject = {
    val __obj = js.Dynamic.literal(gd = gd.asInstanceOf[js.Any], gm = gm.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GregorianDateObject]
  }
  @scala.inline
  implicit class GregorianDateObjectOps[Self <: GregorianDateObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

