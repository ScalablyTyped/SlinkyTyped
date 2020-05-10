package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupStatus extends js.Object {
  /**
    * The current state of the instance group.
    */
  var State: js.UndefOr[InstanceGroupState] = js.native
  /**
    * The status change reason details for the instance group.
    */
  var StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason] = js.native
  /**
    * The timeline of the instance group status over time.
    */
  var Timeline: js.UndefOr[InstanceGroupTimeline] = js.native
}

object InstanceGroupStatus {
  @scala.inline
  def apply(): InstanceGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupStatus]
  }
  @scala.inline
  implicit class InstanceGroupStatusOps[Self <: InstanceGroupStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: InstanceGroupState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangeReason(value: InstanceGroupStateChangeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeline(value: InstanceGroupTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(js.undefined)
        ret
    }
  }
  
}

