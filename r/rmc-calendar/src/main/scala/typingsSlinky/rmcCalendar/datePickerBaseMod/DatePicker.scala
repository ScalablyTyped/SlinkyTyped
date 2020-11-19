package typingsSlinky.rmcCalendar.datePickerBaseMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.rmcCalendar.anon.Client
import typingsSlinky.rmcCalendar.anon.FirstDate
import typingsSlinky.rmcCalendar.dataTypesMod.Models.CellData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.MonthData
import typingsSlinky.rmcCalendar.datePickerPropsMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePicker
  extends Component[PropsType, StateType, js.Any] {
  
  def canLoadNext(): Boolean = js.native
  
  def canLoadPrev(): Boolean = js.native
  
  @JSName("componentWillMount")
  def componentWillMount_MDatePicker(): Unit = js.native
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDatePicker(nextProps: PropsType): Unit = js.native
  
  def computeVisible(clientHeight: Double, scrollTop: Double): Boolean = js.native
  
  def createOnScroll(): js.Function1[/* data */ Client, Unit] = js.native
  
  def genMonthComponent(data: MonthData): ReactElement = js.native
  
  def genMonthData(): MonthData = js.native
  def genMonthData(date: js.UndefOr[scala.Nothing], addMonth: Double): MonthData = js.native
  def genMonthData(date: js.Date): MonthData = js.native
  def genMonthData(date: js.Date, addMonth: Double): MonthData = js.native
  
  def genWeekData(firstDate: js.Date): js.Array[js.Array[CellData]] = js.native
  
  def getDateWithoutTime(): Double = js.native
  def getDateWithoutTime(date: js.Date): Double = js.native
  
  def getMonthDate(): FirstDate = js.native
  def getMonthDate(date: js.UndefOr[scala.Nothing], addMonth: Double): FirstDate = js.native
  def getMonthDate(date: js.Date): FirstDate = js.native
  def getMonthDate(date: js.Date, addMonth: Double): FirstDate = js.native
  
  def inDate(date: Double, tick: Double): Boolean = js.native
  
  def onCellClick(day: CellData): Unit = js.native
  
  def selectDateRange(startDate: js.Date): Unit = js.native
  def selectDateRange(startDate: js.Date, endDate: js.UndefOr[scala.Nothing], clear: Boolean): Unit = js.native
  def selectDateRange(startDate: js.Date, endDate: js.Date): Unit = js.native
  def selectDateRange(startDate: js.Date, endDate: js.Date, clear: Boolean): Unit = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MDatePicker(nextProps: PropsType, nextState: StateType, nextContext: js.Any): Boolean = js.native
  
  var visibleMonth: js.Array[MonthData] = js.native
}
