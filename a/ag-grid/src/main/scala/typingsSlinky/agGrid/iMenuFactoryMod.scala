package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import typingsSlinky.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/interfaces/iMenuFactory", JSImport.Namespace)
@js.native
object iMenuFactoryMod extends js.Object {
  
  @js.native
  trait IMenuFactory extends js.Object {
    
    def hideActiveMenu(): Unit = js.native
    
    def isMenuEnabled(column: Column): Boolean = js.native
    
    def showMenuAfterButtonClick(column: Column, eventSource: HTMLElement): Unit = js.native
    def showMenuAfterButtonClick(
      column: Column,
      eventSource: HTMLElement,
      defaultTab: js.UndefOr[scala.Nothing],
      restrictToTabs: js.Array[String]
    ): Unit = js.native
    def showMenuAfterButtonClick(column: Column, eventSource: HTMLElement, defaultTab: String): Unit = js.native
    def showMenuAfterButtonClick(column: Column, eventSource: HTMLElement, defaultTab: String, restrictToTabs: js.Array[String]): Unit = js.native
    
    def showMenuAfterMouseEvent(column: Column, mouseEvent: MouseEvent): Unit = js.native
    def showMenuAfterMouseEvent(
      column: Column,
      mouseEvent: MouseEvent,
      defaultTab: js.UndefOr[scala.Nothing],
      restrictToTabs: js.Array[String]
    ): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: MouseEvent, defaultTab: String): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: MouseEvent, defaultTab: String, restrictToTabs: js.Array[String]): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: Touch): Unit = js.native
    def showMenuAfterMouseEvent(
      column: Column,
      mouseEvent: Touch,
      defaultTab: js.UndefOr[scala.Nothing],
      restrictToTabs: js.Array[String]
    ): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: Touch, defaultTab: String): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: Touch, defaultTab: String, restrictToTabs: js.Array[String]): Unit = js.native
  }
}
