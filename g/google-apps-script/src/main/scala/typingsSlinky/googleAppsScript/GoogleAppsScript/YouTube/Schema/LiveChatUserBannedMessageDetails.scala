package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatUserBannedMessageDetails extends js.Object {
  var banDurationSeconds: js.UndefOr[String] = js.native
  var banType: js.UndefOr[String] = js.native
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.native
}

object LiveChatUserBannedMessageDetails {
  @scala.inline
  def apply(): LiveChatUserBannedMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatUserBannedMessageDetails]
  }
  @scala.inline
  implicit class LiveChatUserBannedMessageDetailsOps[Self <: LiveChatUserBannedMessageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBanDurationSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withBanType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banType")(js.undefined)
        ret
    }
    @scala.inline
    def withBannedUserDetails(value: ChannelProfileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannedUserDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannedUserDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannedUserDetails")(js.undefined)
        ret
    }
  }
  
}

