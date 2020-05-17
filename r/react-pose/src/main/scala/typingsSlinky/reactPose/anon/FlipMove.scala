package typingsSlinky.reactPose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipMove extends js.Object {
  var flipMove: Boolean = js.native
}

object FlipMove {
  @scala.inline
  def apply(flipMove: Boolean): FlipMove = {
    val __obj = js.Dynamic.literal(flipMove = flipMove.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipMove]
  }
  @scala.inline
  implicit class FlipMoveOps[Self <: FlipMove] (val x: Self) extends AnyVal {
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

