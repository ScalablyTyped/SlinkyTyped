package typingsSlinky.rmcDashCalendar.libDatePickerDotBaseMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Component
import typingsSlinky.rmcDashCalendar.Anon_Client
import typingsSlinky.rmcDashCalendar.Anon_FirstDate
import typingsSlinky.rmcDashCalendar.libDateDataTypesMod.Models.CellData
import typingsSlinky.rmcDashCalendar.libDateDataTypesMod.Models.MonthData
import typingsSlinky.rmcDashCalendar.libDatePickerPropsMod.PropsType
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker
  extends Component[PropsType, StateType, js.Any] {
  var visibleMonth: js.Array[MonthData] = js.native
  def canLoadNext(): Boolean = js.native
  def canLoadPrev(): Boolean = js.native
  @JSName("componentWillMount")
  def componentWillMount_MDatePicker(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDatePicker(nextProps: PropsType): Unit = js.native
  def computeVisible(clientHeight: Double, scrollTop: Double): Boolean = js.native
  def createOnScroll(): js.Function1[/* data */ Anon_Client, Unit] = js.native
  def genMonthComponent(data: MonthData): TagMod[Any] = js.native
  def genMonthData(): MonthData = js.native
  def genMonthData(date: js.Date): MonthData = js.native
  def genMonthData(date: js.Date, addMonth: Double): MonthData = js.native
  def genWeekData(firstDate: js.Date): js.Array[js.Array[CellData]] = js.native
  def getDateWithoutTime(): Double = js.native
  def getDateWithoutTime(date: js.Date): Double = js.native
  def getMonthDate(): Anon_FirstDate = js.native
  def getMonthDate(date: js.Date): Anon_FirstDate = js.native
  def getMonthDate(date: js.Date, addMonth: Double): Anon_FirstDate = js.native
  def inDate(date: Double, tick: Double): Boolean = js.native
  def onCellClick(day: CellData): Unit = js.native
  def selectDateRange(startDate: js.Date): Unit = js.native
  def selectDateRange(startDate: js.Date, endDate: js.UndefOr[scala.Nothing], clear: Boolean): Unit = js.native
  def selectDateRange(startDate: js.Date, endDate: Date): Unit = js.native
  def selectDateRange(startDate: js.Date, endDate: Date, clear: Boolean): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MDatePicker(nextProps: PropsType, nextState: StateType, nextContext: js.Any): Boolean = js.native
}

