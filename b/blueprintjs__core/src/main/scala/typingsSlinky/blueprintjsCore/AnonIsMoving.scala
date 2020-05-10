package typingsSlinky.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsMoving extends js.Object {
  var isMoving: Boolean = js.native
}

object AnonIsMoving {
  @scala.inline
  def apply(isMoving: Boolean): AnonIsMoving = {
    val __obj = js.Dynamic.literal(isMoving = isMoving.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsMoving]
  }
  @scala.inline
  implicit class AnonIsMovingOps[Self <: AnonIsMoving] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMoving(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMoving")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

