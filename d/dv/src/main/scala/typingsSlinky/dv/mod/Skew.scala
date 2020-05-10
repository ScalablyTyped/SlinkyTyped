package typingsSlinky.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Skew extends js.Object {
  var angle: Double = js.native
  var confidence: Double = js.native
}

object Skew {
  @scala.inline
  def apply(angle: Double, confidence: Double): Skew = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skew]
  }
  @scala.inline
  implicit class SkewOps[Self <: Skew] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

