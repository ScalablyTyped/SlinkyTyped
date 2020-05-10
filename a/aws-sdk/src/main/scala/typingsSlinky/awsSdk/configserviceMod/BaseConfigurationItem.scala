package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConfigurationItem extends js.Object {
  /**
    * The 12-digit AWS account ID associated with the resource.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var arn: js.UndefOr[ARN] = js.native
  /**
    * The Availability Zone associated with the resource.
    */
  var availabilityZone: js.UndefOr[AvailabilityZone] = js.native
  /**
    * The region where the resource resides.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.native
  /**
    * The description of the resource configuration.
    */
  var configuration: js.UndefOr[Configuration] = js.native
  /**
    * The time when the configuration recording was initiated.
    */
  var configurationItemCaptureTime: js.UndefOr[js.Date] = js.native
  /**
    * The configuration item status.
    */
  var configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.native
  /**
    * An identifier that indicates the ordering of the configuration items of a resource.
    */
  var configurationStateId: js.UndefOr[ConfigurationStateId] = js.native
  /**
    * The time stamp when the resource was created.
    */
  var resourceCreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.native
  /**
    * The custom name of the resource, if available.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The type of AWS resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * Configuration attributes that AWS Config returns for certain resource types to supplement the information returned for the configuration parameter.
    */
  var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.native
  /**
    * The version number of the resource configuration.
    */
  var version: js.UndefOr[Version] = js.native
}

object BaseConfigurationItem {
  @scala.inline
  def apply(): BaseConfigurationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfigurationItem]
  }
  @scala.inline
  implicit class BaseConfigurationItemOps[Self <: BaseConfigurationItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: AvailabilityZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsRegion(value: AwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: Configuration): Self = {
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
    def withConfigurationItemCaptureTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationItemCaptureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationItemCaptureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationItemCaptureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationItemStatus(value: ConfigurationItemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationItemStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationItemStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationItemStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationStateId(value: ConfigurationStateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationStateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationStateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationStateId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSupplementaryConfiguration(value: SupplementaryConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementaryConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupplementaryConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementaryConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

