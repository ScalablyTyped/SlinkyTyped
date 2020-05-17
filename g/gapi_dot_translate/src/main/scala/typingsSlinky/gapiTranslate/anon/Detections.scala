package typingsSlinky.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detections extends js.Object {
  var detections: js.Array[js.Array[Confidence]] = js.native
}

object Detections {
  @scala.inline
  def apply(detections: js.Array[js.Array[Confidence]]): Detections = {
    val __obj = js.Dynamic.literal(detections = detections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detections]
  }
  @scala.inline
  implicit class DetectionsOps[Self <: Detections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetections(value: js.Array[js.Array[Confidence]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

