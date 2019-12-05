package typingsSlinky.atBlueprintjsDatetime.libEsmDateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimePickerState extends js.Object {
  var dateValue: js.UndefOr[js.Date] = js.undefined
  var timeValue: js.UndefOr[js.Date] = js.undefined
}

object IDateTimePickerState {
  @scala.inline
  def apply(dateValue: js.Date = null, timeValue: js.Date = null): IDateTimePickerState = {
    val __obj = js.Dynamic.literal()
    if (dateValue != null) __obj.updateDynamic("dateValue")(dateValue.asInstanceOf[js.Any])
    if (timeValue != null) __obj.updateDynamic("timeValue")(timeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateTimePickerState]
  }
}

