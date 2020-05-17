package typingsSlinky.rcPicker.anon

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled[DateType] extends js.Object {
  var disabled: js.Tuple2[Boolean, Boolean] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var locale: Locale = js.native
  var picker: PickerMode = js.native
  var selectedValue: RangeValue[DateType] = js.native
}

object Disabled {
  @scala.inline
  def apply[DateType](
    disabled: js.Tuple2[Boolean, Boolean],
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    picker: PickerMode
  ): Disabled[DateType] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[DateType]]
  }
  @scala.inline
  implicit class DisabledOps[Self[datetype] <: Disabled[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withDisabled(value: js.Tuple2[Boolean, Boolean]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateConfig(value: GenerateConfig[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicker(value: PickerMode): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledDate(value: /* date */ DateType => Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledDate: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedValue(value: RangeValue[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedValueNull: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(null)
        ret
    }
  }
  
}

