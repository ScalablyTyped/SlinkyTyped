package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetNameType extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var target: NameType = js.native
  
  var value: Boolean = js.native
}
object TargetNameType {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, target: NameType, value: Boolean): TargetNameType = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetNameType]
  }
  
  @scala.inline
  implicit class TargetNameTypeMutableBuilder[Self <: TargetNameType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: NameType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
