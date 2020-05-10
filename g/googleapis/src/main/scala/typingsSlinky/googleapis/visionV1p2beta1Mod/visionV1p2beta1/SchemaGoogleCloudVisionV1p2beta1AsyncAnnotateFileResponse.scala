package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a single offline file annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse extends js.Object {
  /**
    * The output location and metadata from AsyncAnnotateFileRequest.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1OutputConfig] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponseOps[Self <: SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputConfig(value: SchemaGoogleCloudVisionV1p2beta1OutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfig")(js.undefined)
        ret
    }
  }
  
}

