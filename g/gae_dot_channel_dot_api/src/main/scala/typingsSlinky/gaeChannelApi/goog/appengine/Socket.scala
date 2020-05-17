package typingsSlinky.gaeChannelApi.goog.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  /**
  		 * Set this property to a function called when an error occurs on the socket.
  		 * The function is passed one parameter: an error object.
  		 * The description field is a description of the error and the code field is an HTTP error code indicating the error.
  		 */
  var onerror: js.Function = js.native
  /**
  		 * Close the socket.
  		 * The socket cannot be used again after calling close; the server must create a new socket.
  		 */
  def close(): Unit = js.native
  /**
  		 * Set this property to a function that called when the socket is closed.
  		 * When the socket is closed, it cannot be reopened.
  		 * Use the open() method on a goog.appengine.Channel object to create a new socket.
  		 */
  def onclose(): Unit = js.native
  /**
  		 * Set this to a function called when the socket receives a message.
  		 * The function is passed one parameter: a message object.
  		 * The data field of this object is the string passed to the send_message method on the server.
  		 * @param message
  		 * @param message.data
  		 */
  def onmessage(message: js.Any): Unit = js.native
  /**
  		 * Set this to a function called when the socket is ready to receive messages.
  		 */
  def onopen(): Unit = js.native
}

object Socket {
  @scala.inline
  def apply(
    close: () => Unit,
    onclose: () => Unit,
    onerror: js.Function,
    onmessage: js.Any => Unit,
    onopen: () => Unit
  ): Socket = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), onclose = js.Any.fromFunction0(onclose), onerror = onerror.asInstanceOf[js.Any], onmessage = js.Any.fromFunction1(onmessage), onopen = js.Any.fromFunction0(onopen))
    __obj.asInstanceOf[Socket]
  }
  @scala.inline
  implicit class SocketOps[Self <: Socket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnclose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnerror(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmessage(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnopen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

