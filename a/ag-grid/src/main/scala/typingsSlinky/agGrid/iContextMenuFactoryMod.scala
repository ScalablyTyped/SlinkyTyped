package typingsSlinky.agGrid

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/interfaces/iContextMenuFactory", JSImport.Namespace)
@js.native
object iContextMenuFactoryMod extends js.Object {
  
  @js.native
  trait IContextMenuFactory extends js.Object {
    
    def hideActiveMenu(): Unit = js.native
    
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: MouseEvent): Unit = js.native
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: Touch): Unit = js.native
  }
}
