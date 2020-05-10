package typingsSlinky.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// request params
@js.native
trait SendParams extends js.Object {
  var Messages: js.Array[SendParamsMessage] = js.native
  var SandboxMode: js.UndefOr[Boolean] = js.native
}

object SendParams {
  @scala.inline
  def apply(Messages: js.Array[SendParamsMessage]): SendParams = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParams]
  }
  @scala.inline
  implicit class SendParamsOps[Self <: SendParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[SendParamsMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSandboxMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SandboxMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandboxMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SandboxMode")(js.undefined)
        ret
    }
  }
  
}

