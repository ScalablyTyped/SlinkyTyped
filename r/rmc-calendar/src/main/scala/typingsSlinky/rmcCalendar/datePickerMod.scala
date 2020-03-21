package typingsSlinky.rmcCalendar

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.rmcCalendar.dataTypesMod.Models.MonthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/DatePicker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  @js.native
  trait DatePicker
    extends typingsSlinky.rmcCalendar.datePickerBaseMod.default {
    var panel: HTMLDivElement = js.native
    var touchHandler: AnonOnFinish = js.native
    var transform: String = js.native
    def computeHeight(data: MonthData): Unit = js.native
    def computeHeight(data: MonthData, singleMonth: typingsSlinky.rmcCalendar.singleMonthMod.default): Unit = js.native
    def genMonthComponent(): js.UndefOr[ReactElement] = js.native
    def setLayout(dom: HTMLDivElement): Unit = js.native
    def setPanel(dom: HTMLDivElement): Unit = js.native
    def setTransform(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
    def setTransition(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends DatePicker
  
}

