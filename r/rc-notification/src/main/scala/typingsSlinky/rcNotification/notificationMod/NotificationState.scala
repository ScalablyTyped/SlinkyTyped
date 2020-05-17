package typingsSlinky.rcNotification.notificationMod

import typingsSlinky.rcNotification.anon.HolderCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationState extends js.Object {
  var notices: js.Array[HolderCallback] = js.native
}

object NotificationState {
  @scala.inline
  def apply(notices: js.Array[HolderCallback]): NotificationState = {
    val __obj = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationState]
  }
  @scala.inline
  implicit class NotificationStateOps[Self <: NotificationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotices(value: js.Array[HolderCallback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

