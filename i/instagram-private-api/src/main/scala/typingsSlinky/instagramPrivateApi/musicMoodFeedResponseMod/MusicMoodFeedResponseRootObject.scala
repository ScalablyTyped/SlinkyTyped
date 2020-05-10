package typingsSlinky.instagramPrivateApi.musicMoodFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicMoodFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String = js.native
  var items: js.Array[MusicMoodFeedResponseItemsItem] = js.native
  var page_info: MusicMoodFeedResponsePageInfo = js.native
  var status: String = js.native
}

object MusicMoodFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicMoodFeedResponseItemsItem],
    page_info: MusicMoodFeedResponsePageInfo,
    status: String
  ): MusicMoodFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicMoodFeedResponseRootObject]
  }
  @scala.inline
  implicit class MusicMoodFeedResponseRootObjectOps[Self <: MusicMoodFeedResponseRootObject] (val x: Self) extends AnyVal {
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
    def withItems(value: js.Array[MusicMoodFeedResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_info(value: MusicMoodFeedResponsePageInfo): Self = {
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

