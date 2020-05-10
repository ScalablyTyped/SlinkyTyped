package typingsSlinky.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Similar extends js.Object {
  var faceIds: js.Array[String] = js.native
}

object Similar {
  @scala.inline
  def apply(faceIds: js.Array[String]): Similar = {
    val __obj = js.Dynamic.literal(faceIds = faceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Similar]
  }
  @scala.inline
  implicit class SimilarOps[Self <: Similar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaceIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

