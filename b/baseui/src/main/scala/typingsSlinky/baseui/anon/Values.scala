package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values extends StObject {
  
  var event: SyntheticEvent[EventTarget with HTMLInputElement, org.scalajs.dom.raw.Event] = js.native
  
  var values: js.Array[String] = js.native
}
object Values {
  
  @scala.inline
  def apply(
    event: SyntheticEvent[EventTarget with HTMLInputElement, org.scalajs.dom.raw.Event],
    values: js.Array[String]
  ): Values = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  @scala.inline
  implicit class ValuesMutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticEvent[EventTarget with HTMLInputElement, org.scalajs.dom.raw.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
