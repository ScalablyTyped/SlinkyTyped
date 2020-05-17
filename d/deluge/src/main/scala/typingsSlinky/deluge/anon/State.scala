package typingsSlinky.deluge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var state: js.Array[js.Tuple2[String, Double]] = js.native
  var tracker_host: js.Array[js.Tuple2[String, Double]] = js.native
}

object State {
  @scala.inline
  def apply(state: js.Array[js.Tuple2[String, Double]], tracker_host: js.Array[js.Tuple2[String, Double]]): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], tracker_host = tracker_host.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: js.Array[js.Tuple2[String, Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracker_host(value: js.Array[js.Tuple2[String, Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker_host")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

