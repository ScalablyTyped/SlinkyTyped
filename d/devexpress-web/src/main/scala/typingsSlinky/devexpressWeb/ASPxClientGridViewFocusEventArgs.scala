package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the corresponding event.
  */
@js.native
trait ASPxClientGridViewFocusEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether the row focusing has been changed on the server.
    */
  var isChangedOnServer: Boolean = js.native
}

object ASPxClientGridViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean): ASPxClientGridViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewFocusEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewFocusEventArgsOps[Self <: ASPxClientGridViewFocusEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsChangedOnServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChangedOnServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

