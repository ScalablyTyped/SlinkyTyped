package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends StObject {
  
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
  implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setId(value: InstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIdentityManagementType(value: DirectoryType): Self = StObject.set(x, "IdentityManagementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityManagementTypeUndefined: Self = StObject.set(x, "IdentityManagementType", js.undefined)
    
    @scala.inline
    def setInboundCallsEnabled(value: InboundCallsEnabled): Self = StObject.set(x, "InboundCallsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundCallsEnabledUndefined: Self = StObject.set(x, "InboundCallsEnabled", js.undefined)
    
    @scala.inline
    def setInstanceAlias(value: DirectoryAlias): Self = StObject.set(x, "InstanceAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceAliasUndefined: Self = StObject.set(x, "InstanceAlias", js.undefined)
    
    @scala.inline
    def setInstanceStatus(value: InstanceStatus): Self = StObject.set(x, "InstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStatusUndefined: Self = StObject.set(x, "InstanceStatus", js.undefined)
    
    @scala.inline
    def setOutboundCallsEnabled(value: OutboundCallsEnabled): Self = StObject.set(x, "OutboundCallsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundCallsEnabledUndefined: Self = StObject.set(x, "OutboundCallsEnabled", js.undefined)
    
    @scala.inline
    def setServiceRole(value: ARN): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    @scala.inline
    def setStatusReason(value: InstanceStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
  }
}
