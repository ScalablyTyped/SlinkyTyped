package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to server-side errors that occured during callback processing.
  */
@js.native
trait ASPxClientCallbackErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the event is handled and the default error handling actions are not required.
    */
  var handled: Boolean = js.native
  /**
    * Gets the error message that describes the server error that occurred.
    */
  var message: String = js.native
}

object ASPxClientCallbackErrorEventArgs {
  @scala.inline
  def apply(handled: Boolean, message: String): ASPxClientCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCallbackErrorEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCallbackErrorEventArgsOps[Self <: ASPxClientCallbackErrorEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

