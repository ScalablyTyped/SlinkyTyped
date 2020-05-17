package typingsSlinky.projectOxford.mod.FaceResponses

import typingsSlinky.projectOxford.anon.Confidence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identify extends js.Object {
  var candidates: js.Array[Confidence] = js.native
  var faceId: String = js.native
}

object Identify {
  @scala.inline
  def apply(candidates: js.Array[Confidence], faceId: String): Identify = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identify]
  }
  @scala.inline
  implicit class IdentifyOps[Self <: Identify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidates(value: js.Array[Confidence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

