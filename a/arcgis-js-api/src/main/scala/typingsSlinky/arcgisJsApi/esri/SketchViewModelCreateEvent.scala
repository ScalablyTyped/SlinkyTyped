package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.active
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cancel
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.complete
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.create
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchViewModelCreateEvent extends StObject {
  
  var graphic: Graphic = js.native
  
  var state: start | active | complete | cancel = js.native
  
  var tool: point | multipoint | polyline | polygon | rectangle | circle = js.native
  
  var toolEventInfo: CreateToolEventInfo = js.native
  
  var `type`: create = js.native
}
object SketchViewModelCreateEvent {
  
  @scala.inline
  def apply(
    graphic: Graphic,
    state: start | active | complete | cancel,
    tool: point | multipoint | polyline | polygon | rectangle | circle,
    toolEventInfo: CreateToolEventInfo,
    `type`: create
  ): SketchViewModelCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelCreateEvent]
  }
  
  @scala.inline
  implicit class SketchViewModelCreateEventMutableBuilder[Self <: SketchViewModelCreateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphic(value: Graphic): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: start | active | complete | cancel): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTool(value: point | multipoint | polyline | polygon | rectangle | circle): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolEventInfo(value: CreateToolEventInfo): Self = StObject.set(x, "toolEventInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: create): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
