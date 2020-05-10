package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTrackRemovals extends js.Object {
  var trackRemovals: Boolean = js.native
}

object AnonTrackRemovals {
  @scala.inline
  def apply(trackRemovals: Boolean): AnonTrackRemovals = {
    val __obj = js.Dynamic.literal(trackRemovals = trackRemovals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTrackRemovals]
  }
  @scala.inline
  implicit class AnonTrackRemovalsOps[Self <: AnonTrackRemovals] (val x: Self) extends AnyVal {
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

