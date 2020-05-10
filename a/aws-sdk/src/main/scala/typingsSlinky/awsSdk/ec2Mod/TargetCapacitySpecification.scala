package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetCapacitySpecification extends js.Object {
  /**
    * The default TotalTargetCapacity, which is either Spot or On-Demand.
    */
  var DefaultTargetCapacityType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.DefaultTargetCapacityType] = js.native
  /**
    * The number of On-Demand units to request. If you specify a target capacity for Spot units, you cannot specify a target capacity for On-Demand units.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * The maximum number of Spot units to launch. If you specify a target capacity for On-Demand units, you cannot specify a target capacity for Spot units.
    */
  var SpotTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * The number of units to request, filled using DefaultTargetCapacityType.
    */
  var TotalTargetCapacity: js.UndefOr[Integer] = js.native
}

object TargetCapacitySpecification {
  @scala.inline
  def apply(): TargetCapacitySpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetCapacitySpecification]
  }
  @scala.inline
  implicit class TargetCapacitySpecificationOps[Self <: TargetCapacitySpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultTargetCapacityType(value: DefaultTargetCapacityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultTargetCapacityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTargetCapacityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultTargetCapacityType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandTargetCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandTargetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandTargetCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandTargetCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotTargetCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotTargetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotTargetCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotTargetCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalTargetCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalTargetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalTargetCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalTargetCapacity")(js.undefined)
        ret
    }
  }
  
}

