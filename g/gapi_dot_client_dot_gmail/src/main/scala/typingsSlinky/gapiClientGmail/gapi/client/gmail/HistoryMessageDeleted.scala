package typingsSlinky.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryMessageDeleted extends js.Object {
  
  var message: js.UndefOr[Message] = js.native
}
object HistoryMessageDeleted {
  
  @scala.inline
  def apply(): HistoryMessageDeleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryMessageDeleted]
  }
  
  @scala.inline
  implicit class HistoryMessageDeletedOps[Self <: HistoryMessageDeleted] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
