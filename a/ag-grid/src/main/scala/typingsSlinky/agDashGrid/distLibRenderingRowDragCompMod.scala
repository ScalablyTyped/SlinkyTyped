package typingsSlinky.agDashGrid

import typingsSlinky.agDashGrid.distLibEntitiesColumnMod.Column
import typingsSlinky.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typingsSlinky.agDashGrid.distLibRenderingBeansMod.Beans
import typingsSlinky.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/rowDragComp", JSImport.Namespace)
@js.native
object distLibRenderingRowDragCompMod extends js.Object {
  @js.native
  class RowDragComp protected () extends Component {
    def this(rowNode: RowNode, column: Column, cellValue: String, beans: Beans) = this()
    val beans: js.Any = js.native
    val cellValue: js.Any = js.native
    val column: js.Any = js.native
    val rowNode: js.Any = js.native
    /* private */ def addDragSource(): js.Any = js.native
    /* private */ def checkCompatibility(): js.Any = js.native
    /* private */ def postConstruct(): js.Any = js.native
  }
  
}

