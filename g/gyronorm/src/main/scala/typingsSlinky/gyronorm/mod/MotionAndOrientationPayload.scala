package typingsSlinky.gyronorm.mod

import typingsSlinky.gyronorm.AnonAbsolute
import typingsSlinky.gyronorm.AnonAlpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotionAndOrientationPayload extends js.Object {
  var dm: AnonAlpha = js.native
  var `do`: AnonAbsolute = js.native
}

object MotionAndOrientationPayload {
  @scala.inline
  def apply(dm: AnonAlpha, `do`: AnonAbsolute): MotionAndOrientationPayload = {
    val __obj = js.Dynamic.literal(dm = dm.asInstanceOf[js.Any])
    __obj.updateDynamic("do")(`do`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionAndOrientationPayload]
  }
  @scala.inline
  implicit class MotionAndOrientationPayloadOps[Self <: MotionAndOrientationPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDm(value: AnonAlpha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDo(value: AnonAbsolute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("do")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

