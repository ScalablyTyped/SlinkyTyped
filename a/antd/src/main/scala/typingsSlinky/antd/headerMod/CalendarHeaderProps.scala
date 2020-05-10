package typingsSlinky.antd.headerMod

import typingsSlinky.antd.generateCalendarMod.CalendarMode
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarHeaderProps[DateType] extends js.Object {
  var fullscreen: Boolean = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var locale: Locale = js.native
  var mode: CalendarMode = js.native
  var prefixCls: String = js.native
  var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
  var value: DateType = js.native
  def onChange(date: DateType): Unit = js.native
  def onModeChange(mode: CalendarMode): Unit = js.native
}

object CalendarHeaderProps {
  @scala.inline
  def apply[DateType](
    fullscreen: Boolean,
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    mode: CalendarMode,
    onChange: DateType => Unit,
    onModeChange: CalendarMode => Unit,
    prefixCls: String,
    value: DateType
  ): CalendarHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onModeChange = js.Any.fromFunction1(onModeChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarHeaderProps[DateType]]
  }
  @scala.inline
  implicit class CalendarHeaderPropsOps[Self[datetype] <: CalendarHeaderProps[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withFullscreen(value: Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
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
    def withMode(value: CalendarMode): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: DateType => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnModeChange(value: CalendarMode => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidRange(value: js.Tuple2[DateType, DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidRange: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validRange")(js.undefined)
        ret
    }
  }
  
}

