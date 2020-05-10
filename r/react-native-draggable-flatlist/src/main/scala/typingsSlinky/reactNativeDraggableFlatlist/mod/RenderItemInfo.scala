package typingsSlinky.reactNativeDraggableFlatlist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderItemInfo[ItemR] extends js.Object {
  var index: Double = js.native
  var isActive: Boolean = js.native
  var item: ItemR = js.native
  def move(): Unit = js.native
  def moveEnd(): Unit = js.native
}

object RenderItemInfo {
  @scala.inline
  def apply[ItemR](index: Double, isActive: Boolean, item: ItemR, move: () => Unit, moveEnd: () => Unit): RenderItemInfo[ItemR] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], move = js.Any.fromFunction0(move), moveEnd = js.Any.fromFunction0(moveEnd))
    __obj.asInstanceOf[RenderItemInfo[ItemR]]
  }
  @scala.inline
  implicit class RenderItemInfoOps[Self[itemr] <: RenderItemInfo[itemr], ItemR] (val x: Self[ItemR]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemR] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemR]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemR] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemR] with Other]
    @scala.inline
    def withIndex(value: Double): Self[ItemR] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self[ItemR] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: ItemR): Self[ItemR] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove(value: () => Unit): Self[ItemR] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveEnd(value: () => Unit): Self[ItemR] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveEnd")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

