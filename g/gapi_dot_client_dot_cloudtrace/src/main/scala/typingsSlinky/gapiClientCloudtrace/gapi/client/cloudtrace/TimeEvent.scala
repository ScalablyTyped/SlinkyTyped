package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeEvent extends js.Object {
  /** Text annotation with a set of attributes. */
  var annotation: js.UndefOr[Annotation] = js.native
  /** An event describing an RPC message sent/received on the network. */
  var networkEvent: js.UndefOr[NetworkEvent] = js.native
  /** The timestamp indicating the time the event occurred. */
  var time: js.UndefOr[String] = js.native
}

object TimeEvent {
  @scala.inline
  def apply(): TimeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeEvent]
  }
  @scala.inline
  implicit class TimeEventOps[Self <: TimeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkEvent(value: NetworkEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

