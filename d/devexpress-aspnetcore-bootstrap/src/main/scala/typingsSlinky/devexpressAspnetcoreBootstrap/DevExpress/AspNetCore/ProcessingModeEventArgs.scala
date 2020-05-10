package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingModeEventArgs extends EventArgs {
  var processOnServer: Boolean = js.native
}

object ProcessingModeEventArgs {
  @scala.inline
  def apply(processOnServer: Boolean, sender: Control): ProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingModeEventArgs]
  }
  @scala.inline
  implicit class ProcessingModeEventArgsOps[Self <: ProcessingModeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessOnServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processOnServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

