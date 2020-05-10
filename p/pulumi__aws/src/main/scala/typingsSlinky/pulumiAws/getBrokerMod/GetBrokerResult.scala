package typingsSlinky.pulumiAws.getBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.mq.GetBrokerConfiguration
import typingsSlinky.pulumiAws.outputMod.mq.GetBrokerEncryptionOption
import typingsSlinky.pulumiAws.outputMod.mq.GetBrokerInstance
import typingsSlinky.pulumiAws.outputMod.mq.GetBrokerLogs
import typingsSlinky.pulumiAws.outputMod.mq.GetBrokerMaintenanceWindowStartTime
import typingsSlinky.pulumiAws.outputMod.mq.GetBrokerUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerResult extends js.Object {
  val arn: String = js.native
  val autoMinorVersionUpgrade: Boolean = js.native
  val brokerId: String = js.native
  val brokerName: String = js.native
  val configuration: GetBrokerConfiguration = js.native
  val deploymentMode: String = js.native
  val encryptionOptions: js.Array[GetBrokerEncryptionOption] = js.native
  val engineType: String = js.native
  val engineVersion: String = js.native
  val hostInstanceType: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val instances: js.Array[GetBrokerInstance] = js.native
  val logs: js.UndefOr[GetBrokerLogs] = js.native
  val maintenanceWindowStartTime: GetBrokerMaintenanceWindowStartTime = js.native
  val publiclyAccessible: Boolean = js.native
  val securityGroups: js.Array[String] = js.native
  val subnetIds: js.Array[String] = js.native
  val tags: StringDictionary[js.Any] = js.native
  val users: js.Array[GetBrokerUser] = js.native
}

object GetBrokerResult {
  @scala.inline
  def apply(
    arn: String,
    autoMinorVersionUpgrade: Boolean,
    brokerId: String,
    brokerName: String,
    configuration: GetBrokerConfiguration,
    deploymentMode: String,
    encryptionOptions: js.Array[GetBrokerEncryptionOption],
    engineType: String,
    engineVersion: String,
    hostInstanceType: String,
    id: String,
    instances: js.Array[GetBrokerInstance],
    maintenanceWindowStartTime: GetBrokerMaintenanceWindowStartTime,
    publiclyAccessible: Boolean,
    securityGroups: js.Array[String],
    subnetIds: js.Array[String],
    tags: StringDictionary[js.Any],
    users: js.Array[GetBrokerUser]
  ): GetBrokerResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], autoMinorVersionUpgrade = autoMinorVersionUpgrade.asInstanceOf[js.Any], brokerId = brokerId.asInstanceOf[js.Any], brokerName = brokerName.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], deploymentMode = deploymentMode.asInstanceOf[js.Any], encryptionOptions = encryptionOptions.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], maintenanceWindowStartTime = maintenanceWindowStartTime.asInstanceOf[js.Any], publiclyAccessible = publiclyAccessible.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrokerResult]
  }
  @scala.inline
  implicit class GetBrokerResultOps[Self <: GetBrokerResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMinorVersionUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMinorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrokerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrokerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: GetBrokerConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionOptions(value: js.Array[GetBrokerEncryptionOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstances(value: js.Array[GetBrokerInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintenanceWindowStartTime(value: GetBrokerMaintenanceWindowStartTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindowStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubliclyAccessible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[GetBrokerUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogs(value: GetBrokerLogs): Self = {
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
  }
  
}

