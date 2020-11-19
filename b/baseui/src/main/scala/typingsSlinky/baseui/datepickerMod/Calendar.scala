package typingsSlinky.baseui.datepickerMod

import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Date
import typingsSlinky.baseui.anon.DateDate
import typingsSlinky.baseui.anon.EventEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/datepicker", "Calendar")
@js.native
class Calendar ()
  extends Component[CalendarProps, CalendarState, js.Any] {
  
  def blurCalendar(): Unit = js.native
  
  def changeMonth(hasDate: DateDate): Unit = js.native
  
  def changeYear(hasDate: DateDate): Unit = js.native
  
  def focusCalendar(): Unit = js.native
  
  def getDateInView(): js.Date = js.native
  
  def getSingleDate(value: js.Array[js.Date]): js.Date | Null = js.native
  def getSingleDate(value: js.Date): js.Date | Null = js.native
  
  def handleArrowKey(key: String): Unit = js.native
  
  def handleDateChange(data: Date): Unit = js.native
  
  def handleMonthChange(date: js.Date): Unit = js.native
  
  def handleTabbing(event: KeyboardEvent): Unit = js.native
  
  def handleTimeChange(time: js.Date, index: Double): Unit = js.native
  
  def handleYearChange(date: js.Date): Unit = js.native
  
  def onDayMouseLeave(data: EventEvent): Unit = js.native
  
  def onDayMouseOver(data: EventEvent): Unit = js.native
  
  def onKeyDown(event: KeyboardEvent): Unit = js.native
  
  def renderCalendarHeader(date: js.Date, order: Double): ReactElement = js.native
  
  def renderMonths(): js.Array[ReactElement] = js.native
  
  def renderQuickSelect(): ReactElement = js.native
  
  def renderTimeSelect(value: js.Date, onChange: js.Function1[/* args */ js.Any, _]): ReactElement = js.native
  
  def setHighlightedDate(date: js.Date): Unit = js.native
}
