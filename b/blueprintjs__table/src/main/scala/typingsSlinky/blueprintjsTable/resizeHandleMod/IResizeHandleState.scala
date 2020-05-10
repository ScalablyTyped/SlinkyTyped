package typingsSlinky.blueprintjsTable.resizeHandleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeHandleState extends js.Object {
  /**
    * A boolean that is true while the user is dragging the resize handle
    */
  var isDragging: Boolean = js.native
}

object IResizeHandleState {
  @scala.inline
  def apply(isDragging: Boolean): IResizeHandleState = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeHandleState]
  }
  @scala.inline
  implicit class IResizeHandleStateOps[Self <: IResizeHandleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

