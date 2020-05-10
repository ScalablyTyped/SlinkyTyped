package typingsSlinky.rxjs.testMessageMod

import typingsSlinky.rxjs.notificationMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestMessage extends js.Object {
  var frame: Double = js.native
  var isGhost: js.UndefOr[Boolean] = js.native
  var notification: Notification[_] = js.native
}

object TestMessage {
  @scala.inline
  def apply(frame: Double, notification: Notification[_]): TestMessage = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMessage]
  }
  @scala.inline
  implicit class TestMessageOps[Self <: TestMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrame(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: Notification[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGhost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGhost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGhost")(js.undefined)
        ret
    }
  }
  
}

