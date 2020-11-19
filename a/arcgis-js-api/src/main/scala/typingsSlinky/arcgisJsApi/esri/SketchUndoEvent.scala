package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.move
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.transform
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.undo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchUndoEvent extends js.Object {
  
  var graphics: js.Array[Graphic] = js.native
  
  var tool: point | polyline | polygon | rectangle | circle | move | transform | reshape = js.native
  
  var `type`: undo = js.native
}
object SketchUndoEvent {
  
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    tool: point | polyline | polygon | rectangle | circle | move | transform | reshape,
    `type`: undo
  ): SketchUndoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchUndoEvent]
  }
  
  @scala.inline
  implicit class SketchUndoEventOps[Self <: SketchUndoEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGraphicsVarargs(value: Graphic*): Self = this.set("graphics", js.Array(value :_*))
    
    @scala.inline
    def setGraphics(value: js.Array[Graphic]): Self = this.set("graphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTool(value: point | polyline | polygon | rectangle | circle | move | transform | reshape): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: undo): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
