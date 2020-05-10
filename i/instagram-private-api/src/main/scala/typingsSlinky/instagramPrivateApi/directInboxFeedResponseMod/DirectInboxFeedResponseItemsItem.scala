package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectInboxFeedResponseItemsItem extends js.Object {
  var client_context: js.UndefOr[String] = js.native
  var item_id: String = js.native
  var item_type: String = js.native
  var link: js.UndefOr[DirectInboxFeedResponseLink] = js.native
  var placeholder: js.UndefOr[DirectInboxFeedResponsePlaceholder] = js.native
  var profile: js.UndefOr[DirectInboxFeedResponseProfile] = js.native
  var reel_share: js.UndefOr[DirectInboxFeedResponseReelShare] = js.native
  var text: js.UndefOr[String] = js.native
  var timestamp: String = js.native
  var user_id: Double = js.native
}

object DirectInboxFeedResponseItemsItem {
  @scala.inline
  def apply(item_id: String, item_type: String, timestamp: String, user_id: Double): DirectInboxFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseItemsItem]
  }
  @scala.inline
  implicit class DirectInboxFeedResponseItemsItemOps[Self <: DirectInboxFeedResponseItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_context(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_context")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: DirectInboxFeedResponseLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: DirectInboxFeedResponsePlaceholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: DirectInboxFeedResponseProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withReel_share(value: DirectInboxFeedResponseReelShare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_share")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReel_share: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_share")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

