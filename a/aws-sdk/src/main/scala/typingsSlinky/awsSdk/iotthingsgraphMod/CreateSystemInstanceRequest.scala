package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSystemInstanceRequest extends js.Object {
  var definition: DefinitionDocument = js.native
  /**
    * The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must have read and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it executes. This value is required if the value of the target parameter is CLOUD.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The name of the Greengrass group where the system instance will be deployed. This value is required if the value of the target parameter is GREENGRASS.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.native
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.native
  /**
    * The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system instance's resource file. This value is required if the value of the target parameter is GREENGRASS.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The target type of the deployment. Valid values are GREENGRASS and CLOUD.
    */
  var target: DeploymentTarget = js.native
}

object CreateSystemInstanceRequest {
  @scala.inline
  def apply(definition: DefinitionDocument, target: DeploymentTarget): CreateSystemInstanceRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSystemInstanceRequest]
  }
  @scala.inline
  implicit class CreateSystemInstanceRequestOps[Self <: CreateSystemInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: DefinitionDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: DeploymentTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowActionsRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowActionsRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowActionsRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowActionsRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGreengrassGroupName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreengrassGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricsConfiguration(value: MetricsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketName(value: S3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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

