package typingsSlinky.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Explicit content annotation (based on per-frame visual signals only). If no
  * explicit content has been detected in a frame, no annotations are present
  * for that frame.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation extends js.Object {
  /**
    * All video frames where explicit content was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotationOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(js.undefined)
        ret
    }
  }
  
}

