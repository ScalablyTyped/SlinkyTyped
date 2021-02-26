package typingsSlinky.agGrid

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iContextMenuFactoryMod {
  
  @js.native
  trait IContextMenuFactory extends StObject {
    
    def hideActiveMenu(): Unit = js.native
    
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: MouseEvent): Unit = js.native
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: Touch): Unit = js.native
  }
}
