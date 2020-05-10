package typingsSlinky.officeUiFabricReact.datePickerWeekNumbersExampleMod

import typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerBasicExampleState extends js.Object {
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.native
}

object IDatePickerBasicExampleState {
  @scala.inline
  def apply(): IDatePickerBasicExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerBasicExampleState]
  }
  @scala.inline
  implicit class IDatePickerBasicExampleStateOps[Self <: IDatePickerBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstDayOfWeek(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
  }
  
}

