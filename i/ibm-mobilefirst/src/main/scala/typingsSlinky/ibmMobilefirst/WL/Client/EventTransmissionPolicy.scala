package typingsSlinky.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTransmissionPolicy extends js.Object {
  var eventStorageEnabled: js.UndefOr[Boolean] = js.native
  var interval: js.UndefOr[Double] = js.native
}

object EventTransmissionPolicy {
  @scala.inline
  def apply(): EventTransmissionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTransmissionPolicy]
  }
  @scala.inline
  implicit class EventTransmissionPolicyOps[Self <: EventTransmissionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventStorageEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStorageEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventStorageEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStorageEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
  }
  
}

