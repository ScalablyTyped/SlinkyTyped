package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation extends js.Object {
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1CropHint]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotationOps[Self <: SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropHints(value: js.Array[SchemaGoogleCloudVisionV1p1beta1CropHint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHints")(js.undefined)
        ret
    }
  }
  
}

