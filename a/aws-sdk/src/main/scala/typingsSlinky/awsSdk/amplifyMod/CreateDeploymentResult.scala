package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentResult extends js.Object {
  /**
    *  When the fileMap argument is provided in the request, the fileUploadUrls will contain a map of file names to upload url. 
    */
  var fileUploadUrls: FileUploadUrls = js.native
  /**
    *  The jobId for this deployment, will supply to start deployment api. 
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    *  When the fileMap argument is NOT provided. This zipUploadUrl will be returned. 
    */
  var zipUploadUrl: UploadUrl = js.native
}

object CreateDeploymentResult {
  @scala.inline
  def apply(fileUploadUrls: FileUploadUrls, zipUploadUrl: UploadUrl): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal(fileUploadUrls = fileUploadUrls.asInstanceOf[js.Any], zipUploadUrl = zipUploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentResult]
  }
  @scala.inline
  implicit class CreateDeploymentResultOps[Self <: CreateDeploymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileUploadUrls(value: FileUploadUrls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUploadUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipUploadUrl(value: UploadUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipUploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
        ret
    }
  }
  
}

