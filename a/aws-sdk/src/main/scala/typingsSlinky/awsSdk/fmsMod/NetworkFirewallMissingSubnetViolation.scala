package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFirewallMissingSubnetViolation extends js.Object {
  
  /**
    * The Availability Zone of a violating subnet. 
    */
  var AvailabilityZone: js.UndefOr[LengthBoundedString] = js.native
  
  /**
    * The reason the resource has this violation, if one is available. 
    */
  var TargetViolationReason: js.UndefOr[typingsSlinky.awsSdk.fmsMod.TargetViolationReason] = js.native
  
  /**
    * The resource ID of the VPC associated with a violating subnet.
    */
  var VPC: js.UndefOr[ResourceId] = js.native
  
  /**
    * The ID of the AWS Network Firewall or VPC resource that's in violation.
    */
  var ViolationTarget: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ViolationTarget] = js.native
}
object NetworkFirewallMissingSubnetViolation {
  
  @scala.inline
  def apply(): NetworkFirewallMissingSubnetViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallMissingSubnetViolation]
  }
  
  @scala.inline
  implicit class NetworkFirewallMissingSubnetViolationOps[Self <: NetworkFirewallMissingSubnetViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityZone(value: LengthBoundedString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setTargetViolationReason(value: TargetViolationReason): Self = this.set("TargetViolationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetViolationReason: Self = this.set("TargetViolationReason", js.undefined)
    
    @scala.inline
    def setVPC(value: ResourceId): Self = this.set("VPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVPC: Self = this.set("VPC", js.undefined)
    
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = this.set("ViolationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolationTarget: Self = this.set("ViolationTarget", js.undefined)
  }
}
