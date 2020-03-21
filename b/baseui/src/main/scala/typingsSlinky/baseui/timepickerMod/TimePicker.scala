package typingsSlinky.baseui.timepickerMod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/timepicker", "TimePicker")
@js.native
class TimePicker ()
  extends Component[TimePickerProps, TimePickerState, js.Any] {
  def buildSelectedOption(value: js.Date, format: String): js.Object = js.native
  def buildSteps(): js.Array[Double] = js.native
  def handleChange(steps: Double): Unit = js.native
}

