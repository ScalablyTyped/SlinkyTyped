package typingsSlinky.commonsValidatorJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowLocalBoolean extends js.Object {
  var allowLocal: Boolean = js.native
}

object AnonAllowLocalBoolean {
  @scala.inline
  def apply(allowLocal: Boolean): AnonAllowLocalBoolean = {
    val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowLocalBoolean]
  }
  @scala.inline
  implicit class AnonAllowLocalBooleanOps[Self <: AnonAllowLocalBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLocal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

