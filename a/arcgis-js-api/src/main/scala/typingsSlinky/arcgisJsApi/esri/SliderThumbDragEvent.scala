package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.drag
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.start
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderThumbDragEvent extends StObject {
  
  var index: Double = js.native
  
  var state: drag | start | stop = js.native
  
  var `type`: `thumb-drag` = js.native
  
  var value: Double = js.native
}
object SliderThumbDragEvent {
  
  @scala.inline
  def apply(index: Double, state: drag | start | stop, `type`: `thumb-drag`, value: Double): SliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderThumbDragEvent]
  }
  
  @scala.inline
  implicit class SliderThumbDragEventMutableBuilder[Self <: SliderThumbDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: drag | start | stop): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `thumb-drag`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
