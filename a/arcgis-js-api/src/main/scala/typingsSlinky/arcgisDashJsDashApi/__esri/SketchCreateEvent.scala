package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.active
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.cancel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.complete
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.create
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.point
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polygon
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polyline
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rectangle
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchCreateEvent extends js.Object {
  var graphic: Graphic
  var state: start | active | complete | cancel
  var tool: point | polyline | polygon | rectangle | circle
  var toolEventInfo: CreateToolEventInfo
  var `type`: create
}

object SketchCreateEvent {
  @scala.inline
  def apply(
    graphic: Graphic,
    state: start | active | complete | cancel,
    tool: point | polyline | polygon | rectangle | circle,
    toolEventInfo: CreateToolEventInfo,
    `type`: create
  ): SketchCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchCreateEvent]
  }
}

