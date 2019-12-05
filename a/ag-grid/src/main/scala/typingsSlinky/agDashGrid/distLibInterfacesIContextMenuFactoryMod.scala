package typingsSlinky.agDashGrid

import typingsSlinky.agDashGrid.distLibEntitiesColumnMod.Column
import typingsSlinky.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typingsSlinky.std.MouseEvent
import typingsSlinky.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/interfaces/iContextMenuFactory", JSImport.Namespace)
@js.native
object distLibInterfacesIContextMenuFactoryMod extends js.Object {
  @js.native
  trait IContextMenuFactory extends js.Object {
    def hideActiveMenu(): Unit = js.native
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: MouseEvent): Unit = js.native
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: Touch): Unit = js.native
  }
  
}

