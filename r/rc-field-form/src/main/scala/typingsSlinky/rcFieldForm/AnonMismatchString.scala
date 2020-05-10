package typingsSlinky.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMismatchString extends js.Object {
  var mismatch: String = js.native
}

object AnonMismatchString {
  @scala.inline
  def apply(mismatch: String): AnonMismatchString = {
    val __obj = js.Dynamic.literal(mismatch = mismatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMismatchString]
  }
  @scala.inline
  implicit class AnonMismatchStringOps[Self <: AnonMismatchString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMismatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mismatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

