package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.Disabled
import typingsSlinky.officeUiFabricReact.gridCellTypesMod.IGridCellProps
import typingsSlinky.officeUiFabricReact.gridTypesMod.IGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/grid", JSImport.Namespace)
@js.native
object gridMod extends js.Object {
  @js.native
  class GridCell[T, P /* <: IGridCellProps[T] */] ()
    extends typingsSlinky.officeUiFabricReact.gridCellMod.GridCell[T, P]
  
  val Grid: ReactComponentClass[IGridProps] = js.native
  /* static members */
  @js.native
  object GridCell extends js.Object {
    var defaultProps: Disabled = js.native
  }
  
}

