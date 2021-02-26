package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultWorkspaceCreationProperties extends StObject {
  
  /**
    * The identifier of the default security group to apply to WorkSpaces when they are created. For more information, see  Security Groups for Your WorkSpaces.
    */
  var CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.native
  
  /**
    * The organizational unit (OU) in the directory for the WorkSpace machine accounts.
    */
  var DefaultOu: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.DefaultOu] = js.native
  
  /**
    * Specifies whether to automatically assign an Elastic public IP address to WorkSpaces in this directory by default. If enabled, the Elastic public IP address allows outbound internet access from your WorkSpaces when you’re using an internet gateway in the Amazon VPC in which your WorkSpaces are located. If you're using a Network Address Translation (NAT) gateway for outbound internet access from your VPC, or if your WorkSpaces are in public subnets and you manually assign them Elastic IP addresses, you should disable this setting. This setting applies to new WorkSpaces that you launch or to existing WorkSpaces that you rebuild. For more information, see  Configure a VPC for Amazon WorkSpaces.
    */
  var EnableInternetAccess: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Specifies whether maintenance mode is enabled for WorkSpaces. For more information, see WorkSpace Maintenance.
    */
  var EnableMaintenanceMode: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Specifies whether the directory is enabled for Amazon WorkDocs.
    */
  var EnableWorkDocs: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Specifies whether WorkSpace users are local administrators on their WorkSpaces.
    */
  var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.native
}
object DefaultWorkspaceCreationProperties {
  
  @scala.inline
  def apply(): DefaultWorkspaceCreationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultWorkspaceCreationProperties]
  }
  
  @scala.inline
  implicit class DefaultWorkspaceCreationPropertiesMutableBuilder[Self <: DefaultWorkspaceCreationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "CustomSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSecurityGroupIdUndefined: Self = StObject.set(x, "CustomSecurityGroupId", js.undefined)
    
    @scala.inline
    def setDefaultOu(value: DefaultOu): Self = StObject.set(x, "DefaultOu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOuUndefined: Self = StObject.set(x, "DefaultOu", js.undefined)
    
    @scala.inline
    def setEnableInternetAccess(value: BooleanObject): Self = StObject.set(x, "EnableInternetAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInternetAccessUndefined: Self = StObject.set(x, "EnableInternetAccess", js.undefined)
    
    @scala.inline
    def setEnableMaintenanceMode(value: BooleanObject): Self = StObject.set(x, "EnableMaintenanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMaintenanceModeUndefined: Self = StObject.set(x, "EnableMaintenanceMode", js.undefined)
    
    @scala.inline
    def setEnableWorkDocs(value: BooleanObject): Self = StObject.set(x, "EnableWorkDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableWorkDocsUndefined: Self = StObject.set(x, "EnableWorkDocs", js.undefined)
    
    @scala.inline
    def setUserEnabledAsLocalAdministrator(value: BooleanObject): Self = StObject.set(x, "UserEnabledAsLocalAdministrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEnabledAsLocalAdministratorUndefined: Self = StObject.set(x, "UserEnabledAsLocalAdministrator", js.undefined)
  }
}
