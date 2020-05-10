package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequest extends js.Object {
  /**
    * If you specified a duration and your Spot Instance request was fulfilled, this is the fixed hourly price in effect for the Spot Instance while it runs.
    */
  var ActualBlockHourlyPrice: js.UndefOr[String] = js.native
  /**
    * The Availability Zone group. If you specify the same Availability Zone group for all Spot Instance requests, all Spot Instances are launched in the same Availability Zone.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.native
  /**
    * The duration for the Spot Instance, in minutes.
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.native
  /**
    * The date and time when the Spot Instance request was created, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The fault codes for the Spot Instance request, if any.
    */
  var Fault: js.UndefOr[SpotInstanceStateFault] = js.native
  /**
    * The instance ID, if an instance has been launched to fulfill the Spot Instance request.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceId] = js.native
  /**
    * The behavior when a Spot Instance is interrupted.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  /**
    * The instance launch group. Launch groups are Spot Instances that launch together and terminate together.
    */
  var LaunchGroup: js.UndefOr[String] = js.native
  /**
    * Additional information for launching instances.
    */
  var LaunchSpecification: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchSpecification] = js.native
  /**
    * The Availability Zone in which the request is launched.
    */
  var LaunchedAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The product description associated with the Spot Instance.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.native
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.native
  /**
    * The maximum price per hour that you are willing to pay for a Spot Instance.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  /**
    * The state of the Spot Instance request. Spot status information helps track your Spot Instance requests. For more information, see Spot Status in the Amazon EC2 User Guide for Linux Instances.
    */
  var State: js.UndefOr[SpotInstanceState] = js.native
  /**
    * The status code and status message describing the Spot Instance request.
    */
  var Status: js.UndefOr[SpotInstanceStatus] = js.native
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The Spot Instance request type.
    */
  var Type: js.UndefOr[SpotInstanceType] = js.native
  /**
    * The start date of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The request becomes active at this date and time.
    */
  var ValidFrom: js.UndefOr[js.Date] = js.native
  /**
    * The end date of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). If this is a one-time request, it remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date is reached. The default end date is 7 days from the current date.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}

object SpotInstanceRequest {
  @scala.inline
  def apply(): SpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceRequest]
  }
  @scala.inline
  implicit class SpotInstanceRequestOps[Self <: SpotInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualBlockHourlyPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualBlockHourlyPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualBlockHourlyPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualBlockHourlyPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZoneGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZoneGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockDurationMinutes(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockDurationMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockDurationMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockDurationMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFault(value: SpotInstanceStateFault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fault")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInterruptionBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInterruptionBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInterruptionBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchSpecification(value: LaunchSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchedAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchedAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchedAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchedAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withProductDescription(value: RIProductDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotInstanceRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotInstanceRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: SpotInstanceState): Self = {
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
    def withStatus(value: SpotInstanceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: SpotInstanceType): Self = {
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

