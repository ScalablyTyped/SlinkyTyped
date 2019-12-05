package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-drag`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.drag
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.start
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderThumbDragEvent extends js.Object {
  var index: Double
  var state: drag | start | stop
  var `type`: `thumb-drag`
  var value: Double
}

object SliderThumbDragEvent {
  @scala.inline
  def apply(index: Double, state: drag | start | stop, `type`: `thumb-drag`, value: Double): SliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderThumbDragEvent]
  }
}

