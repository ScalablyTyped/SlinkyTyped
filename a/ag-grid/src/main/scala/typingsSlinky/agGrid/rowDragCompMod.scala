package typingsSlinky.agGrid

import typingsSlinky.agGrid.beansMod.Beans
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowDragCompMod {
  
  @JSImport("ag-grid/dist/lib/rendering/rowDragComp", "RowDragComp")
  @js.native
  class RowDragComp protected () extends Component {
    def this(rowNode: RowNode, column: Column, cellValue: String, beans: Beans) = this()
    
    /* private */ def addDragSource(): js.Any = js.native
    
    val beans: js.Any = js.native
    
    val cellValue: js.Any = js.native
    
    /* private */ def checkCompatibility(): js.Any = js.native
    
    val column: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    val rowNode: js.Any = js.native
  }
}
