package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A face annotation object contains the results of face detection.
  */
@js.native
trait SchemaFaceAnnotation extends js.Object {
  /**
    * Anger likelihood.
    */
  var angerLikelihood: js.UndefOr[String] = js.native
  /**
    * Blurred likelihood.
    */
  var blurredLikelihood: js.UndefOr[String] = js.native
  /**
    * The bounding polygon around the face. The coordinates of the bounding box
    * are in the original image&#39;s scale. The bounding box is computed to
    * &quot;frame&quot; the face in accordance with human expectations. It is
    * based on the landmarker results. Note that one or more x and/or y
    * coordinates may not be generated in the `BoundingPoly` (the polygon will
    * be unbounded) if only a partial face appears in the image to be
    * annotated.
    */
  var boundingPoly: js.UndefOr[SchemaBoundingPoly] = js.native
  /**
    * Detection confidence. Range [0, 1].
    */
  var detectionConfidence: js.UndefOr[Double] = js.native
  /**
    * The `fd_bounding_poly` bounding polygon is tighter than the
    * `boundingPoly`, and encloses only the skin part of the face. Typically,
    * it is used to eliminate the face from any image analysis that detects the
    * &quot;amount of skin&quot; visible in an image. It is not based on the
    * landmarker results, only on the initial face detection, hence the
    * &lt;code&gt;fd&lt;/code&gt; (face detection) prefix.
    */
  var fdBoundingPoly: js.UndefOr[SchemaBoundingPoly] = js.native
  /**
    * Headwear likelihood.
    */
  var headwearLikelihood: js.UndefOr[String] = js.native
  /**
    * Joy likelihood.
    */
  var joyLikelihood: js.UndefOr[String] = js.native
  /**
    * Face landmarking confidence. Range [0, 1].
    */
  var landmarkingConfidence: js.UndefOr[Double] = js.native
  /**
    * Detected face landmarks.
    */
  var landmarks: js.UndefOr[js.Array[SchemaLandmark]] = js.native
  /**
    * Yaw angle, which indicates the leftward/rightward angle that the face is
    * pointing relative to the vertical plane perpendicular to the image. Range
    * [-180,180].
    */
  var panAngle: js.UndefOr[Double] = js.native
  /**
    * Roll angle, which indicates the amount of clockwise/anti-clockwise
    * rotation of the face relative to the image vertical about the axis
    * perpendicular to the face. Range [-180,180].
    */
  var rollAngle: js.UndefOr[Double] = js.native
  /**
    * Sorrow likelihood.
    */
  var sorrowLikelihood: js.UndefOr[String] = js.native
  /**
    * Surprise likelihood.
    */
  var surpriseLikelihood: js.UndefOr[String] = js.native
  /**
    * Pitch angle, which indicates the upwards/downwards angle that the face is
    * pointing relative to the image&#39;s horizontal plane. Range [-180,180].
    */
  var tiltAngle: js.UndefOr[Double] = js.native
  /**
    * Under-exposed likelihood.
    */
  var underExposedLikelihood: js.UndefOr[String] = js.native
}

object SchemaFaceAnnotation {
  @scala.inline
  def apply(): SchemaFaceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFaceAnnotation]
  }
  @scala.inline
  implicit class SchemaFaceAnnotationOps[Self <: SchemaFaceAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngerLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angerLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngerLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angerLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurredLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurredLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurredLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurredLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundingPoly(value: SchemaBoundingPoly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingPoly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectionConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectionConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectionConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectionConfidence")(js.undefined)
        ret
    }
    @scala.inline
    def withFdBoundingPoly(value: SchemaBoundingPoly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fdBoundingPoly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFdBoundingPoly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fdBoundingPoly")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadwearLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headwearLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadwearLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headwearLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withJoyLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joyLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoyLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joyLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withLandmarkingConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmarkingConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandmarkingConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmarkingConfidence")(js.undefined)
        ret
    }
    @scala.inline
    def withLandmarks(value: js.Array[SchemaLandmark]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withPanAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withRollAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSorrowLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorrowLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorrowLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorrowLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withSurpriseLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surpriseLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurpriseLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surpriseLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withTiltAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiltAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderExposedLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underExposedLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderExposedLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underExposedLikelihood")(js.undefined)
        ret
    }
  }
  
}

