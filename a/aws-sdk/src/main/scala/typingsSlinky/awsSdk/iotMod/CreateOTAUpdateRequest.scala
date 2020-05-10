package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOTAUpdateRequest extends js.Object {
  /**
    * A list of additional OTA update parameters which are name-value pairs.
    */
  var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.native
  /**
    * Configuration for the rollout of OTA updates.
    */
  var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.native
  /**
    * Configuration information for pre-signed URLs.
    */
  var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig] = js.native
  /**
    * The description of the OTA update.
    */
  var description: js.UndefOr[OTAUpdateDescription] = js.native
  /**
    * The files to be streamed by the OTA update.
    */
  var files: OTAUpdateFiles = js.native
  /**
    * The ID of the OTA update to be created.
    */
  var otaUpdateId: OTAUpdateId = js.native
  /**
    * The protocol used to transfer the OTA update image. Valid values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the target device can choose the protocol.
    */
  var protocols: js.UndefOr[Protocols] = js.native
  /**
    * The IAM role that allows access to the AWS IoT Jobs service.
    */
  var roleArn: RoleArn = js.native
  /**
    * Metadata which can be used to manage updates.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing when a change is detected in a target. For example, an update will run on a thing when the thing is added to a target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS | SNAPSHOT.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  /**
    * The targeted devices to receive OTA updates.
    */
  var targets: Targets = js.native
}

object CreateOTAUpdateRequest {
  @scala.inline
  def apply(files: OTAUpdateFiles, otaUpdateId: OTAUpdateId, roleArn: RoleArn, targets: Targets): CreateOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], otaUpdateId = otaUpdateId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOTAUpdateRequest]
  }
  @scala.inline
  implicit class CreateOTAUpdateRequestOps[Self <: CreateOTAUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: OTAUpdateFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtaUpdateId(value: OTAUpdateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: Targets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalParameters(value: AdditionalParameterMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsJobExecutionsRolloutConfig(value: AwsJobExecutionsRolloutConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsJobExecutionsRolloutConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsJobExecutionsRolloutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsJobExecutionsRolloutConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsJobPresignedUrlConfig(value: AwsJobPresignedUrlConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsJobPresignedUrlConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsJobPresignedUrlConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsJobPresignedUrlConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: OTAUpdateDescription): Self = {
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
    def withProtocols(value: Protocols): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
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
    @scala.inline
    def withTargetSelection(value: TargetSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelection")(js.undefined)
        ret
    }
  }
  
}

