package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReason extends js.Object {
  val Reason: Double = js.native
}

object AnonReason {
  @scala.inline
  def apply(Reason: Double): AnonReason = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReason]
  }
  @scala.inline
  implicit class AnonReasonOps[Self <: AnonReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

