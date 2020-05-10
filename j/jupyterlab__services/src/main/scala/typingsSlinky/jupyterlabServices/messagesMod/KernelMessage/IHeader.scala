package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kernel message header content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#general-message-format).
  *
  * **See also:** [[IMessage]]
  */
@js.native
trait IHeader[T /* <: MessageType */] extends js.Object {
  /**
    * ISO 8601 timestamp for when the message is created
    */
  var date: String = js.native
  /**
    * Message id, typically UUID, must be unique per message
    */
  var msg_id: String = js.native
  /**
    * Message type
    */
  var msg_type: T = js.native
  /**
    * Session id, typically UUID, should be unique per session.
    */
  var session: String = js.native
  /**
    * The user sending the message
    */
  var username: String = js.native
  /**
    * The message protocol version, should be 5.1, 5.2, 5.3, etc.
    */
  var version: String = js.native
}

object IHeader {
  @scala.inline
  def apply[T](date: String, msg_id: String, msg_type: T, session: String, username: String, version: String): IHeader[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], msg_id = msg_id.asInstanceOf[js.Any], msg_type = msg_type.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeader[T]]
  }
  @scala.inline
  implicit class IHeaderOps[Self[t] <: IHeader[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDate(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg_type(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

