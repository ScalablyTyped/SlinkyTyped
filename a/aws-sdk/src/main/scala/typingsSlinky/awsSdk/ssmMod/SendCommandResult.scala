package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCommandResult extends js.Object {
  /**
    * The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.
    */
  var Command: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Command] = js.native
}

object SendCommandResult {
  @scala.inline
  def apply(): SendCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandResult]
  }
  @scala.inline
  implicit class SendCommandResultOps[Self <: SendCommandResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(js.undefined)
        ret
    }
  }
  
}

