package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackRemovals extends js.Object {
  var trackRemovals: Boolean = js.native
}

object TrackRemovals {
  @scala.inline
  def apply(trackRemovals: Boolean): TrackRemovals = {
    val __obj = js.Dynamic.literal(trackRemovals = trackRemovals.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackRemovals]
  }
  @scala.inline
  implicit class TrackRemovalsOps[Self <: TrackRemovals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackRemovals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRemovals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

