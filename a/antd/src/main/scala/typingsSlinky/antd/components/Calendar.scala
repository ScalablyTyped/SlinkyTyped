package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.AnonLang
import typingsSlinky.antd.AnonOnChange
import typingsSlinky.antd.generateCalendarMod.CalendarMode
import typingsSlinky.antd.generateCalendarMod.CalendarProps
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("antd", "Calendar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    dateCellRender: Moment => TagMod[Any] = null,
    dateFullCellRender: Moment => TagMod[Any] = null,
    defaultValue: Moment = null,
    disabledDate: Moment => Boolean = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* config */ AnonOnChange[Moment] => TagMod[Any] = null,
    locale: AnonLang = null,
    mode: CalendarMode = null,
    monthCellRender: Moment => TagMod[Any] = null,
    monthFullCellRender: Moment => TagMod[Any] = null,
    onChange: Moment => Unit = null,
    onPanelChange: (Moment, /* mode */ CalendarMode) => Unit = null,
    onSelect: Moment => Unit = null,
    prefixCls: String = null,
    validRange: js.Tuple2[Moment, Moment] = null,
    value: Moment = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (dateCellRender != null) __obj.updateDynamic("dateCellRender")(js.Any.fromFunction1(dateCellRender))
    if (dateFullCellRender != null) __obj.updateDynamic("dateFullCellRender")(js.Any.fromFunction1(dateFullCellRender))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1(headerRender))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction1(monthCellRender))
    if (monthFullCellRender != null) __obj.updateDynamic("monthFullCellRender")(js.Any.fromFunction1(monthFullCellRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CalendarProps[Moment]
}

