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
import scala.scalajs.js.annotation._

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
    def withGraphics(value: js.Array[Graphic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTool(value: point | polyline | polygon | rectangle | circle | move | transform | reshape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: undo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

