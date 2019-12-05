package typingsSlinky.atBlueprintjsDatetime.libEsmDateTimePickerMod

import typingsSlinky.atBlueprintjsCore.atBlueprintjsCoreMod.AbstractPureComponent2
import typingsSlinky.atBlueprintjsDatetime.libEsmDatePickerMod.IDatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
@js.native
class DateTimePicker ()
  extends AbstractPureComponent2[IDateTimePickerProps, IDateTimePickerState, js.Object] {
  def this(props: IDateTimePickerProps) = this()
  def this(props: IDateTimePickerProps, context: js.Any) = this()
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDateTimePicker(prevProps: IDatePickerProps): Unit = js.native
  def handleDateChange(dateValue: js.Date, isUserChange: Boolean): Unit = js.native
  def handleTimeChange(timeValue: js.Date): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
@js.native
object DateTimePicker extends js.Object {
  var defaultProps: IDateTimePickerProps = js.native
  var displayName: String = js.native
}

