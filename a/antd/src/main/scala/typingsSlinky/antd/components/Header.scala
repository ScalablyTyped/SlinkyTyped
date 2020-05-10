package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.generateCalendarMod.CalendarMode
import typingsSlinky.antd.headerMod.CalendarHeaderProps
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  @JSImport("antd/lib/calendar/Header", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[DateType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def validRange(value: js.Tuple2[DateType, DateType]): this.type = set("validRange", value.asInstanceOf[js.Any])
  }
  
  def withProps[DateType](p: CalendarHeaderProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
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
  ): Builder[DateType] = {
    val __props = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onModeChange = js.Any.fromFunction1(onModeChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder[DateType](js.Array(this.component, __props.asInstanceOf[CalendarHeaderProps[DateType]]))
  }
}

