package typingsSlinky.procfsStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMissed extends js.Object {
  var Missed: String = js.native
}

object AnonMissed {
  @scala.inline
  def apply(Missed: String): AnonMissed = {
    val __obj = js.Dynamic.literal(Missed = Missed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMissed]
  }
  @scala.inline
  implicit class AnonMissedOps[Self <: AnonMissed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Missed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

