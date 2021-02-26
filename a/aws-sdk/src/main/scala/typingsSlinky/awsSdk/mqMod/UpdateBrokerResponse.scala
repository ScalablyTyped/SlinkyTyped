package typingsSlinky.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBrokerResponse extends StObject {
  
  /**
    * The authentication strategy used to secure the broker.
    */
  var AuthenticationStrategy: js.UndefOr[typingsSlinky.awsSdk.mqMod.AuthenticationStrategy] = js.native
  
  /**
    * The new value of automatic upgrades to new minor version for brokers.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.native
  
  /**
    * Required. The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
  
  /**
    * The ID of the updated configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.native
  
  /**
    * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.native
  
  /**
    * The host instance type of the broker to upgrade to. For a list of supported instance types, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  
  /**
    * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  var LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.native
  
  /**
    * The list of information about logs to be enabled for the specified broker.
    */
  var Logs: js.UndefOr[typingsSlinky.awsSdk.mqMod.Logs] = js.native
  
  /**
    * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
}
object UpdateBrokerResponse {
  
  @scala.inline
  def apply(): UpdateBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBrokerResponse]
  }
  
  @scala.inline
  implicit class UpdateBrokerResponseMutableBuilder[Self <: UpdateBrokerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ConfigurationId): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    @scala.inline
    def setLdapServerMetadata(value: LdapServerMetadataOutput): Self = StObject.set(x, "LdapServerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLdapServerMetadataUndefined: Self = StObject.set(x, "LdapServerMetadata", js.undefined)
    
    @scala.inline
    def setLogs(value: Logs): Self = StObject.set(x, "Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsUndefined: Self = StObject.set(x, "Logs", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
  }
}
