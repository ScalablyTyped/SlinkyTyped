package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a single file annotation request. A file may contain one or
  * more images, which individually have their own responses.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponse extends js.Object {
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1InputConfig] = js.native
  /**
    * Individual responses to images found within the file.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponse]] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponseOps[Self <: SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputConfig(value: SchemaGoogleCloudVisionV1p3beta1InputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withResponses(value: js.Array[SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(js.undefined)
        ret
    }
  }
  
}

