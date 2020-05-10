package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait audioTracksUpdatedData extends js.Object {
  var audioTracks: js.Array[AudioTrack] = js.native
}

object audioTracksUpdatedData {
  @scala.inline
  def apply(audioTracks: js.Array[AudioTrack]): audioTracksUpdatedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[audioTracksUpdatedData]
  }
  @scala.inline
  implicit class audioTracksUpdatedDataOps[Self <: audioTracksUpdatedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioTracks(value: js.Array[AudioTrack]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTracks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

