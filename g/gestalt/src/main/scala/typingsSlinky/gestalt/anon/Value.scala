package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends js.Object {
  
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement] = js.native
  
  var value: String = js.native
}
object Value {
  
  @scala.inline
  def apply(event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement], value: String): Value = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
