package typingsSlinky.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotificationId extends js.Object {
  var notificationId: String = js.native
}

object AnonNotificationId {
  @scala.inline
  def apply(notificationId: String): AnonNotificationId = {
    val __obj = js.Dynamic.literal(notificationId = notificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotificationId]
  }
  @scala.inline
  implicit class AnonNotificationIdOps[Self <: AnonNotificationId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

