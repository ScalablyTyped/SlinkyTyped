package typingsSlinky.firebaseMessaging.messagePayloadMod

import typingsSlinky.std.NotificationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationDetails extends NotificationOptions {
  var click_action: js.UndefOr[String] = js.native
  var title: String = js.native
}

object NotificationDetails {
  @scala.inline
  def apply(title: String): NotificationDetails = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDetails]
  }
  @scala.inline
  implicit class NotificationDetailsOps[Self <: NotificationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick_action(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click_action")(js.undefined)
        ret
    }
  }
  
}

