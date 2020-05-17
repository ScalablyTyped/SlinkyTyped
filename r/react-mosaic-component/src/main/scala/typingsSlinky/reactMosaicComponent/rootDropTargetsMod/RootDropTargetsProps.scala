package typingsSlinky.reactMosaicComponent.rootDropTargetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootDropTargetsProps extends js.Object {
  var isDragging: Boolean = js.native
}

object RootDropTargetsProps {
  @scala.inline
  def apply(isDragging: Boolean): RootDropTargetsProps = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootDropTargetsProps]
  }
  @scala.inline
  implicit class RootDropTargetsPropsOps[Self <: RootDropTargetsProps] (val x: Self) extends AnyVal {
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

