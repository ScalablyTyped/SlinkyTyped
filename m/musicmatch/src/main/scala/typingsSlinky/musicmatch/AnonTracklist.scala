package typingsSlinky.musicmatch

import typingsSlinky.musicmatch.mod.TrackResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTracklist extends js.Object {
  var track_list: js.Array[TrackResult] = js.native
}

object AnonTracklist {
  @scala.inline
  def apply(track_list: js.Array[TrackResult]): AnonTracklist = {
    val __obj = js.Dynamic.literal(track_list = track_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTracklist]
  }
  @scala.inline
  implicit class AnonTracklistOps[Self <: AnonTracklist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrack_list(value: js.Array[TrackResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_list")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

