package typingsSlinky.atlaskitTree.mod

import typingsSlinky.reactBeautifulDnd.mod.DraggableStateSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderItemParams extends js.Object {
  var depth: Double = js.native
  var item: TreeItem = js.native
  var provided: TreeDraggableProvided = js.native
  var snapshot: DraggableStateSnapshot = js.native
  def onCollapse(itemId: ItemId): Unit = js.native
  def onExpand(itemId: ItemId): Unit = js.native
}

object RenderItemParams {
  @scala.inline
  def apply(
    depth: Double,
    item: TreeItem,
    onCollapse: ItemId => Unit,
    onExpand: ItemId => Unit,
    provided: TreeDraggableProvided,
    snapshot: DraggableStateSnapshot
  ): RenderItemParams = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction1(onCollapse), onExpand = js.Any.fromFunction1(onExpand), provided = provided.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderItemParams]
  }
  @scala.inline
  implicit class RenderItemParamsOps[Self <: RenderItemParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCollapse(value: ItemId => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnExpand(value: ItemId => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProvided(value: TreeDraggableProvided): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot(value: DraggableStateSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

