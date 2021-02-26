package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueString extends StObject {
  
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLTextAreaElement] = js.native
  
  var value: String = js.native
}
object ValueString {
  
  @scala.inline
  def apply(event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLTextAreaElement], value: String): ValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
  
  @scala.inline
  implicit class ValueStringMutableBuilder[Self <: ValueString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLTextAreaElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
