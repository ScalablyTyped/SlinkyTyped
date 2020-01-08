package typingsSlinky.baseui.datepickerMod

import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.TagMod
import typingsSlinky.baseui.Anon_Date
import typingsSlinky.baseui.Anon_DateEvent_21306017
import typingsSlinky.baseui.Anon_Date_912435367
import typingsSlinky.react.reactMod.Component
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "Calendar")
@js.native
class Calendar ()
  extends Component[CalendarProps, CalendarState, js.Any] {
  def blurCalendar(): Unit = js.native
  def changeMonth(hasDate: Anon_Date_912435367): Unit = js.native
  def changeYear(hasDate: Anon_Date_912435367): Unit = js.native
  def focusCalendar(): Unit = js.native
  def getDateInView(): js.Date = js.native
  def getSingleDate(value: js.Array[Date]): js.Date | Null = js.native
  def getSingleDate(value: Date): js.Date | Null = js.native
  def handleArrowKey(key: String): Unit = js.native
  def handleDateChange(data: Anon_Date): Unit = js.native
  def handleMonthChange(date: js.Date): Unit = js.native
  def handleTabbing(event: KeyboardEvent): Unit = js.native
  def handleTimeChange(time: js.Date, index: Double): Unit = js.native
  def handleYearChange(date: js.Date): Unit = js.native
  def onDayMouseLeave(data: Anon_DateEvent_21306017): Unit = js.native
  def onDayMouseOver(data: Anon_DateEvent_21306017): Unit = js.native
  def onKeyDown(event: KeyboardEvent): Unit = js.native
  def renderCalendarHeader(date: js.Date, order: Double): TagMod[Any] = js.native
  def renderMonths(): js.Array[TagMod[Any]] = js.native
  def renderQuickSelect(): TagMod[Any] = js.native
  def renderTimeSelect(value: js.Date, onChange: js.Function1[/* args */ js.Any, _]): TagMod[Any] = js.native
  def setHighlightedDate(date: js.Date): Unit = js.native
}

