package typingsSlinky.prettier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShouldBreak extends js.Object {
  var shouldBreak: Boolean = js.native
}

object AnonShouldBreak {
  @scala.inline
  def apply(shouldBreak: Boolean): AnonShouldBreak = {
    val __obj = js.Dynamic.literal(shouldBreak = shouldBreak.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShouldBreak]
  }
  @scala.inline
  implicit class AnonShouldBreakOps[Self <: AnonShouldBreak] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShouldBreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBreak")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

