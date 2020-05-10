package typingsSlinky.rcFieldForm

import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMismatch extends js.Object {
  var mismatch: js.UndefOr[ValidateMessage] = js.native
}

object AnonMismatch {
  @scala.inline
  def apply(): AnonMismatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMismatch]
  }
  @scala.inline
  implicit class AnonMismatchOps[Self <: AnonMismatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMismatchFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mismatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMismatch(value: ValidateMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mismatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMismatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mismatch")(js.undefined)
        ret
    }
  }
  
}

