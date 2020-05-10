package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfrastructureConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which the infrastructure configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The date on which the infrastructure configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  /**
    * The description of the infrastructure configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The instance profile of the infrastructure configuration.
    */
  var instanceProfileName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The instance types of the infrastructure configuration.
    */
  var instanceTypes: js.UndefOr[InstanceTypeList] = js.native
  /**
    * The EC2 key pair of the infrastructure configuration.
    */
  var keyPair: js.UndefOr[NonEmptyString] = js.native
  /**
    * The logging configuration of the infrastructure configuration.
    */
  var logging: js.UndefOr[Logging] = js.native
  /**
    * The name of the infrastructure configuration.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The security group IDs of the infrastructure configuration.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.native
  /**
    * The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
    */
  var snsTopicArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The subnet ID of the infrastructure configuration.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The tags of the infrastructure configuration.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The terminate instance on failure configuration of the infrastructure configuration.
    */
  var terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.native
}

object InfrastructureConfiguration {
  @scala.inline
  def apply(): InfrastructureConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfrastructureConfiguration]
  }
  @scala.inline
  implicit class InfrastructureConfigurationOps[Self <: InfrastructureConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ImageBuilderArn): Self = {
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
    def withDateCreated(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withDateUpdated(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceProfileName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfileName")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTypes(value: InstanceTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPair(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPair")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Logging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: SecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
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
    @scala.inline
    def withTerminateInstanceOnFailure(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateInstanceOnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateInstanceOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateInstanceOnFailure")(js.undefined)
        ret
    }
  }
  
}

