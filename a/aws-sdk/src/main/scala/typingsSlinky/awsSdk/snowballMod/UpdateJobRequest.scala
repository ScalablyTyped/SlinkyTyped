package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobRequest extends js.Object {
  
  /**
    * The ID of the updated Address object.
    */
  var AddressId: js.UndefOr[typingsSlinky.awsSdk.snowballMod.AddressId] = js.native
  
  /**
    * The updated description of this job's JobMetadata object.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The updated ID for the forwarding address for a job. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  
  /**
    * The job ID of the job that you want to update, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typingsSlinky.awsSdk.snowballMod.JobId = js.native
  
  /**
    * The new or updated Notification object.
    */
  var Notification: js.UndefOr[typingsSlinky.awsSdk.snowballMod.Notification] = js.native
  
  /**
    * The updated JobResource object, or the updated JobResource object. 
    */
  var Resources: js.UndefOr[JobResource] = js.native
  
  /**
    * The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN, use the CreateRoleAWS Identity and Access Management (IAM) API action.
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.RoleARN] = js.native
  
  /**
    * The updated shipping option value of this job's ShippingDetails object.
    */
  var ShippingOption: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ShippingOption] = js.native
  
  /**
    * The updated SnowballCapacityPreference of this job's JobMetadata object. The 50 TB Snowballs are only available in the US regions.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.native
}
object UpdateJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobRequest]
  }
  
  @scala.inline
  implicit class UpdateJobRequestOps[Self <: UpdateJobRequest] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressId(value: AddressId): Self = this.set("AddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressId: Self = this.set("AddressId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setForwardingAddressId(value: AddressId): Self = this.set("ForwardingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingAddressId: Self = this.set("ForwardingAddressId", js.undefined)
    
    @scala.inline
    def setNotification(value: Notification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("Notification", js.undefined)
    
    @scala.inline
    def setResources(value: JobResource): Self = this.set("Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = this.set("ShippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingOption: Self = this.set("ShippingOption", js.undefined)
    
    @scala.inline
    def setSnowballCapacityPreference(value: SnowballCapacity): Self = this.set("SnowballCapacityPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowballCapacityPreference: Self = this.set("SnowballCapacityPreference", js.undefined)
  }
}
