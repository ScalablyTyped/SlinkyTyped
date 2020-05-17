package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficControl extends js.Object {
  def hide(): Unit = js.native
  def setPanelOffset(offset: Size): Unit = js.native
  def show(): Unit = js.native
}

object TrafficControl {
  @scala.inline
  def apply(hide: () => Unit, setPanelOffset: Size => Unit, show: () => Unit): TrafficControl = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), setPanelOffset = js.Any.fromFunction1(setPanelOffset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[TrafficControl]
  }
  @scala.inline
  implicit class TrafficControlOps[Self <: TrafficControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPanelOffset(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPanelOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

