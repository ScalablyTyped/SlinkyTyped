package typingsSlinky.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingOptions extends StObject {
  
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.native
}
object MessagingOptions {
  
  @scala.inline
  def apply(): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingOptions]
  }
  
  @scala.inline
  implicit class MessagingOptionsMutableBuilder[Self <: MessagingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
  }
}
