package typingsSlinky.ionicCore.anon

import typingsSlinky.ionicCore.rangeInterfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lower extends RangeValue {
  var lower: Double = js.native
  var upper: Double = js.native
}

object Lower {
  @scala.inline
  def apply(lower: Double, upper: Double): Lower = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lower]
  }
  @scala.inline
  implicit class LowerOps[Self <: Lower] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpper(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

