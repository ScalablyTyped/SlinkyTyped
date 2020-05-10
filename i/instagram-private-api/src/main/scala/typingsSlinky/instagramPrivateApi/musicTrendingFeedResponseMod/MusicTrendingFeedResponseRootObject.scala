package typingsSlinky.instagramPrivateApi.musicTrendingFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicTrendingFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String = js.native
  var items: js.Array[MusicTrendingFeedResponseItemsItem] = js.native
  var page_info: MusicTrendingFeedResponsePageInfo = js.native
  var status: String = js.native
}

object MusicTrendingFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicTrendingFeedResponseItemsItem],
    page_info: MusicTrendingFeedResponsePageInfo,
    status: String
  ): MusicTrendingFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicTrendingFeedResponseRootObject]
  }
  @scala.inline
  implicit class MusicTrendingFeedResponseRootObjectOps[Self <: MusicTrendingFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlacorn_session_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alacorn_session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[MusicTrendingFeedResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_info(value: MusicTrendingFeedResponsePageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_info")(value.asInstanceOf[js.Any])
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

