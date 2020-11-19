package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.Alt
import typingsSlinky.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatBansResource extends js.Object {
  
  /** Removes a chat ban. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Adds a new ban to the chat. */
  def insert(request: Alt): Request[LiveChatBan] = js.native
}
object LiveChatBansResource {
  
  @scala.inline
  def apply(delete: QuotaUser => Request[Unit], insert: Alt => Request[LiveChatBan]): LiveChatBansResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[LiveChatBansResource]
  }
  
  @scala.inline
  implicit class LiveChatBansResourceOps[Self <: LiveChatBansResource] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: QuotaUser => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: Alt => Request[LiveChatBan]): Self = this.set("insert", js.Any.fromFunction1(value))
  }
}
