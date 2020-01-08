package typingsSlinky.reactDashWidgets.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashWidgets.libCalendarMod.CalendarMessages
import typingsSlinky.reactDashWidgets.libCalendarMod.CalendarProps
import typingsSlinky.reactDashWidgets.libCalendarMod.CalendarView
import typingsSlinky.reactDashWidgets.libCalendarMod.^
import typingsSlinky.reactDashWidgets.reactDashWidgetsStrings.century
import typingsSlinky.reactDashWidgets.reactDashWidgetsStrings.decade
import typingsSlinky.reactDashWidgets.reactDashWidgetsStrings.month
import typingsSlinky.reactDashWidgets.reactDashWidgetsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-widgets/lib/Calendar", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, id, onChange, onKeyDown */
  def apply(
    centuryFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    culture: String = null,
    currentDate: js.Date = null,
    dateFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    dayComponent: ReactComponentClass[_] = null,
    dayFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    decadeFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    defaultValue: js.Date = null,
    defaultView: CalendarView = null,
    disabled: Boolean | js.Array[_] = null,
    finalView: month | year | decade | century = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    footerFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    headerFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    initialView: month | year | decade | century = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    max: js.Date = null,
    messages: CalendarMessages = null,
    min: js.Date = null,
    monthFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    onCurrentDateChange: /* date */ js.UndefOr[js.Date] => Unit = null,
    onNavigate: (/* date */ js.Date, /* direction */ String, /* view */ String) => Unit = null,
    onViewChange: () => Unit = null,
    readOnly: Boolean | js.Array[_] = null,
    value: js.Date = null,
    view: CalendarView = null,
    views: js.Array[CalendarView] = null,
    yearFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (centuryFormat != null) __obj.updateDynamic("centuryFormat")(centuryFormat.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayComponent != null) __obj.updateDynamic("dayComponent")(dayComponent.asInstanceOf[js.Any])
    if (dayFormat != null) __obj.updateDynamic("dayFormat")(dayFormat.asInstanceOf[js.Any])
    if (decadeFormat != null) __obj.updateDynamic("decadeFormat")(decadeFormat.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (finalView != null) __obj.updateDynamic("finalView")(finalView.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerFormat != null) __obj.updateDynamic("footerFormat")(footerFormat.asInstanceOf[js.Any])
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat.asInstanceOf[js.Any])
    if (initialView != null) __obj.updateDynamic("initialView")(initialView.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (onCurrentDateChange != null) __obj.updateDynamic("onCurrentDateChange")(js.Any.fromFunction1(onCurrentDateChange))
    if (onNavigate != null) __obj.updateDynamic("onNavigate")(js.Any.fromFunction3(onNavigate))
    if (onViewChange != null) __obj.updateDynamic("onViewChange")(js.Any.fromFunction0(onViewChange))
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (yearFormat != null) __obj.updateDynamic("yearFormat")(yearFormat.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDashWidgets.libCalendarMod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CalendarProps
}

