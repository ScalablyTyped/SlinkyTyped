package typingsSlinky.primereact.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHTMLElement extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var target: HTMLElement = js.native
}
object TargetHTMLElement {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, target: HTMLElement): TargetHTMLElement = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetHTMLElement]
  }
  
  @scala.inline
  implicit class TargetHTMLElementMutableBuilder[Self <: TargetHTMLElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
