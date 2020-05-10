package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAnnouncementResponse extends js.Object {
  /**
    * The identifier of the announcement.
    */
  var AnnouncementArn: js.UndefOr[Arn] = js.native
}

object SendAnnouncementResponse {
  @scala.inline
  def apply(): SendAnnouncementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAnnouncementResponse]
  }
  @scala.inline
  implicit class SendAnnouncementResponseOps[Self <: SendAnnouncementResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnouncementArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnnouncementArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnouncementArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnnouncementArn")(js.undefined)
        ret
    }
  }
  
}

