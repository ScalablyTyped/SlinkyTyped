package typingsSlinky.blueprintjsCore.overflowListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowListState[T] extends js.Object {
  /** Length of last overflow to dedupe `onOverflow` calls during smooth resizing. */
  var lastOverflowCount: Double = js.native
  var overflow: js.Array[T] = js.native
  var visible: js.Array[T] = js.native
}

object IOverflowListState {
  @scala.inline
  def apply[T](lastOverflowCount: Double, overflow: js.Array[T], visible: js.Array[T]): IOverflowListState[T] = {
    val __obj = js.Dynamic.literal(lastOverflowCount = lastOverflowCount.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowListState[T]]
  }
  @scala.inline
  implicit class IOverflowListStateOps[Self[t] <: IOverflowListState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withLastOverflowCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastOverflowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflow(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

