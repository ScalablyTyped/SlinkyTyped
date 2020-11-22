package typingsSlinky.naja.anon

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  var element: org.scalajs.dom.raw.Element = js.native
  
  var options: typingsSlinky.naja.najaMod.Options = js.native
  
  var originalEvent: js.UndefOr[Event] = js.native
}
object Element {
  
  @scala.inline
  def apply(element: org.scalajs.dom.raw.Element, options: typingsSlinky.naja.najaMod.Options): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    
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
    def setElement(value: org.scalajs.dom.raw.Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typingsSlinky.naja.najaMod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
  }
}
