package typingsSlinky.pulumiAws.elastictranscoderPipelineMod

import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PipelineContentConfig
import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PipelineContentConfigPermission
import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PipelineNotifications
import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfig
import typingsSlinky.pulumiAws.inputMod.elastictranscoder.PipelineThumbnailConfigPermission
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineArgs extends js.Object {
  /**
    * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
    */
  val awsKmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
    */
  val contentConfig: js.UndefOr[Input[PipelineContentConfig]] = js.native
  /**
    * The permissions for the `contentConfig` object. (documented below)
    */
  val contentConfigPermissions: js.UndefOr[Input[js.Array[Input[PipelineContentConfigPermission]]]] = js.native
  /**
    * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
    */
  val inputBucket: Input[String] = js.native
  /**
    * The name of the pipeline. Maximum 40 characters
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
    */
  val notifications: js.UndefOr[Input[PipelineNotifications]] = js.native
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
    */
  val outputBucket: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
    */
  val role: Input[String] = js.native
  /**
    * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
    */
  val thumbnailConfig: js.UndefOr[Input[PipelineThumbnailConfig]] = js.native
  /**
    * The permissions for the `thumbnailConfig` object. (documented below)
    */
  val thumbnailConfigPermissions: js.UndefOr[Input[js.Array[Input[PipelineThumbnailConfigPermission]]]] = js.native
}

object PipelineArgs {
  @scala.inline
  def apply(inputBucket: Input[String], role: Input[String]): PipelineArgs = {
    val __obj = js.Dynamic.literal(inputBucket = inputBucket.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArgs]
  }
  @scala.inline
  implicit class PipelineArgsOps[Self <: PipelineArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsKmsKeyArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsKmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsKmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withContentConfig(value: Input[PipelineContentConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withContentConfigPermissions(value: Input[js.Array[Input[PipelineContentConfigPermission]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentConfigPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentConfigPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentConfigPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
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
    def withNotifications(value: Input[PipelineNotifications]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailConfig(value: Input[PipelineThumbnailConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailConfigPermissions(value: Input[js.Array[Input[PipelineThumbnailConfigPermission]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailConfigPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailConfigPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailConfigPermissions")(js.undefined)
        ret
    }
  }
  
}

