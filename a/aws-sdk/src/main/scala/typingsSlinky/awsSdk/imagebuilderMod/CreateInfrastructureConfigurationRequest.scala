package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInfrastructureConfigurationRequest extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The description of the infrastructure configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The instance profile to associate with the instance used to customize your EC2 AMI. 
    */
  var instanceProfileName: NonEmptyString = js.native
  /**
    *  The instance types of the infrastructure configuration. You can specify one or more instance types to use for this build. The service will pick one of these instance types based on availability. 
    */
  var instanceTypes: js.UndefOr[InstanceTypeList] = js.native
  /**
    *  The key pair of the infrastructure configuration. This can be used to log on to and debug the instance used to create your image. 
    */
  var keyPair: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The logging configuration of the infrastructure configuration. 
    */
  var logging: js.UndefOr[Logging] = js.native
  /**
    *  The name of the infrastructure configuration. 
    */
  var name: ResourceName = js.native
  /**
    *  The security group IDs to associate with the instance used to customize your EC2 AMI. 
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.native
  /**
    *  The SNS topic on which to send image build events. 
    */
  var snsTopicArn: js.UndefOr[SnsTopicArn] = js.native
  /**
    *  The subnet ID in which to place the instance used to customize your EC2 AMI. 
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The tags of the infrastructure configuration. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    *  The terminate instance on failure setting of the infrastructure configuration. Set to false if you want Image Builder to retain the instance used to configure your AMI if the build or test phase of your workflow fails. 
    */
  var terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.native
}

object CreateInfrastructureConfigurationRequest {
  @scala.inline
  def apply(clientToken: ClientToken, instanceProfileName: NonEmptyString, name: ResourceName): CreateInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], instanceProfileName = instanceProfileName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInfrastructureConfigurationRequest]
  }
  @scala.inline
  implicit class CreateInfrastructureConfigurationRequestOps[Self <: CreateInfrastructureConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceProfileName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withSnsTopicArn(value: SnsTopicArn): Self = {
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

