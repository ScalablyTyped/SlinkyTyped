package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest extends js.Object {
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1Feature]] = js.native
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1Image] = js.native
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1ImageContext] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequestOps[Self <: SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[SchemaGoogleCloudVisionV1p2beta1Feature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SchemaGoogleCloudVisionV1p2beta1Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImageContext(value: SchemaGoogleCloudVisionV1p2beta1ImageContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContext")(js.undefined)
        ret
    }
  }
  
}

