package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.gridCellTypesMod.IGridCellProps
import typingsSlinky.officeUiFabricReact.gridTypesMod.IGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  @js.native
  class GridCell[T, P /* <: IGridCellProps[T] */] ()
    extends typingsSlinky.officeUiFabricReact.gridMod.GridCell[T, P]
  
  val Grid: ReactComponentClass[IGridProps] = js.native
  /* static members */
  @js.native
  object GridCell extends js.Object {
    var defaultProps: AnonDisabled = js.native
  }
  
}

