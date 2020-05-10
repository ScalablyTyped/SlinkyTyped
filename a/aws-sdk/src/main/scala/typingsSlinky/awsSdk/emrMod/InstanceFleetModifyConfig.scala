package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetModifyConfig extends js.Object {
  /**
    * A unique identifier for the instance fleet.
    */
  var InstanceFleetId: typingsSlinky.awsSdk.emrMod.InstanceFleetId = js.native
  /**
    * The target capacity of On-Demand units for the instance fleet. For more information see InstanceFleetConfig$TargetOnDemandCapacity.
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The target capacity of Spot units for the instance fleet. For more information, see InstanceFleetConfig$TargetSpotCapacity.
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceFleetModifyConfig {
  @scala.inline
  def apply(InstanceFleetId: InstanceFleetId): InstanceFleetModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetId = InstanceFleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetModifyConfig]
  }
  @scala.inline
  implicit class InstanceFleetModifyConfigOps[Self <: InstanceFleetModifyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceFleetId(value: InstanceFleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetOnDemandCapacity(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetOnDemandCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetOnDemandCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetOnDemandCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSpotCapacity(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSpotCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSpotCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetSpotCapacity")(js.undefined)
        ret
    }
  }
  
}

