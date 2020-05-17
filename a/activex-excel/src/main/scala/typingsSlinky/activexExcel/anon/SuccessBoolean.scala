package typingsSlinky.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessBoolean extends js.Object {
  val Success: Boolean = js.native
}

object SuccessBoolean {
  @scala.inline
  def apply(Success: Boolean): SuccessBoolean = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessBoolean]
  }
  @scala.inline
  implicit class SuccessBooleanOps[Self <: SuccessBoolean] (val x: Self) extends AnyVal {
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

