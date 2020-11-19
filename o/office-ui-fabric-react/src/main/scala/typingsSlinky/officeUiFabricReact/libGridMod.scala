package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.Disabled
import typingsSlinky.officeUiFabricReact.gridCellTypesMod.IGridCellProps
import typingsSlinky.officeUiFabricReact.gridTypesMod.IGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  
  val Grid: ReactComponentClass[IGridProps] = js.native
  
  @js.native
  class GridCell[T, P /* <: IGridCellProps[T] */] ()
    extends typingsSlinky.officeUiFabricReact.gridMod.GridCell[T, P]
  /* static members */
  @js.native
  object GridCell extends js.Object {
    
    var defaultProps: Disabled = js.native
  }
}
