package typingsSlinky.projectOxford.mod.FaceResponses

import typingsSlinky.projectOxford.anon.Confidence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identify extends js.Object {
  var candidates: js.Array[Confidence]
  var faceId: String
}

object Identify {
  @scala.inline
  def apply(candidates: js.Array[Confidence], faceId: String): Identify = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identify]
  }
}

