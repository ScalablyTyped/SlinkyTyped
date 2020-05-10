package typingsSlinky.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Explicit content annotation (based on per-frame visual signals only). If no
  * explicit content has been detected in a frame, no annotations are present
  * for that frame.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation extends js.Object {
  /**
    * All video frames where explicit content was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotationOps[Self <: SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame]): Self = {
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

