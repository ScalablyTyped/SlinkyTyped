package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSpotInstancesRequest extends js.Object {
  
  /**
    * The user-specified name for a logical grouping of requests. When you specify an Availability Zone group in a Spot Instance request, all Spot Instances in the request are launched in the same Availability Zone. Instance proximity is maintained with this parameter, but the choice of Availability Zone is not. The group applies only to requests for Spot Instances of the same instance type. Any additional Spot Instance requests that are specified with the same Availability Zone group name are launched in that same Availability Zone, as long as at least one instance from the group is still active. If there is no active instance running in the Availability Zone group that you specify for a new Spot Instance request (all instances are terminated, the request is expired, or the maximum price you specified falls below current Spot price), then Amazon EC2 launches the instance in any Availability Zone where the constraint can be met. Consequently, the subsequent set of Spot Instances could be placed in a different zone from the original request, even if you specified the same Availability Zone group. Default: Instances are launched in any available Availability Zone.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.native
  
  /**
    * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360). The duration period starts as soon as your Spot Instance receives its instance ID. At the end of the duration period, Amazon EC2 marks the Spot Instance for termination and provides a Spot Instance termination notice, which gives the instance a two-minute warning before it terminates. You can't specify an Availability Zone group or a launch group if you specify a duration. New accounts or accounts with no previous billing history with AWS are not eligible for Spot Instances with a defined duration (also known as Spot blocks).
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency in the Amazon EC2 User Guide for Linux Instances.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of Spot Instances to launch. Default: 1
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  
  /**
    * The instance launch group. Launch groups are Spot Instances that launch together and terminate together. Default: Instances are launched and terminated individually
    */
  var LaunchGroup: js.UndefOr[String] = js.native
  
  /**
    * The launch specification.
    */
  var LaunchSpecification: js.UndefOr[RequestSpotLaunchSpecification] = js.native
  
  /**
    * The maximum price per hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  
  /**
    * The key-value pair for tagging the Spot Instance request on creation. The value for ResourceType must be spot-instances-request, otherwise the Spot Instance request fails. To tag the Spot Instance request after it has been created, see CreateTags. 
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * The Spot Instance request type. Default: one-time 
    */
  var Type: js.UndefOr[SpotInstanceType] = js.native
  
  /**
    * The start date of the request. If this is a one-time request, the request becomes active at this date and time and remains active until all instances launch, the request expires, or the request is canceled. If the request is persistent, the request becomes active at this date and time and remains active until it expires or is canceled. The specified start date and time cannot be equal to the current date and time. You must specify a start date and time that occurs after the current date and time.
    */
  var ValidFrom: js.UndefOr[js.Date] = js.native
  
  /**
    * The end date of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ).   For a persistent request, the request remains active until the ValidUntil date and time is reached. Otherwise, the request remains active until you cancel it.    For a one-time request, the request remains active until all instances launch, the request is canceled, or the ValidUntil date and time is reached. By default, the request is valid for 7 days from the date the request was created.  
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}
object RequestSpotInstancesRequest {
  
  @scala.inline
  def apply(): RequestSpotInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotInstancesRequest]
  }
  
  @scala.inline
  implicit class RequestSpotInstancesRequestOps[Self <: RequestSpotInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityZoneGroup(value: String): Self = this.set("AvailabilityZoneGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZoneGroup: Self = this.set("AvailabilityZoneGroup", js.undefined)
    
    @scala.inline
    def setBlockDurationMinutes(value: Integer): Self = this.set("BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDurationMinutes: Self = this.set("BlockDurationMinutes", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = this.set("InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInterruptionBehavior: Self = this.set("InstanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setLaunchGroup(value: String): Self = this.set("LaunchGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchGroup: Self = this.set("LaunchGroup", js.undefined)
    
    @scala.inline
    def setLaunchSpecification(value: RequestSpotLaunchSpecification): Self = this.set("LaunchSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchSpecification: Self = this.set("LaunchSpecification", js.undefined)
    
    @scala.inline
    def setSpotPrice(value: String): Self = this.set("SpotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotPrice: Self = this.set("SpotPrice", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
    
    @scala.inline
    def setType(value: SpotInstanceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValidFrom(value: js.Date): Self = this.set("ValidFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidFrom: Self = this.set("ValidFrom", js.undefined)
    
    @scala.inline
    def setValidUntil(value: js.Date): Self = this.set("ValidUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidUntil: Self = this.set("ValidUntil", js.undefined)
  }
}
