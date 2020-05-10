package typingsSlinky.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResetCount extends js.Object {
  var resetCount: Double = js.native
}

object AnonResetCount {
  @scala.inline
  def apply(resetCount: Double): AnonResetCount = {
    val __obj = js.Dynamic.literal(resetCount = resetCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResetCount]
  }
  @scala.inline
  implicit class AnonResetCountOps[Self <: AnonResetCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResetCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

