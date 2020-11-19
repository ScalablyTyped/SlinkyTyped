package typingsSlinky.rmcCalendar.singleMonthMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.Component
import typingsSlinky.rmcCalendar.anon.WeekComponents
import typingsSlinky.rmcCalendar.dataTypesMod.Models.CellData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.MonthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleMonth
  extends Component[PropsType, WeekComponents, js.Any] {
  
  @JSName("componentWillMount")
  def componentWillMount_MSingleMonth(): Unit = js.native
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSingleMonth(nextProps: PropsType): Unit = js.native
  
  def genWeek(weeksData: js.Array[CellData], index: Double): Unit = js.native
  
  def setWarpper(dom: HTMLDivElement): Unit = js.native
  
  def updateWeeks(): Unit = js.native
  def updateWeeks(monthData: MonthData): Unit = js.native
  
  var wrapperDivDOM: HTMLDivElement | Null = js.native
}
