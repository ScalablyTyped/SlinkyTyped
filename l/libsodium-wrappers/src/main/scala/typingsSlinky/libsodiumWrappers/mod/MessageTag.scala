package typingsSlinky.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageTag extends StObject {
  
  var message: js.typedarray.Uint8Array = js.native
  
  var tag: Double = js.native
}
object MessageTag {
  
  @scala.inline
  def apply(message: js.typedarray.Uint8Array, tag: Double): MessageTag = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTag]
  }
  
  @scala.inline
  implicit class MessageTagMutableBuilder[Self <: MessageTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
