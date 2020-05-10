package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A face-specific landmark (for example, a face feature).
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark extends js.Object {
  /**
    * Face landmark position.
    */
  var position: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1Position] = js.native
  /**
    * Face landmark type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmarkOps[Self <: SchemaGoogleCloudVisionV1p1beta1FaceAnnotationLandmark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: SchemaGoogleCloudVisionV1p1beta1Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

