package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an image annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponse extends js.Object {
  /**
    * If present, contextual information is needed to understand where this
    * image comes from.
    */
  var context: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1ImageAnnotationContext] = js.native
  /**
    * If present, crop hints have completed successfully.
    */
  var cropHintsAnnotation: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation] = js.native
  /**
    * If set, represents the error message for the operation. Note that
    * filled-in image annotations are guaranteed to be correct, even when
    * `error` is set.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * If present, face detection has completed successfully.
    */
  var faceAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1FaceAnnotation]] = js.native
  /**
    * If present, text (OCR) detection or document (OCR) text detection has
    * completed successfully. This annotation provides the structural hierarchy
    * for the OCR detected text.
    */
  var fullTextAnnotation: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1TextAnnotation] = js.native
  /**
    * If present, image properties were extracted successfully.
    */
  var imagePropertiesAnnotation: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1ImageProperties] = js.native
  /**
    * If present, label detection has completed successfully.
    */
  var labelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1EntityAnnotation]] = js.native
  /**
    * If present, landmark detection has completed successfully.
    */
  var landmarkAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1EntityAnnotation]] = js.native
  /**
    * If present, localized object detection has completed successfully. This
    * will be sorted descending by confidence score.
    */
  var localizedObjectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1LocalizedObjectAnnotation]] = js.native
  /**
    * If present, logo detection has completed successfully.
    */
  var logoAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1EntityAnnotation]] = js.native
  /**
    * If present, product search has completed successfully.
    */
  var productSearchResults: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1ProductSearchResults] = js.native
  /**
    * If present, safe-search annotation has completed successfully.
    */
  var safeSearchAnnotation: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1SafeSearchAnnotation] = js.native
  /**
    * If present, text (OCR) detection has completed successfully.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1EntityAnnotation]] = js.native
  /**
    * If present, web detection has completed successfully.
    */
  var webDetection: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1WebDetection] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponseOps[Self <: SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: SchemaGoogleCloudVisionV1p3beta1ImageAnnotationContext): Self = {
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
    def withCropHintsAnnotation(value: SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation): Self = {
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
    def withFaceAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p3beta1FaceAnnotation]): Self = {
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
    def withFullTextAnnotation(value: SchemaGoogleCloudVisionV1p3beta1TextAnnotation): Self = {
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
    def withImagePropertiesAnnotation(value: SchemaGoogleCloudVisionV1p3beta1ImageProperties): Self = {
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
    def withLabelAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p3beta1EntityAnnotation]): Self = {
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
    def withLandmarkAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p3beta1EntityAnnotation]): Self = {
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
    def withLocalizedObjectAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p3beta1LocalizedObjectAnnotation]): Self = {
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
    def withLogoAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p3beta1EntityAnnotation]): Self = {
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
    def withProductSearchResults(value: SchemaGoogleCloudVisionV1p3beta1ProductSearchResults): Self = {
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
    def withSafeSearchAnnotation(value: SchemaGoogleCloudVisionV1p3beta1SafeSearchAnnotation): Self = {
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
    def withTextAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p3beta1EntityAnnotation]): Self = {
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
    def withWebDetection(value: SchemaGoogleCloudVisionV1p3beta1WebDetection): Self = {
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

