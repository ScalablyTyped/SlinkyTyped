package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Multiple image annotation requests are batched into a single service call.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest extends js.Object {
  /**
    * Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest]] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesRequestOps[Self <: SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequests(value: js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
  }
  
}

