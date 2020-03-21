package typingsSlinky.rmcCalendar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rmcCalendar.dataTypesMod.Models.CellData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.dataTypesMod.Models.MonthData
import typingsSlinky.rmcCalendar.rmcCalendarStrings.normal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.xl
import typingsSlinky.rmcCalendar.singleMonthMod.PropsType
import typingsSlinky.rmcCalendar.singleMonthMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SingleMonth
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rmc-calendar/lib/date/SingleMonth", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    locale: Locale,
    monthData: MonthData,
    getDateExtra: /* date */ js.Date => ExtraData = null,
    onCellClick: (/* data */ CellData, /* monthData */ MonthData) => Unit = null,
    rowSize: normal | xl = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], monthData = monthData.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1(getDateExtra))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropsType
}

