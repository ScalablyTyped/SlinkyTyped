package typingsSlinky.grommet.anon

import slinky.core.facade.ReactElement
import typingsSlinky.grommet.grommetStrings.error
import typingsSlinky.grommet.grommetStrings.info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
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
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String | ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageReactElement(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setRegexp(value: js.Object): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    @scala.inline
    def setStatus(value: error | info): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
