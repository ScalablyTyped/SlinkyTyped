package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticFocusEvent[HTMLInputElement]] = js.native
  
  var value: String = js.native
}
object `1` {
  
  @scala.inline
  def apply(
    event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticFocusEvent[HTMLInputElement]],
    value: String
  ): `1` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(
      value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticFocusEvent[HTMLInputElement]]
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
