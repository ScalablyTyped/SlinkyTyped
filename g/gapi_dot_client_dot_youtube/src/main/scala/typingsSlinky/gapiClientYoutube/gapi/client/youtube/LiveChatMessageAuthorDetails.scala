package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessageAuthorDetails extends js.Object {
  /** The YouTube channel ID. */
  var channelId: js.UndefOr[String] = js.native
  /** The channel's URL. */
  var channelUrl: js.UndefOr[String] = js.native
  /** The channel's display name. */
  var displayName: js.UndefOr[String] = js.native
  /** Whether the author is a moderator of the live chat. */
  var isChatModerator: js.UndefOr[Boolean] = js.native
  /** Whether the author is the owner of the live chat. */
  var isChatOwner: js.UndefOr[Boolean] = js.native
  /** Whether the author is a sponsor of the live chat. */
  var isChatSponsor: js.UndefOr[Boolean] = js.native
  /** Whether the author's identity has been verified by YouTube. */
  var isVerified: js.UndefOr[Boolean] = js.native
  /** The channels's avatar URL. */
  var profileImageUrl: js.UndefOr[String] = js.native
}

object LiveChatMessageAuthorDetails {
  @scala.inline
  def apply(): LiveChatMessageAuthorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageAuthorDetails]
  }
  @scala.inline
  implicit class LiveChatMessageAuthorDetailsOps[Self <: LiveChatMessageAuthorDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsChatModerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChatModerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChatModerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChatModerator")(js.undefined)
        ret
    }
    @scala.inline
    def withIsChatOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChatOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChatOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChatOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withIsChatSponsor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChatSponsor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChatSponsor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChatSponsor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerified")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileImageUrl")(js.undefined)
        ret
    }
  }
  
}

