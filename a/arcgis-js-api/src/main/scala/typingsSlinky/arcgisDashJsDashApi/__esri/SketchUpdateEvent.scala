package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.active
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.cancel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.complete
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.move
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.reshape
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.start
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.transform
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchUpdateEvent extends js.Object {
  var graphics: js.Array[Graphic]
  var state: start | active | complete | cancel
  var tool: move | transform | reshape
  var toolEventInfo: UpdateToolEventInfo
  var `type`: update
}

object SketchUpdateEvent {
  @scala.inline
  def apply(
    graphics: js.Array[Graphic],
    state: start | active | complete | cancel,
    tool: move | transform | reshape,
    toolEventInfo: UpdateToolEventInfo,
    `type`: update
  ): SketchUpdateEvent = {
    val __obj = js.Dynamic.literal(graphics = graphics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchUpdateEvent]
  }
}

