package typingsSlinky.musicmatch.mod

import typingsSlinky.musicmatch.anon.Albumid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackResult extends js.Object {
  var track: Albumid = js.native
}

object TrackResult {
  @scala.inline
  def apply(track: Albumid): TrackResult = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackResult]
  }
  @scala.inline
  implicit class TrackResultOps[Self <: TrackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrack(value: Albumid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

