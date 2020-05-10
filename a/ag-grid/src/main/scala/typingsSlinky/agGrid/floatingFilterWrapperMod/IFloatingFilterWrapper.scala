package typingsSlinky.agGrid.floatingFilterWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloatingFilterWrapper[M] extends js.Object {
  def onParentModelChanged(parentModel: M): Unit = js.native
}

object IFloatingFilterWrapper {
  @scala.inline
  def apply[M](onParentModelChanged: M => Unit): IFloatingFilterWrapper[M] = {
    val __obj = js.Dynamic.literal(onParentModelChanged = js.Any.fromFunction1(onParentModelChanged))
    __obj.asInstanceOf[IFloatingFilterWrapper[M]]
  }
  @scala.inline
  implicit class IFloatingFilterWrapperOps[Self[m] <: IFloatingFilterWrapper[m], M] (val x: Self[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[M] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[M] with Other]
    @scala.inline
    def withOnParentModelChanged(value: M => Unit): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onParentModelChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

