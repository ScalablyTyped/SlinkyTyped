package typingsSlinky.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetections extends js.Object {
  var detections: js.Array[js.Array[AnonConfidence]] = js.native
}

object AnonDetections {
  @scala.inline
  def apply(detections: js.Array[js.Array[AnonConfidence]]): AnonDetections = {
    val __obj = js.Dynamic.literal(detections = detections.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetections]
  }
  @scala.inline
  implicit class AnonDetectionsOps[Self <: AnonDetections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetections(value: js.Array[js.Array[AnonConfidence]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

