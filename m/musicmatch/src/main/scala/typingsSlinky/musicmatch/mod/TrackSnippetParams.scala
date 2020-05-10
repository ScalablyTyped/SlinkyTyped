package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackSnippetParams extends js.Object {
  var track_id: Double = js.native
}

object TrackSnippetParams {
  @scala.inline
  def apply(track_id: Double): TrackSnippetParams = {
    val __obj = js.Dynamic.literal(track_id = track_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSnippetParams]
  }
  @scala.inline
  implicit class TrackSnippetParamsOps[Self <: TrackSnippetParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrack_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

