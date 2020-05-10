package typingsSlinky.rcPicker.pickerPanelMod

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.DisabledTime
import typingsSlinky.rcPicker.interfaceMod.DisabledTimes
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.rcPickerStrings.date
import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerPanelDateProps[DateType]
  extends PickerPanelSharedProps[DateType]
     with PickerPanelProps[DateType] {
  var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.native
  var picker: js.UndefOr[date] = js.native
  var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.native
  var showToday: js.UndefOr[Boolean] = js.native
}

object PickerPanelDateProps {
  @scala.inline
  def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerPanelDateProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelDateProps[DateType]]
  }
  @scala.inline
  implicit class PickerPanelDatePropsOps[Self[datetype] <: PickerPanelDateProps[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledTime: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPicker(value: date): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicker: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTime(value: Boolean | SharedTimeProps[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTime: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToday(value: Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToday: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToday")(js.undefined)
        ret
    }
  }
  
}

