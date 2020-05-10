package typingsSlinky.pulumiAws.brokerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.mq.BrokerConfiguration
import typingsSlinky.pulumiAws.inputMod.mq.BrokerEncryptionOptions
import typingsSlinky.pulumiAws.inputMod.mq.BrokerLogs
import typingsSlinky.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime
import typingsSlinky.pulumiAws.inputMod.mq.BrokerUser
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerArgs extends js.Object {
  /**
    * Specifies whether any broker modifications
    * are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the broker.
    */
  val brokerName: Input[String] = js.native
  /**
    * Configuration of the broker. See below.
    */
  val configuration: js.UndefOr[Input[BrokerConfiguration]] = js.native
  /**
    * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
    */
  val deploymentMode: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing encryption options. See below.
    */
  val encryptionOptions: js.UndefOr[Input[BrokerEncryptionOptions]] = js.native
  /**
    * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
    */
  val engineType: Input[String] = js.native
  /**
    * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
    */
  val engineVersion: Input[String] = js.native
  /**
    * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
    */
  val hostInstanceType: Input[String] = js.native
  /**
    * Logging configuration of the broker. See below.
    */
  val logs: js.UndefOr[Input[BrokerLogs]] = js.native
  /**
    * Maintenance window start time. See below.
    */
  val maintenanceWindowStartTime: js.UndefOr[Input[BrokerMaintenanceWindowStartTime]] = js.native
  /**
    * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The list of security group IDs assigned to the broker.
    */
  val securityGroups: Input[js.Array[Input[String]]] = js.native
  /**
    * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The list of all ActiveMQ usernames for the specified broker. See below.
    */
  val users: Input[js.Array[Input[BrokerUser]]] = js.native
}

object BrokerArgs {
  @scala.inline
  def apply(
    brokerName: Input[String],
    engineType: Input[String],
    engineVersion: Input[String],
    hostInstanceType: Input[String],
    securityGroups: Input[js.Array[Input[String]]],
    users: Input[js.Array[Input[BrokerUser]]]
  ): BrokerArgs = {
    val __obj = js.Dynamic.literal(brokerName = brokerName.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerArgs]
  }
  @scala.inline
  implicit class BrokerArgsOps[Self <: BrokerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: Input[js.Array[Input[BrokerUser]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyImmediately(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMinorVersionUpgrade(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMinorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMinorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMinorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: Input[BrokerConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionOptions(value: Input[BrokerEncryptionOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLogs(value: Input[BrokerLogs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindowStartTime(value: Input[BrokerMaintenanceWindowStartTime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindowStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindowStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindowStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPubliclyAccessible(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubliclyAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

