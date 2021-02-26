package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewFocusEvent extends StObject {
  
  var native: js.Any = js.native
  
  var target: View = js.native
}
object SceneViewFocusEvent {
  
  @scala.inline
  def apply(native: js.Any, target: View): SceneViewFocusEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewFocusEvent]
  }
  
  @scala.inline
  implicit class SceneViewFocusEventMutableBuilder[Self <: SceneViewFocusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: View): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
