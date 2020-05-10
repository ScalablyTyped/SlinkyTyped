package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetStatus extends js.Object {
  /**
    * A code representing the instance fleet status.    PROVISIONING—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.    BOOTSTRAPPING—EC2 instances and other resources have been provisioned and the bootstrap actions specified for the instances are underway.    RUNNING—EC2 instances and other resources are running. They are either executing jobs or waiting to execute jobs.    RESIZING—A resize operation is underway. EC2 instances are either being added or removed.    SUSPENDED—A resize operation could not complete. Existing EC2 instances are running, but instances can't be added or removed.    TERMINATING—The instance fleet is terminating EC2 instances.    TERMINATED—The instance fleet is no longer active, and all EC2 instances have been terminated.  
    */
  var State: js.UndefOr[InstanceFleetState] = js.native
  /**
    * Provides status change reason details for the instance fleet.
    */
  var StateChangeReason: js.UndefOr[InstanceFleetStateChangeReason] = js.native
  /**
    * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready to run jobs, and the time of termination.
    */
  var Timeline: js.UndefOr[InstanceFleetTimeline] = js.native
}

object InstanceFleetStatus {
  @scala.inline
  def apply(): InstanceFleetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetStatus]
  }
  @scala.inline
  implicit class InstanceFleetStatusOps[Self <: InstanceFleetStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: InstanceFleetState): Self = {
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
    def withStateChangeReason(value: InstanceFleetStateChangeReason): Self = {
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
    def withTimeline(value: InstanceFleetTimeline): Self = {
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

