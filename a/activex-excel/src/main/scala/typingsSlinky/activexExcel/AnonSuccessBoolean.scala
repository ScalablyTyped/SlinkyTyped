package typingsSlinky.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSuccessBoolean extends js.Object {
  val Success: Boolean = js.native
}

object AnonSuccessBoolean {
  @scala.inline
  def apply(Success: Boolean): AnonSuccessBoolean = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuccessBoolean]
  }
  @scala.inline
  implicit class AnonSuccessBooleanOps[Self <: AnonSuccessBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

