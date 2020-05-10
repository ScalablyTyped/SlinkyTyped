package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvBrowseFeedResponseRootObject extends js.Object {
  var badging: IgtvBrowseFeedResponseBadging = js.native
  var banner_token: String = js.native
  var browse_items: js.Array[IgtvBrowseFeedResponseBrowseItemsItem] = js.native
  var channels: js.Array[IgtvBrowseFeedResponseChannelsItem] = js.native
  var composer: IgtvBrowseFeedResponseComposer = js.native
  var max_id: String = js.native
  var more_available: Boolean = js.native
  var my_channel: IgtvBrowseFeedResponseMyChannel = js.native
  var seen_state: IgtvBrowseFeedResponseSeenState = js.native
  var status: String = js.native
}

object IgtvBrowseFeedResponseRootObject {
  @scala.inline
  def apply(
    badging: IgtvBrowseFeedResponseBadging,
    banner_token: String,
    browse_items: js.Array[IgtvBrowseFeedResponseBrowseItemsItem],
    channels: js.Array[IgtvBrowseFeedResponseChannelsItem],
    composer: IgtvBrowseFeedResponseComposer,
    max_id: String,
    more_available: Boolean,
    my_channel: IgtvBrowseFeedResponseMyChannel,
    seen_state: IgtvBrowseFeedResponseSeenState,
    status: String
  ): IgtvBrowseFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(badging = badging.asInstanceOf[js.Any], banner_token = banner_token.asInstanceOf[js.Any], browse_items = browse_items.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], my_channel = my_channel.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseRootObject]
  }
  @scala.inline
  implicit class IgtvBrowseFeedResponseRootObjectOps[Self <: IgtvBrowseFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadging(value: IgtvBrowseFeedResponseBadging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBanner_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowse_items(value: js.Array[IgtvBrowseFeedResponseBrowseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browse_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: js.Array[IgtvBrowseFeedResponseChannelsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComposer(value: IgtvBrowseFeedResponseComposer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMy_channel(value: IgtvBrowseFeedResponseMyChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my_channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeen_state(value: IgtvBrowseFeedResponseSeenState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seen_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

