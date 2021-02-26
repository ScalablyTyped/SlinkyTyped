package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.move
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.transform
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.undo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchViewModelUndoEvent extends StObject {
  
  var graphics: js.Array[Graphic] = js.native
  
  var tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape = js.native
  
  var `type`: undo = js.native
}
object SketchViewModelUndoEvent {
  
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape,
    `type`: undo
  ): SketchViewModelUndoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelUndoEvent]
  }
  
  @scala.inline
  implicit class SketchViewModelUndoEventMutableBuilder[Self <: SketchViewModelUndoEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value :_*))
    
    @scala.inline
    def setTool(value: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: undo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
