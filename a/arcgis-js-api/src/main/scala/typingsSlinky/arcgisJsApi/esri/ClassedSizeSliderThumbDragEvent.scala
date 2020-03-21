package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.drag
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedSizeSliderThumbDragEvent extends js.Object {
  var index: Double
  var state: start | drag
  var `type`: `thumb-drag`
  var value: Double
}

object ClassedSizeSliderThumbDragEvent {
  @scala.inline
  def apply(index: Double, state: start | drag, `type`: `thumb-drag`, value: Double): ClassedSizeSliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedSizeSliderThumbDragEvent]
  }
}

