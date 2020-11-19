package typingsSlinky.pusherChatkitClient.messageMod

import typingsSlinky.pusherChatkitClient.roomMod.PusherRoom
import typingsSlinky.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PusherMessage extends js.Object {
  
  var createdAt: js.Date = js.native
  
  var id: Double = js.native
  
  var parts: js.Array[MessagePart] = js.native
  
  var room: PusherRoom = js.native
  
  var sender: PusherUser = js.native
  
  var updatedAt: js.Date = js.native
}
object PusherMessage {
  
  @scala.inline
  def apply(
    createdAt: js.Date,
    id: Double,
    parts: js.Array[MessagePart],
    room: PusherRoom,
    sender: PusherUser,
    updatedAt: js.Date
  ): PusherMessage = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PusherMessage]
  }
  
  @scala.inline
  implicit class PusherMessageOps[Self <: PusherMessage] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: js.Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsVarargs(value: MessagePart*): Self = this.set("parts", js.Array(value :_*))
    
    @scala.inline
    def setParts(value: js.Array[MessagePart]): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: PusherRoom): Self = this.set("room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: PusherUser): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
}
