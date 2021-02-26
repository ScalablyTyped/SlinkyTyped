package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends StObject {
  
  /**
    * If the option requires access to a port, then this DB security group allows access to the port.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.native
  
  /**
    * The description of the option.
    */
  var OptionDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[String] = js.native
  
  /**
    * The option settings for this option.
    */
  var OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.native
  
  /**
    * The version of the option.
    */
  var OptionVersion: js.UndefOr[String] = js.native
  
  /**
    * Indicate if this option is permanent.
    */
  var Permanent: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicate if this option is persistent.
    */
  var Persistent: js.UndefOr[Boolean] = js.native
  
  /**
    * If required, the port configured for this option to use.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * If the option requires access to a port, then this VPC security group allows access to the port.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}
object Option {
  
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSecurityGroupMemberships(value: DBSecurityGroupMembershipList): Self = StObject.set(x, "DBSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupMembershipsUndefined: Self = StObject.set(x, "DBSecurityGroupMemberships", js.undefined)
    
    @scala.inline
    def setDBSecurityGroupMembershipsVarargs(value: DBSecurityGroupMembership*): Self = StObject.set(x, "DBSecurityGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setOptionDescription(value: String): Self = StObject.set(x, "OptionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionDescriptionUndefined: Self = StObject.set(x, "OptionDescription", js.undefined)
    
    @scala.inline
    def setOptionName(value: String): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionNameUndefined: Self = StObject.set(x, "OptionName", js.undefined)
    
    @scala.inline
    def setOptionSettings(value: OptionSettingConfigurationList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    @scala.inline
    def setOptionSettingsVarargs(value: OptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value :_*))
    
    @scala.inline
    def setOptionVersion(value: String): Self = StObject.set(x, "OptionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionVersionUndefined: Self = StObject.set(x, "OptionVersion", js.undefined)
    
    @scala.inline
    def setPermanent(value: Boolean): Self = StObject.set(x, "Permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentUndefined: Self = StObject.set(x, "Permanent", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "Persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "Persistent", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupMemberships(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupMembershipsUndefined: Self = StObject.set(x, "VpcSecurityGroupMemberships", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupMembershipsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroupMemberships", js.Array(value :_*))
  }
}
