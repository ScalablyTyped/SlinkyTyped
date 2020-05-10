package typingsSlinky.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestLaunchSpecification extends js.Object {
  var ami: Input[String] = js.native
  var associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.native
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  var ebsBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]]]] = js.native
  var ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  var ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]]]] = js.native
  var iamInstanceProfile: js.UndefOr[Input[String]] = js.native
  var iamInstanceProfileArn: js.UndefOr[Input[String]] = js.native
  var instanceType: Input[String] = js.native
  var keyName: js.UndefOr[Input[String]] = js.native
  var monitoring: js.UndefOr[Input[Boolean]] = js.native
  var placementGroup: js.UndefOr[Input[String]] = js.native
  var placementTenancy: js.UndefOr[Input[String]] = js.native
  var rootBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]]]] = js.native
  /**
    * The maximum bid price per unit hour.
    */
  var spotPrice: js.UndefOr[Input[String]] = js.native
  var subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  var userData: js.UndefOr[Input[String]] = js.native
  var vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var weightedCapacity: js.UndefOr[Input[String]] = js.native
}

object SpotFleetRequestLaunchSpecification {
  @scala.inline
  def apply(ami: Input[String], instanceType: Input[String]): SpotFleetRequestLaunchSpecification = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecification]
  }
  @scala.inline
  implicit class SpotFleetRequestLaunchSpecificationOps[Self <: SpotFleetRequestLaunchSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmi(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ami")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatePublicIpAddress(value: Input[Boolean]): Self = {
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
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsBlockDevices(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: Input[Boolean]): Self = {
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
    def withEphemeralBlockDevices(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: Input[String]): Self = {
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
    def withIamInstanceProfileArn(value: Input[String]): Self = {
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
    def withKeyName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoring(value: Input[Boolean]): Self = {
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
    def withPlacementGroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementTenancy(value: Input[String]): Self = {
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
    def withRootBlockDevices(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotPrice(value: Input[String]): Self = {
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
    def withSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    def withUserData(value: Input[String]): Self = {
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
    def withVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightedCapacity(value: Input[String]): Self = {
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

