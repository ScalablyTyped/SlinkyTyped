package typingsSlinky.antd

import typingsSlinky.antd.generateCalendarMod.CalendarMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnChange[DateType] extends js.Object {
  var `type`: CalendarMode = js.native
  var value: DateType = js.native
  def onChange(date: DateType): Unit = js.native
  def onTypeChange(`type`: CalendarMode): Unit = js.native
}

object AnonOnChange {
  @scala.inline
  def apply[DateType](
    onChange: DateType => Unit,
    onTypeChange: CalendarMode => Unit,
    `type`: CalendarMode,
    value: DateType
  ): AnonOnChange[DateType] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), onTypeChange = js.Any.fromFunction1(onTypeChange), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnChange[DateType]]
  }
  @scala.inline
  implicit class AnonOnChangeOps[Self[datetype] <: AnonOnChange[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withOnChange(value: DateType => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTypeChange(value: CalendarMode => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: CalendarMode): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

