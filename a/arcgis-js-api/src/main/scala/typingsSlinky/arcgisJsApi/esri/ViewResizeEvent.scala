package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewResizeEvent extends StObject {
  
  var height: Double = js.native
  
  var oldHeight: Double = js.native
  
  var oldWidth: Double = js.native
  
  var width: Double = js.native
}
object ViewResizeEvent {
  
  @scala.inline
  def apply(height: Double, oldHeight: Double, oldWidth: Double, width: Double): ViewResizeEvent = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], oldHeight = oldHeight.asInstanceOf[js.Any], oldWidth = oldWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewResizeEvent]
  }
  
  @scala.inline
  implicit class ViewResizeEventMutableBuilder[Self <: ViewResizeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldHeight(value: Double): Self = StObject.set(x, "oldHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
