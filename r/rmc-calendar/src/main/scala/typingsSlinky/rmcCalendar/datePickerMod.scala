package typingsSlinky.rmcCalendar

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.rmcCalendar.anon.OnFinish
import typingsSlinky.rmcCalendar.dataTypesMod.Models.MonthData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("rmc-calendar/lib/DatePicker", JSImport.Default)
  @js.native
  class default () extends DatePicker
  
  @js.native
  trait DatePicker
    extends typingsSlinky.rmcCalendar.datePickerBaseMod.default {
    
    def computeHeight(data: MonthData): Unit = js.native
    def computeHeight(data: MonthData, singleMonth: typingsSlinky.rmcCalendar.singleMonthMod.default): Unit = js.native
    
    def genMonthComponent(): js.UndefOr[ReactElement] = js.native
    
    var panel: HTMLDivElement = js.native
    
    def setLayout(dom: HTMLDivElement): Unit = js.native
    
    def setPanel(dom: HTMLDivElement): Unit = js.native
    
    def setTransform(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
    
    def setTransition(nodeStyle: CSSStyleDeclaration, value: js.Any): Unit = js.native
    
    var touchHandler: OnFinish = js.native
    
    var transform: String = js.native
  }
}
