package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the instance.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * When the instance was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var Id: js.UndefOr[InstanceId] = js.native
  
  /**
    * The identity management type.
    */
  var IdentityManagementType: js.UndefOr[DirectoryType] = js.native
  
  /**
    * Whether inbound calls are enabled.
    */
  var InboundCallsEnabled: js.UndefOr[typingsSlinky.awsSdk.connectMod.InboundCallsEnabled] = js.native
  
  /**
    * The alias of instance.
    */
  var InstanceAlias: js.UndefOr[DirectoryAlias] = js.native
  
  /**
    * The state of the instance.
    */
  var InstanceStatus: js.UndefOr[typingsSlinky.awsSdk.connectMod.InstanceStatus] = js.native
  
  /**
    * Whether outbound calls are enabled.
    */
  var OutboundCallsEnabled: js.UndefOr[typingsSlinky.awsSdk.connectMod.OutboundCallsEnabled] = js.native
  
  /**
    * The service role of the instance.
    */
  var ServiceRole: js.UndefOr[ARN] = js.native
  
  /**
    * Relevant details why the instance was not successfully created. 
    */
  var StatusReason: js.UndefOr[InstanceStatusReason] = js.native
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setId(value: InstanceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setIdentityManagementType(value: DirectoryType): Self = this.set("IdentityManagementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityManagementType: Self = this.set("IdentityManagementType", js.undefined)
    
    @scala.inline
    def setInboundCallsEnabled(value: InboundCallsEnabled): Self = this.set("InboundCallsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundCallsEnabled: Self = this.set("InboundCallsEnabled", js.undefined)
    
    @scala.inline
    def setInstanceAlias(value: DirectoryAlias): Self = this.set("InstanceAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceAlias: Self = this.set("InstanceAlias", js.undefined)
    
    @scala.inline
    def setInstanceStatus(value: InstanceStatus): Self = this.set("InstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceStatus: Self = this.set("InstanceStatus", js.undefined)
    
    @scala.inline
    def setOutboundCallsEnabled(value: OutboundCallsEnabled): Self = this.set("OutboundCallsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutboundCallsEnabled: Self = this.set("OutboundCallsEnabled", js.undefined)
    
    @scala.inline
    def setServiceRole(value: ARN): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRole: Self = this.set("ServiceRole", js.undefined)
    
    @scala.inline
    def setStatusReason(value: InstanceStatusReason): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
  }
}
