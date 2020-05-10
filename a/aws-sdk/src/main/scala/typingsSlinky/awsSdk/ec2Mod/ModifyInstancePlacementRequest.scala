package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstancePlacementRequest extends js.Object {
  /**
    * The affinity setting for the instance.
    */
  var Affinity: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Affinity] = js.native
  /**
    * The name of the placement group in which to place the instance. For spread placement groups, the instance must have a tenancy of default. For cluster and partition placement groups, the instance must have a tenancy of default or dedicated. To remove an instance from a placement group, specify an empty string ("").
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.native
  /**
    * The ID of the Dedicated Host with which to associate the instance.
    */
  var HostId: js.UndefOr[DedicatedHostId] = js.native
  /**
    * The ARN of the host resource group in which to place the instance.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.native
  /**
    * The ID of the instance that you are modifying.
    */
  var InstanceId: typingsSlinky.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * Reserved for future use.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.native
  /**
    * The tenancy for the instance.
    */
  var Tenancy: js.UndefOr[HostTenancy] = js.native
}

object ModifyInstancePlacementRequest {
  @scala.inline
  def apply(InstanceId: InstanceId): ModifyInstancePlacementRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstancePlacementRequest]
  }
  @scala.inline
  implicit class ModifyInstancePlacementRequestOps[Self <: ModifyInstancePlacementRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffinity(value: Affinity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Affinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Affinity")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: PlacementGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withHostId(value: DedicatedHostId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostId")(js.undefined)
        ret
    }
    @scala.inline
    def withHostResourceGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostResourceGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostResourceGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostResourceGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTenancy(value: HostTenancy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(js.undefined)
        ret
    }
  }
  
}

