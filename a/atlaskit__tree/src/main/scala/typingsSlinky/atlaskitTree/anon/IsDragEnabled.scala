package typingsSlinky.atlaskitTree.anon

import typingsSlinky.atlaskitTree.atlaskitTreeBooleans.`false`
import typingsSlinky.atlaskitTree.atlaskitTreeNumbers.`35`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsDragEnabled extends js.Object {
  var isDragEnabled: `false` = js.native
  var isNestingEnabled: `false` = js.native
  var offsetPerLevel: `35` = js.native
  var tree: Children = js.native
  def onCollapse(): Unit = js.native
  def onDragEnd(): Unit = js.native
  def onDragStart(): Unit = js.native
  def onExpand(): Unit = js.native
  def renderItem(): Unit = js.native
}

object IsDragEnabled {
  @scala.inline
  def apply(
    isDragEnabled: `false`,
    isNestingEnabled: `false`,
    offsetPerLevel: `35`,
    onCollapse: () => Unit,
    onDragEnd: () => Unit,
    onDragStart: () => Unit,
    onExpand: () => Unit,
    renderItem: () => Unit,
    tree: Children
  ): IsDragEnabled = {
    val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction0(onCollapse), onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onExpand = js.Any.fromFunction0(onExpand), renderItem = js.Any.fromFunction0(renderItem), tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDragEnabled]
  }
  @scala.inline
  implicit class IsDragEnabledOps[Self <: IsDragEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDragEnabled(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNestingEnabled(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNestingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetPerLevel(value: `35`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetPerLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCollapse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDragEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDragStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnExpand(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTree(value: Children): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

