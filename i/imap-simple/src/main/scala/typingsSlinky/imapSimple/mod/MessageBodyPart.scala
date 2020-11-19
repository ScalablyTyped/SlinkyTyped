package typingsSlinky.imapSimple.mod

import typingsSlinky.imap.mod.ImapMessageBodyInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageBodyPart extends ImapMessageBodyInfo {
  
  /** string type where which=='TEXT', complex Object where which=='HEADER' */
  var body: js.Any = js.native
}
object MessageBodyPart {
  
  @scala.inline
  def apply(body: js.Any, size: Double, which: String): MessageBodyPart = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBodyPart]
  }
  
  @scala.inline
  implicit class MessageBodyPartOps[Self <: MessageBodyPart] (val x: Self) extends AnyVal {
    
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
  }
}
