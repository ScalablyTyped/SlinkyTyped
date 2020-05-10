package typingsSlinky.instagramPrivateApi.musicGenreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicGenreFeedResponseItemsItem extends js.Object {
  var track: MusicGenreFeedResponseTrack = js.native
}

object MusicGenreFeedResponseItemsItem {
  @scala.inline
  def apply(track: MusicGenreFeedResponseTrack): MusicGenreFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicGenreFeedResponseItemsItem]
  }
  @scala.inline
  implicit class MusicGenreFeedResponseItemsItemOps[Self <: MusicGenreFeedResponseItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrack(value: MusicGenreFeedResponseTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

