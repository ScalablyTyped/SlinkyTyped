package typingsSlinky.antDesignCompatible.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasFeedback extends js.Object {
  var hasFeedback: Boolean = js.native
}

object HasFeedback {
  @scala.inline
  def apply(hasFeedback: Boolean): HasFeedback = {
    val __obj = js.Dynamic.literal(hasFeedback = hasFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasFeedback]
  }
  @scala.inline
  implicit class HasFeedbackOps[Self <: HasFeedback] (val x: Self) extends AnyVal {
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

