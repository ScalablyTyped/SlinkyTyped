package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalEvent extends js.Object {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var query: String = js.native
}
object OriginalEvent {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, query: String): OriginalEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEvent]
  }
  
  @scala.inline
  implicit class OriginalEventOps[Self <: OriginalEvent] (val x: Self) extends AnyVal {
    
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
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
