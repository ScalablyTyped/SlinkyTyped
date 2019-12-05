package typingsSlinky.rmcDashCalendar

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.rmcDashCalendar.libDateDataTypesMod.Models.MonthData
import typingsSlinky.rmcDashCalendar.libDatePickerMod.DatePicker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/DatePicker", JSImport.Namespace)
@js.native
object libDatePickerMod extends js.Object {
  @js.native
  trait DatePicker
    extends typingsSlinky.rmcDashCalendar.libDatePickerDotBaseMod.default {
    var panel: HTMLDivElement = js.native
    var touchHandler: Anon_Evt = js.native
    var transform: String = js.native
    def computeHeight(data: MonthData): Unit = js.native
    def computeHeight(data: MonthData, singleMonth: typingsSlinky.rmcDashCalendar.libDateSingleMonthMod.default): Unit = js.native
    def genMonthComponent(): js.UndefOr[Element] = js.native
    def setLayout(dom: HTMLDivElement): Unit = js.native
    def setPanel(dom: HTMLDivElement): Unit = js.native
    def setTransform(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
    def setTransition(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends DatePicker
  
}

