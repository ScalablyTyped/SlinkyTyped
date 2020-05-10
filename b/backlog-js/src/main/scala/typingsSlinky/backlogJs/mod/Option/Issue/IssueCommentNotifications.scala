package typingsSlinky.backlogJs.mod.Option.Issue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueCommentNotifications extends js.Object {
  var notifiedUserId: js.Array[Double] = js.native
}

object IssueCommentNotifications {
  @scala.inline
  def apply(notifiedUserId: js.Array[Double]): IssueCommentNotifications = {
    val __obj = js.Dynamic.literal(notifiedUserId = notifiedUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueCommentNotifications]
  }
  @scala.inline
  implicit class IssueCommentNotificationsOps[Self <: IssueCommentNotifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifiedUserId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifiedUserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

