package typingsSlinky.jupyterlabServices.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply[T /* <: MessageType */](date: String, msg_id: String, msg_type: T, session: String, username: String, version: String): IHeader[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], msg_id = msg_id.asInstanceOf[js.Any], msg_type = msg_type.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeader[T]]
  }
  
  @scala.inline
  implicit class IHeaderOps[Self <: IHeader[_], T /* <: MessageType */] (val x: Self with IHeader[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg_id(value: String): Self = this.set("msg_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg_type(value: T): Self = this.set("msg_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: String): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
