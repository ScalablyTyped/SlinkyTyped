package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.click
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewClickEvent extends StObject {
  
  var button: Double = js.native
  
  var buttons: js.Any = js.native
  
  var mapPoint: Point = js.native
  
  var native: js.Any = js.native
  
  var screenPoint: js.Any = js.native
  
  var stopPropagation: js.Function = js.native
  
  var timestamp: Double = js.native
  
  var `type`: click = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ViewClickEvent {
  
  @scala.inline
  def apply(
    button: Double,
    buttons: js.Any,
    mapPoint: Point,
    native: js.Any,
    screenPoint: js.Any,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: click,
    x: Double,
    y: Double
  ): ViewClickEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], screenPoint = screenPoint.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewClickEvent]
  }
  
  @scala.inline
  implicit class ViewClickEventMutableBuilder[Self <: ViewClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPoint(value: js.Any): Self = StObject.set(x, "screenPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: click): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
