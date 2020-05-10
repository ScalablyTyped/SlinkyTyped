package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a batch image annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse extends js.Object {
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse]] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponseOps[Self <: SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse]): Self = {
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

