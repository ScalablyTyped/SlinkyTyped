package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatUserBannedMessageDetails extends js.Object {
  /**
    * The duration of the ban. This property is only present if the banType is
    * temporary.
    */
  var banDurationSeconds: js.UndefOr[String] = js.native
  /**
    * The type of ban.
    */
  var banType: js.UndefOr[String] = js.native
  /**
    * The details of the user that was banned.
    */
  var bannedUserDetails: js.UndefOr[SchemaChannelProfileDetails] = js.native
}

object SchemaLiveChatUserBannedMessageDetails {
  @scala.inline
  def apply(): SchemaLiveChatUserBannedMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatUserBannedMessageDetails]
  }
  @scala.inline
  implicit class SchemaLiveChatUserBannedMessageDetailsOps[Self <: SchemaLiveChatUserBannedMessageDetails] (val x: Self) extends AnyVal {
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
    def withBannedUserDetails(value: SchemaChannelProfileDetails): Self = {
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

