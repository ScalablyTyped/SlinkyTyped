package typingsSlinky.rmcAlign.anon

import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled extends js.Object {
  var disabled: Boolean = js.native
  var monitorBufferTime: Double = js.native
  var monitorWindowResize: Boolean = js.native
  def onAlign(): Unit = js.native
  def target(): Window = js.native
}

object Disabled {
  @scala.inline
  def apply(
    disabled: Boolean,
    monitorBufferTime: Double,
    monitorWindowResize: Boolean,
    onAlign: () => Unit,
    target: () => Window
  ): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], monitorBufferTime = monitorBufferTime.asInstanceOf[js.Any], monitorWindowResize = monitorWindowResize.asInstanceOf[js.Any], onAlign = js.Any.fromFunction0(onAlign), target = js.Any.fromFunction0(target))
    __obj.asInstanceOf[Disabled]
  }
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitorBufferTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorBufferTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitorWindowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorWindowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAlign(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: () => Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

