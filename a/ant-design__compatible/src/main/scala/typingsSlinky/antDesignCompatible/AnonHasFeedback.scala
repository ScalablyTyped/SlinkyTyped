package typingsSlinky.antDesignCompatible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasFeedback extends js.Object {
  var hasFeedback: Boolean = js.native
}

object AnonHasFeedback {
  @scala.inline
  def apply(hasFeedback: Boolean): AnonHasFeedback = {
    val __obj = js.Dynamic.literal(hasFeedback = hasFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasFeedback]
  }
  @scala.inline
  implicit class AnonHasFeedbackOps[Self <: AnonHasFeedback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasFeedback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFeedback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

