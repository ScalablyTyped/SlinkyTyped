package typingsSlinky.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation extends js.Object {
  /** All video frames where explicit content was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2ExplicitContentFrame]] = js.native
}

object GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotationOps[Self <: GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: js.Array[GoogleCloudVideointelligenceV1beta2ExplicitContentFrame]): Self = {
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

