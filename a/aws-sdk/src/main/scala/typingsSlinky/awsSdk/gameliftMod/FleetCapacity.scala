package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetCapacity extends js.Object {
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * Current status of fleet capacity.
    */
  var InstanceCounts: js.UndefOr[EC2InstanceCounts] = js.native
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var InstanceType: js.UndefOr[EC2InstanceType] = js.native
}

object FleetCapacity {
  @scala.inline
  def apply(): FleetCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetCapacity]
  }
  @scala.inline
  implicit class FleetCapacityOps[Self <: FleetCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCounts(value: EC2InstanceCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: EC2InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
  }
  
}

