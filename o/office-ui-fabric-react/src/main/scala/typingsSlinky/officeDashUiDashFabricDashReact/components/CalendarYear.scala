package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarIconStrings
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarYearMod.ICalendarYearHeaderProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarYearMod.ICalendarYearProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarYearMod.ICalendarYearStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarYear
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarYearMod.CalendarYear
    ] {
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarYear", "CalendarYear")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    maxYear: Int | Double = null,
    minYear: Int | Double = null,
    navigatedYear: Int | Double = null,
    navigationIcons: ICalendarIconStrings = null,
    onHeaderSelect: /* focus */ Boolean => Unit = null,
    onRenderTitle: /* props */ ICalendarYearHeaderProps => TagMod[Any] = null,
    onRenderYear: /* year */ Double => TagMod[Any] = null,
    onSelectYear: /* year */ Double => Unit = null,
    selectedYear: Int | Double = null,
    strings: ICalendarYearStrings = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarYearMod.CalendarYear
  ] = {
    val __obj = js.Dynamic.literal()
    if (maxYear != null) __obj.updateDynamic("maxYear")(maxYear.asInstanceOf[js.Any])
    if (minYear != null) __obj.updateDynamic("minYear")(minYear.asInstanceOf[js.Any])
    if (navigatedYear != null) __obj.updateDynamic("navigatedYear")(navigatedYear.asInstanceOf[js.Any])
    if (navigationIcons != null) __obj.updateDynamic("navigationIcons")(navigationIcons.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1(onHeaderSelect))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction1(onRenderTitle))
    if (onRenderYear != null) __obj.updateDynamic("onRenderYear")(js.Any.fromFunction1(onRenderYear))
    if (onSelectYear != null) __obj.updateDynamic("onSelectYear")(js.Any.fromFunction1(onSelectYear))
    if (selectedYear != null) __obj.updateDynamic("selectedYear")(selectedYear.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarYearMod.CalendarYear
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarYearMod.CalendarYear](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ICalendarYearProps
}

