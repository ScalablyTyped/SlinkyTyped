package typingsSlinky.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Confidence extends js.Object {
  var confidence: Double = js.native
  var personId: String = js.native
}

object Confidence {
  @scala.inline
  def apply(confidence: Double, personId: String): Confidence = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], personId = personId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confidence]
  }
  @scala.inline
  implicit class ConfidenceOps[Self <: Confidence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

