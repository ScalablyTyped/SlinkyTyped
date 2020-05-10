package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OTAUpdateInfo extends js.Object {
  /**
    * A collection of name/value pairs
    */
  var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.native
  /**
    * The AWS IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.native
  /**
    * The AWS IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.native
  /**
    * Configuration for the rollout of OTA updates.
    */
  var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.native
  /**
    * Configuration information for pre-signed URLs. Valid when protocols contains HTTP.
    */
  var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig] = js.native
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the OTA update.
    */
  var description: js.UndefOr[OTAUpdateDescription] = js.native
  /**
    * Error information associated with the OTA update.
    */
  var errorInfo: js.UndefOr[ErrorInfo] = js.native
  /**
    * The date when the OTA update was last updated.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  /**
    * A list of files associated with the OTA update.
    */
  var otaUpdateFiles: js.UndefOr[OTAUpdateFiles] = js.native
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
  /**
    * The status of the OTA update.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.native
  /**
    * The protocol used to transfer the OTA update image. Valid values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the target device can choose the protocol.
    */
  var protocols: js.UndefOr[Protocols] = js.native
  /**
    * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is added to a target group, even after the OTA update was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  /**
    * The targets of the OTA update.
    */
  var targets: js.UndefOr[Targets] = js.native
}

object OTAUpdateInfo {
  @scala.inline
  def apply(): OTAUpdateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateInfo]
  }
  @scala.inline
  implicit class OTAUpdateInfoOps[Self <: OTAUpdateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAwsIotJobArn(value: AwsIotJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsIotJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsIotJobId(value: AwsIotJobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsIotJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIotJobId")(js.undefined)
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
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
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
    def withErrorInfo(value: ErrorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOtaUpdateArn(value: OTAUpdateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaUpdateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOtaUpdateFiles(value: OTAUpdateFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaUpdateFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withOtaUpdateId(value: OTAUpdateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaUpdateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateId")(js.undefined)
        ret
    }
    @scala.inline
    def withOtaUpdateStatus(value: OTAUpdateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaUpdateStatus")(js.undefined)
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
    @scala.inline
    def withTargets(value: Targets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
  }
  
}

