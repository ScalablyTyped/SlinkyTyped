package typingsSlinky.momentHijri.mod.momentAugmentingMod.iConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GregorianResult extends js.Object {
  var gd: Double = js.native
  var gm: Double = js.native
  var gy: Double = js.native
}

object GregorianResult {
  @scala.inline
  def apply(gd: Double, gm: Double, gy: Double): GregorianResult = {
    val __obj = js.Dynamic.literal(gd = gd.asInstanceOf[js.Any], gm = gm.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GregorianResult]
  }
  @scala.inline
  implicit class GregorianResultOps[Self <: GregorianResult] (val x: Self) extends AnyVal {
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

