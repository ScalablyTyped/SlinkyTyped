package typingsSlinky.rmcCalendar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcCalendar.dataTypesMod.Models.CellData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.dataTypesMod.Models.MonthData
import typingsSlinky.rmcCalendar.rmcCalendarStrings.normal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.xl
import typingsSlinky.rmcCalendar.singleMonthMod.PropsType
import typingsSlinky.rmcCalendar.singleMonthMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SingleMonth {
  
  @scala.inline
  def apply(locale: Locale, monthData: MonthData): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], monthData = monthData.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
  
  @JSImport("rmc-calendar/lib/date/SingleMonth", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def getDateExtra(value: /* date */ js.Date => ExtraData): this.type = set("getDateExtra", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCellClick(value: (/* data */ CellData, /* monthData */ MonthData) => Unit): this.type = set("onCellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def rowSize(value: normal | xl): this.type = set("rowSize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
