package typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePane extends js.Object {
  /** Triggers a layout update for the pane. */
  def forceLayoutUpdate(): Unit = js.native
  /** Gets the current scroll position of the scrollable pane */
  def getScrollPosition(): Double = js.native
}

object IScrollablePane {
  @scala.inline
  def apply(forceLayoutUpdate: () => Unit, getScrollPosition: () => Double): IScrollablePane = {
    val __obj = js.Dynamic.literal(forceLayoutUpdate = js.Any.fromFunction0(forceLayoutUpdate), getScrollPosition = js.Any.fromFunction0(getScrollPosition))
    __obj.asInstanceOf[IScrollablePane]
  }
  @scala.inline
  implicit class IScrollablePaneOps[Self <: IScrollablePane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceLayoutUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceLayoutUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScrollPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollPosition")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

