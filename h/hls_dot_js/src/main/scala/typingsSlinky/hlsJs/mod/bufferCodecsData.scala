package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface mediaDetachingData {}
// interface mediaDetachedData {}
// interface bufferResetData {}
@js.native
trait bufferCodecsData extends js.Object {
  var tracks: Tracks = js.native
}

object bufferCodecsData {
  @scala.inline
  def apply(tracks: Tracks): bufferCodecsData = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferCodecsData]
  }
  @scala.inline
  implicit class bufferCodecsDataOps[Self <: bufferCodecsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTracks(value: Tracks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

