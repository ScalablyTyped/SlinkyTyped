package typingsSlinky.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTarget extends js.Object {
  var dropTarget: js.UndefOr[Boolean] = js.native
}

object DropTarget {
  @scala.inline
  def apply(): DropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTarget]
  }
  @scala.inline
  implicit class DropTargetOps[Self <: DropTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(js.undefined)
        ret
    }
  }
  
}

