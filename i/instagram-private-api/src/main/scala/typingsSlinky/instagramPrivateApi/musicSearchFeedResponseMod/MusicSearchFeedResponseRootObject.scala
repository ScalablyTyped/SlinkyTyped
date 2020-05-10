package typingsSlinky.instagramPrivateApi.musicSearchFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicSearchFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String = js.native
  var items: js.Array[MusicSearchFeedResponseItemsItem] = js.native
  var page_info: MusicSearchFeedResponsePageInfo = js.native
  var status: String = js.native
}

object MusicSearchFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicSearchFeedResponseItemsItem],
    page_info: MusicSearchFeedResponsePageInfo,
    status: String
  ): MusicSearchFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicSearchFeedResponseRootObject]
  }
  @scala.inline
  implicit class MusicSearchFeedResponseRootObjectOps[Self <: MusicSearchFeedResponseRootObject] (val x: Self) extends AnyVal {
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
    def withItems(value: js.Array[MusicSearchFeedResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_info(value: MusicSearchFeedResponsePageInfo): Self = {
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

