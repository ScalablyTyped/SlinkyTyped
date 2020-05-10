package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringS3Output extends js.Object {
  /**
    * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job. LocalPath is an absolute path for the output data.
    */
  var LocalPath: ProcessingLocalPath = js.native
  /**
    * Whether to upload the results of the monitoring job continuously or after the job completes.
    */
  var S3UploadMode: js.UndefOr[ProcessingS3UploadMode] = js.native
  /**
    * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
    */
  var S3Uri: MonitoringS3Uri = js.native
}

object MonitoringS3Output {
  @scala.inline
  def apply(LocalPath: ProcessingLocalPath, S3Uri: MonitoringS3Uri): MonitoringS3Output = {
    val __obj = js.Dynamic.literal(LocalPath = LocalPath.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringS3Output]
  }
  @scala.inline
  implicit class MonitoringS3OutputOps[Self <: MonitoringS3Output] (val x: Self) extends AnyVal {
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
    def withS3Uri(value: MonitoringS3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3UploadMode(value: ProcessingS3UploadMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3UploadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3UploadMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3UploadMode")(js.undefined)
        ret
    }
  }
  
}

