package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticKeyboardEvent[HTMLInputElement]] = js.native
  
  var value: String = js.native
}
object `2` {
  
  @scala.inline
  def apply(
    event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticKeyboardEvent[HTMLInputElement]],
    value: String
  ): `2` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(
      value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticKeyboardEvent[HTMLInputElement]]
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
