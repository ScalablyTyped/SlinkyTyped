package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var target: Id = js.native
  
  var value: js.Any = js.native
}
object Target {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, target: Id, value: js.Any): Target = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Id): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
