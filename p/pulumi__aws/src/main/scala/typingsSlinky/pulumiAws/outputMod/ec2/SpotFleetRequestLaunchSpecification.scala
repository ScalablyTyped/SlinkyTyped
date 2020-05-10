package typingsSlinky.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestLaunchSpecification extends js.Object {
  var ami: String = js.native
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.native
  var availabilityZone: String = js.native
  var ebsBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice] = js.native
  var ebsOptimized: js.UndefOr[Boolean] = js.native
  var ephemeralBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice] = js.native
  var iamInstanceProfile: js.UndefOr[String] = js.native
  var iamInstanceProfileArn: js.UndefOr[String] = js.native
  var instanceType: String = js.native
  var keyName: String = js.native
  var monitoring: js.UndefOr[Boolean] = js.native
  var placementGroup: String = js.native
  var placementTenancy: js.UndefOr[String] = js.native
  var rootBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice] = js.native
  /**
    * The maximum bid price per unit hour.
    */
  var spotPrice: js.UndefOr[String] = js.native
  var subnetId: String = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  var userData: js.UndefOr[String] = js.native
  var vpcSecurityGroupIds: js.Array[String] = js.native
  var weightedCapacity: js.UndefOr[String] = js.native
}

object SpotFleetRequestLaunchSpecification {
  @scala.inline
  def apply(
    ami: String,
    availabilityZone: String,
    ebsBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice],
    ephemeralBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice],
    instanceType: String,
    keyName: String,
    placementGroup: String,
    rootBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice],
    subnetId: String,
    vpcSecurityGroupIds: js.Array[String]
  ): SpotFleetRequestLaunchSpecification = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], ebsBlockDevices = ebsBlockDevices.asInstanceOf[js.Any], ephemeralBlockDevices = ephemeralBlockDevices.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], rootBlockDevices = rootBlockDevices.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecification]
  }
  @scala.inline
  implicit class SpotFleetRequestLaunchSpecificationOps[Self <: SpotFleetRequestLaunchSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ami")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEbsBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEphemeralBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacementGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatePublicIpAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatePublicIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(js.undefined)
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamInstanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamInstanceProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamInstanceProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withIamInstanceProfileArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamInstanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamInstanceProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamInstanceProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementTenancy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementTenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementTenancy")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightedCapacity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedCapacity")(js.undefined)
        ret
    }
  }
  
}

