package typingsSlinky.rcNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDuration extends js.Object {
  var duration: Double = js.native
  var style: AnonRight = js.native
  def onClose(): Unit = js.native
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, onClose: () => Unit, style: AnonRight): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
  @scala.inline
  implicit class AnonDurationOps[Self <: AnonDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyle(value: AnonRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

