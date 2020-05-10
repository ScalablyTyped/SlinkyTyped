package typingsSlinky.pulumiAws.inputMod.ssm

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters extends js.Object {
  /**
    * Information about the command(s) to execute.
    */
  var comment: js.UndefOr[Input[String]] = js.native
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var documentHash: js.UndefOr[Input[String]] = js.native
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
    */
  var documentHashType: js.UndefOr[Input[String]] = js.native
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
    */
  var notificationConfig: js.UndefOr[
    Input[
      MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
    ]
  ] = js.native
  /**
    * The name of the Amazon S3 bucket.
    */
  var outputS3Bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon S3 bucket subfolder.
    */
  var outputS3KeyPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
      ]
    ]
  ] = js.native
  /**
    * The IAM service role to assume during task execution.
    */
  var serviceRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * If this time is reached and the command has not already started executing, it doesn't run.
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters {
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersOps[Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentHash(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentHash")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentHashType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentHashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentHashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentHashType")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationConfig(
      value: Input[
          MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputS3Bucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputS3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputS3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputS3KeyPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputS3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputS3KeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(
      value: Input[
          js.Array[
            Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSeconds")(js.undefined)
        ret
    }
  }
  
}

