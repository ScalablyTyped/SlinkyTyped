package typingsSlinky.androiduix.androidui.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverScrollLocker extends js.Object {
  def getScrollContentBottom(): Double = js.native
  def lockOverScrollBottom(lockBottom: Double): Unit = js.native
  def lockOverScrollTop(lockTop: Double): Unit = js.native
}

object OverScrollLocker {
  @scala.inline
  def apply(
    getScrollContentBottom: () => Double,
    lockOverScrollBottom: Double => Unit,
    lockOverScrollTop: Double => Unit
  ): OverScrollLocker = {
    val __obj = js.Dynamic.literal(getScrollContentBottom = js.Any.fromFunction0(getScrollContentBottom), lockOverScrollBottom = js.Any.fromFunction1(lockOverScrollBottom), lockOverScrollTop = js.Any.fromFunction1(lockOverScrollTop))
    __obj.asInstanceOf[OverScrollLocker]
  }
  @scala.inline
  implicit class OverScrollLockerOps[Self <: OverScrollLocker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetScrollContentBottom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollContentBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLockOverScrollBottom(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockOverScrollBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLockOverScrollTop(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockOverScrollTop")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

