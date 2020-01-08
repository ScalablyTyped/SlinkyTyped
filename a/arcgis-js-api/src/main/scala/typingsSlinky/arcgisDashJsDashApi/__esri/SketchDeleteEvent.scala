package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.delete
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.move
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.reshape
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDeleteEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var tool: move | reshape | transform
  var `type`: delete
}

object SketchDeleteEvent {
  @scala.inline
  def apply(graphics: js.Array[Graphic], tool: move | reshape | transform, `type`: delete): SketchDeleteEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchDeleteEvent]
  }
}

