package typingsSlinky.plugapi.mod.Event

import typingsSlinky.plugapi.mod.LastPlay
import typingsSlinky.plugapi.mod.Media
import typingsSlinky.plugapi.mod.User.DJ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advance extends js.Object {
  var currentDJ: DJ = js.native
  var djs: js.Array[DJ] = js.native
  var historyID: String = js.native
  var lastPlay: LastPlay = js.native
  var media: Media = js.native
  var playlistID: Double = js.native
  var startTime: String = js.native
}

object Advance {
  @scala.inline
  def apply(
    currentDJ: DJ,
    djs: js.Array[DJ],
    historyID: String,
    lastPlay: LastPlay,
    media: Media,
    playlistID: Double,
    startTime: String
  ): Advance = {
    val __obj = js.Dynamic.literal(currentDJ = currentDJ.asInstanceOf[js.Any], djs = djs.asInstanceOf[js.Any], historyID = historyID.asInstanceOf[js.Any], lastPlay = lastPlay.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], playlistID = playlistID.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advance]
  }
  @scala.inline
  implicit class AdvanceOps[Self <: Advance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDJ(value: DJ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDJ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDjs(value: js.Array[DJ]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("djs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistoryID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPlay(value: LastPlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: Media): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaylistID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

