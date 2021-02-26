package typingsSlinky.reactAutosuggest.mod

import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.`type`
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.click
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.down
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.enter
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.escape
import typingsSlinky.reactAutosuggest.reactAutosuggestStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEvent extends StObject {
  
  var method: down | up | escape | enter | click | `type` = js.native
  
  var newValue: String = js.native
}
object ChangeEvent {
  
  @scala.inline
  def apply(method: down | up | escape | enter | click | `type`, newValue: String): ChangeEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  
  @scala.inline
  implicit class ChangeEventMutableBuilder[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: down | up | escape | enter | click | `type`): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
