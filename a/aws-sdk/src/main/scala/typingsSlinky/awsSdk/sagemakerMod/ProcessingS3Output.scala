package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingS3Output extends js.Object {
  /**
    * The local path to the Amazon S3 bucket where you want Amazon SageMaker to save the results of an processing job. LocalPath is an absolute path to the input data.
    */
  var LocalPath: ProcessingLocalPath = js.native
  /**
    * Whether to upload the results of the processing job continuously or after the job completes.
    */
  var S3UploadMode: ProcessingS3UploadMode = js.native
  /**
    * A URI that identifies the Amazon S3 bucket where you want Amazon SageMaker to save the results of a processing job.
    */
  var S3Uri: typingsSlinky.awsSdk.sagemakerMod.S3Uri = js.native
}

object ProcessingS3Output {
  @scala.inline
  def apply(LocalPath: ProcessingLocalPath, S3UploadMode: ProcessingS3UploadMode, S3Uri: S3Uri): ProcessingS3Output = {
    val __obj = js.Dynamic.literal(LocalPath = LocalPath.asInstanceOf[js.Any], S3UploadMode = S3UploadMode.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingS3Output]
  }
  @scala.inline
  implicit class ProcessingS3OutputOps[Self <: ProcessingS3Output] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalPath(value: ProcessingLocalPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3UploadMode(value: ProcessingS3UploadMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3UploadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Uri(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

