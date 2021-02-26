package typingsSlinky.rmcCalendar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.datePickerPropsMod.PropsType
import typingsSlinky.rmcCalendar.rmcCalendarStrings.normal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.one
import typingsSlinky.rmcCalendar.rmcCalendarStrings.range
import typingsSlinky.rmcCalendar.rmcCalendarStrings.xl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("rmc-calendar", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rmcCalendar.mod.DatePicker] {
    
    @scala.inline
    def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDate(value: js.Date): this.type = set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getDateExtra(value: /* date */ js.Date => ExtraData): this.type = set("getDateExtra", js.Any.fromFunction1(value))
    
    @scala.inline
    def infiniteOpt(value: Boolean): this.type = set("infiniteOpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initalMonths(value: Double): this.type = set("initalMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCellClick(value: /* date */ js.Date => Unit): this.type = set("onCellClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLayout(value: /* clientHight */ Double => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectHasDisableDate(value: /* date */ js.Array[js.Date] => Unit): this.type = set("onSelectHasDisableDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowSize(value: normal | xl): this.type = set("rowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDate(value: js.Date): this.type = set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: one | range): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
