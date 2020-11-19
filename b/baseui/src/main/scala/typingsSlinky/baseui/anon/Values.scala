package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values extends js.Object {
  
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
  implicit class ValuesOps[Self <: Values] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: SyntheticEvent[EventTarget with HTMLInputElement, org.scalajs.dom.raw.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
