package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.move
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.redo
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelRedoEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape
  var `type`: redo
}

object SketchViewModelRedoEvent {
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    tool: point | multipoint | polyline | polygon | rectangle | circle | move | transform | reshape,
    `type`: redo
  ): SketchViewModelRedoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelRedoEvent]
  }
}

