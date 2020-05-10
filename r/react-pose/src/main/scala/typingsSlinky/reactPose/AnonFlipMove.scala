package typingsSlinky.reactPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlipMove extends js.Object {
  var flipMove: Boolean = js.native
}

object AnonFlipMove {
  @scala.inline
  def apply(flipMove: Boolean): AnonFlipMove = {
    val __obj = js.Dynamic.literal(flipMove = flipMove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlipMove]
  }
  @scala.inline
  implicit class AnonFlipMoveOps[Self <: AnonFlipMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlipMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipMove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

