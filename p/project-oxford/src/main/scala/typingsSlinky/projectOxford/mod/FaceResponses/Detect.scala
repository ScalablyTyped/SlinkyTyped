package typingsSlinky.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detect extends js.Object {
  var attributes: Attributes = js.native
  var faceId: String = js.native
  var faceLandmarks: FaceLandmarks = js.native
  var faceRectangle: FaceRectangle = js.native
}

object Detect {
  @scala.inline
  def apply(attributes: Attributes, faceId: String, faceLandmarks: FaceLandmarks, faceRectangle: FaceRectangle): Detect = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any], faceLandmarks = faceLandmarks.asInstanceOf[js.Any], faceRectangle = faceRectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detect]
  }
  @scala.inline
  implicit class DetectOps[Self <: Detect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaceLandmarks(value: FaceLandmarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceLandmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaceRectangle(value: FaceRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceRectangle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

