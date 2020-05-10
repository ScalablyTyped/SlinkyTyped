package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBrokerRequest extends js.Object {
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
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
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
    * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
    */
  var SubnetIds: js.UndefOr[listOfString] = js.native
  /**
    * Create tags when creating the broker.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
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
  implicit class CreateBrokerRequestOps[Self <: CreateBrokerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMinorVersionUpgrade(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMinorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMinorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMinorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: ConfigurationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorRequestId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentMode(value: DeploymentMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionOptions(value: EncryptionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineType(value: EngineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineType")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withHostInstanceType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostInstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLogs(value: Logs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindowStartTime(value: WeeklyStartTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceWindowStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindowStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceWindowStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPubliclyAccessible(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubliclyAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAccessible")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageType(value: BrokerStorageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: mapOfString): Self = {
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
    def withUsers(value: listOfUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(js.undefined)
        ret
    }
  }
  
}

