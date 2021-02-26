package typingsSlinky.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBrokerRequest extends StObject {
  
  /**
    * The authentication strategy used to secure the broker.
    */
  var AuthenticationStrategy: js.UndefOr[typingsSlinky.awsSdk.mqMod.AuthenticationStrategy] = js.native
  
  /**
    * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.native
  
  /**
    * Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.native
  
  /**
    * A list of information about the configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.native
  
  /**
    * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action. Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the creatorRequestId if your application doesn't require idempotency.
    */
  var CreatorRequestId: js.UndefOr[string] = js.native
  
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typingsSlinky.awsSdk.mqMod.DeploymentMode] = js.native
  
  /**
    * Encryption options for the broker.
    */
  var EncryptionOptions: js.UndefOr[typingsSlinky.awsSdk.mqMod.EncryptionOptions] = js.native
  
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
    */
  var EngineType: js.UndefOr[typingsSlinky.awsSdk.mqMod.EngineType] = js.native
  
  /**
    * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.native
  
  /**
    * Required. The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  
  /**
    * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  var LdapServerMetadata: js.UndefOr[LdapServerMetadataInput] = js.native
  
  /**
    * Enables Amazon CloudWatch logging for brokers.
    */
  var Logs: js.UndefOr[typingsSlinky.awsSdk.mqMod.Logs] = js.native
  
  /**
    * The parameters that determine the WeeklyStartTime.
    */
  var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.native
  
  /**
    * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
    */
  var PubliclyAccessible: js.UndefOr[boolean] = js.native
  
  /**
    * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
  
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.native
  
  /**
    * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements when deployed with public accessibility, deployment without public accessibility requires at least one subnet.
    */
  var SubnetIds: js.UndefOr[listOfString] = js.native
  
  /**
    * Create tags when creating the broker.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  
  /**
    * Required. The list of broker users (persons or applications) who can access queues and topics. For RabbitMQ brokers, one and only one administrative user is accepted and created when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API calls directly to brokers or via the RabbitMQ Web Console. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Users: js.UndefOr[listOfUser] = js.native
}
object CreateBrokerRequest {
  
  @scala.inline
  def apply(): CreateBrokerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBrokerRequest]
  }
  
  @scala.inline
  implicit class CreateBrokerRequestMutableBuilder[Self <: CreateBrokerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setBrokerName(value: string): Self = StObject.set(x, "BrokerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerNameUndefined: Self = StObject.set(x, "BrokerName", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ConfigurationId): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: string): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDeploymentMode(value: DeploymentMode): Self = StObject.set(x, "DeploymentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentModeUndefined: Self = StObject.set(x, "DeploymentMode", js.undefined)
    
    @scala.inline
    def setEncryptionOptions(value: EncryptionOptions): Self = StObject.set(x, "EncryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionOptionsUndefined: Self = StObject.set(x, "EncryptionOptions", js.undefined)
    
    @scala.inline
    def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    @scala.inline
    def setLdapServerMetadata(value: LdapServerMetadataInput): Self = StObject.set(x, "LdapServerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLdapServerMetadataUndefined: Self = StObject.set(x, "LdapServerMetadata", js.undefined)
    
    @scala.inline
    def setLogs(value: Logs): Self = StObject.set(x, "Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsUndefined: Self = StObject.set(x, "Logs", js.undefined)
    
    @scala.inline
    def setMaintenanceWindowStartTime(value: WeeklyStartTime): Self = StObject.set(x, "MaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "MaintenanceWindowStartTime", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setStorageType(value: BrokerStorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: listOfString): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setUsers(value: listOfUser): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: User*): Self = StObject.set(x, "Users", js.Array(value :_*))
  }
}
