package typingsSlinky.grommet.anon

import slinky.core.facade.ReactElement
import typingsSlinky.grommet.grommetStrings.error
import typingsSlinky.grommet.grommetStrings.info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  var message: js.UndefOr[String | ReactElement] = js.native
  
  var regexp: js.UndefOr[js.Object] = js.native
  
  var status: js.UndefOr[error | info] = js.native
}
object Message {
  
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
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
    def setMessageReactElement(value: ReactElement): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String | ReactElement): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setRegexp(value: js.Object): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    
    @scala.inline
    def setStatus(value: error | info): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
