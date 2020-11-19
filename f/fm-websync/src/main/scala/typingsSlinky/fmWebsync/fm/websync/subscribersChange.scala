package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait subscribersChange extends js.Object {
  
  /**
    * The clients who subscribed to or unsubscribed from the channel.
    */
  var clients: js.Array[subscribedClient] = js.native
  
  /**
    * The type of the change, either "subscribe" or "unsubscribe".
    */
  var `type`: String = js.native
}
object subscribersChange {
  
  @scala.inline
  def apply(clients: js.Array[subscribedClient], `type`: String): subscribersChange = {
    val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribersChange]
  }
  
  @scala.inline
  implicit class subscribersChangeOps[Self <: subscribersChange] (val x: Self) extends AnyVal {
    
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
    def setClientsVarargs(value: subscribedClient*): Self = this.set("clients", js.Array(value :_*))
    
    @scala.inline
    def setClients(value: js.Array[subscribedClient]): Self = this.set("clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
