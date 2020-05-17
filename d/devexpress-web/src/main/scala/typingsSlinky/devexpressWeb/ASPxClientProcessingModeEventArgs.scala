package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events which can't be cancelled and allow the event's processing to be passed to the server side.
  */
@js.native
trait ASPxClientProcessingModeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  var processOnServer: Boolean = js.native
}

object ASPxClientProcessingModeEventArgs {
  @scala.inline
  def apply(processOnServer: Boolean): ASPxClientProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientProcessingModeEventArgs]
  }
  @scala.inline
  implicit class ASPxClientProcessingModeEventArgsOps[Self <: ASPxClientProcessingModeEventArgs] (val x: Self) extends AnyVal {
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

