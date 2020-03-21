package typingsSlinky.officeUiFabricReact.datePickerInputExampleMod

import typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerInputExampleState extends js.Object {
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  var value: js.UndefOr[js.Date | Null] = js.undefined
}

object IDatePickerInputExampleState {
  @scala.inline
  def apply(firstDayOfWeek: DayOfWeek = null, value: js.Date = null): IDatePickerInputExampleState = {
    val __obj = js.Dynamic.literal()
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerInputExampleState]
  }
}

