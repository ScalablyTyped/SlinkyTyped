package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLower extends js.Object {
  var lower: Double = js.native
  var upper: Double = js.native
}

object AnonLower {
  @scala.inline
  def apply(lower: Double, upper: Double): AnonLower = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLower]
  }
  @scala.inline
  implicit class AnonLowerOps[Self <: AnonLower] (val x: Self) extends AnyVal {
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

