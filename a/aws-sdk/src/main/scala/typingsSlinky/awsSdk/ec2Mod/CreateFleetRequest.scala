package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.native
  /**
    * The configuration for the EC2 Fleet.
    */
  var LaunchTemplateConfigs: FleetLaunchTemplateConfigListRequest = js.native
  /**
    * Describes the configuration of On-Demand Instances in an EC2 Fleet.
    */
  var OnDemandOptions: js.UndefOr[OnDemandOptionsRequest] = js.native
  /**
    * Indicates whether EC2 Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.native
  /**
    * Describes the configuration of Spot Instances in an EC2 Fleet.
    */
  var SpotOptions: js.UndefOr[SpotOptionsRequest] = js.native
  /**
    * The key-value pair for tagging the EC2 Fleet request on creation. The value for ResourceType must be fleet, otherwise the fleet request fails. To tag instances at launch, specify the tags in the launch template. For information about tagging after launch, see Tagging Your Resources. 
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The number of units to request.
    */
  var TargetCapacitySpecification: TargetCapacitySpecificationRequest = js.native
  /**
    * Indicates whether running instances should be terminated when the EC2 Fleet expires.
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.native
  /**
    * The type of the request. By default, the EC2 Fleet places an asynchronous request for your desired capacity, and maintains it by replenishing interrupted Spot Instances (maintain). A value of instant places a synchronous one-time request, and returns errors for any instances that could not be launched. A value of request places an asynchronous one-time request without maintaining capacity or submitting requests in alternative capacity pools if capacity is unavailable. For more information, see EC2 Fleet Request Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var Type: js.UndefOr[FleetType] = js.native
  /**
    * The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  var ValidFrom: js.UndefOr[js.Date] = js.native
  /**
    * The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}

object CreateFleetRequest {
  @scala.inline
  def apply(
    LaunchTemplateConfigs: FleetLaunchTemplateConfigListRequest,
    TargetCapacitySpecification: TargetCapacitySpecificationRequest
  ): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateConfigs = LaunchTemplateConfigs.asInstanceOf[js.Any], TargetCapacitySpecification = TargetCapacitySpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetRequest]
  }
  @scala.inline
  implicit class CreateFleetRequestOps[Self <: CreateFleetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplateConfigs(value: FleetLaunchTemplateConfigListRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCapacitySpecification(value: TargetCapacitySpecificationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCapacitySpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcessCapacityTerminationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcessCapacityTerminationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcessCapacityTerminationPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandOptions(value: OnDemandOptionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceUnhealthyInstances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceUnhealthyInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceUnhealthyInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceUnhealthyInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotOptions(value: SpotOptionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSpecifications(value: TagSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateInstancesWithExpiration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateInstancesWithExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateInstancesWithExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateInstancesWithExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: FleetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withValidFrom(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUntil(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUntil")(js.undefined)
        ret
    }
  }
  
}

