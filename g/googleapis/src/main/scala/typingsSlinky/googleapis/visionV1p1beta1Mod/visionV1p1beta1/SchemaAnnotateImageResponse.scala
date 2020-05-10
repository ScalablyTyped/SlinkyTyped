package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an image annotation request.
  */
@js.native
trait SchemaAnnotateImageResponse extends js.Object {
  /**
    * If present, contextual information is needed to understand where this
    * image comes from.
    */
  var context: js.UndefOr[SchemaImageAnnotationContext] = js.native
  /**
    * If present, crop hints have completed successfully.
    */
  var cropHintsAnnotation: js.UndefOr[SchemaCropHintsAnnotation] = js.native
  /**
    * If set, represents the error message for the operation. Note that
    * filled-in image annotations are guaranteed to be correct, even when
    * `error` is set.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * If present, face detection has completed successfully.
    */
  var faceAnnotations: js.UndefOr[js.Array[SchemaFaceAnnotation]] = js.native
  /**
    * If present, text (OCR) detection or document (OCR) text detection has
    * completed successfully. This annotation provides the structural hierarchy
    * for the OCR detected text.
    */
  var fullTextAnnotation: js.UndefOr[SchemaTextAnnotation] = js.native
  /**
    * If present, image properties were extracted successfully.
    */
  var imagePropertiesAnnotation: js.UndefOr[SchemaImageProperties] = js.native
  /**
    * If present, label detection has completed successfully.
    */
  var labelAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.native
  /**
    * If present, landmark detection has completed successfully.
    */
  var landmarkAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.native
  /**
    * If present, localized object detection has completed successfully. This
    * will be sorted descending by confidence score.
    */
  var localizedObjectAnnotations: js.UndefOr[js.Array[SchemaLocalizedObjectAnnotation]] = js.native
  /**
    * If present, logo detection has completed successfully.
    */
  var logoAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.native
  /**
    * If present, product search has completed successfully.
    */
  var productSearchResults: js.UndefOr[SchemaProductSearchResults] = js.native
  /**
    * If present, safe-search annotation has completed successfully.
    */
  var safeSearchAnnotation: js.UndefOr[SchemaSafeSearchAnnotation] = js.native
  /**
    * If present, text (OCR) detection has completed successfully.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaEntityAnnotation]] = js.native
  /**
    * If present, web detection has completed successfully.
    */
  var webDetection: js.UndefOr[SchemaWebDetection] = js.native
}

object SchemaAnnotateImageResponse {
  @scala.inline
  def apply(): SchemaAnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateImageResponse]
  }
  @scala.inline
  implicit class SchemaAnnotateImageResponseOps[Self <: SchemaAnnotateImageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: SchemaImageAnnotationContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withCropHintsAnnotation(value: SchemaCropHintsAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHintsAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropHintsAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHintsAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: SchemaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceAnnotations(value: js.Array[SchemaFaceAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withFullTextAnnotation(value: SchemaTextAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTextAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullTextAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTextAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePropertiesAnnotation(value: SchemaImageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePropertiesAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePropertiesAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePropertiesAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAnnotations(value: js.Array[SchemaEntityAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withLandmarkAnnotations(value: js.Array[SchemaEntityAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmarkAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandmarkAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmarkAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizedObjectAnnotations(value: js.Array[SchemaLocalizedObjectAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedObjectAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedObjectAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedObjectAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoAnnotations(value: js.Array[SchemaEntityAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withProductSearchResults(value: SchemaProductSearchResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSearchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSearchResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSearchResults")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeSearchAnnotation(value: SchemaSafeSearchAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearchAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeSearchAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearchAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAnnotations(value: js.Array[SchemaEntityAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withWebDetection(value: SchemaWebDetection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDetection")(js.undefined)
        ret
    }
  }
  
}

