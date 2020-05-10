package typingsSlinky.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDestinationPosition extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var parentId: ItemId = js.native
}

object TreeDestinationPosition {
  @scala.inline
  def apply(parentId: ItemId): TreeDestinationPosition = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDestinationPosition]
  }
  @scala.inline
  implicit class TreeDestinationPositionOps[Self <: TreeDestinationPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentId(value: ItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

