package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
@js.native
trait SchemaAnnotateImageRequest extends js.Object {
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaFeature]] = js.native
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaImageContext] = js.native
}

object SchemaAnnotateImageRequest {
  @scala.inline
  def apply(): SchemaAnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateImageRequest]
  }
  @scala.inline
  implicit class SchemaAnnotateImageRequestOps[Self <: SchemaAnnotateImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[SchemaFeature]): Self = {
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
    def withImage(value: SchemaImage): Self = {
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
    def withImageContext(value: SchemaImageContext): Self = {
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

