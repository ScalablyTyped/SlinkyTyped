package typingsSlinky.blueprintjsCore.handleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHandleState extends js.Object {
  /** whether slider handle is currently being dragged */
  var isMoving: js.UndefOr[Boolean] = js.native
}

object IHandleState {
  @scala.inline
  def apply(): IHandleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHandleState]
  }
  @scala.inline
  implicit class IHandleStateOps[Self <: IHandleState] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutIsMoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMoving")(js.undefined)
        ret
    }
  }
  
}

