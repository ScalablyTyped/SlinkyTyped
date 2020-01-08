package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.move
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.point
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polygon
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polyline
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rectangle
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.redo
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.reshape
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchRedoEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var tool: point | polyline | polygon | rectangle | circle | move | transform | reshape
  var `type`: redo
}

object SketchRedoEvent {
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    tool: point | polyline | polygon | rectangle | circle | move | transform | reshape,
    `type`: redo
  ): SketchRedoEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchRedoEvent]
  }
}

