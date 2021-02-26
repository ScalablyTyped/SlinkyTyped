package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMLLayerLayerviewCreateErrorEvent extends StObject {
  
  var error: Error = js.native
  
  var view: View = js.native
}
object KMLLayerLayerviewCreateErrorEvent {
  
  @scala.inline
  def apply(error: Error, view: View): KMLLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMLLayerLayerviewCreateErrorEvent]
  }
  
  @scala.inline
  implicit class KMLLayerLayerviewCreateErrorEventMutableBuilder[Self <: KMLLayerLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
