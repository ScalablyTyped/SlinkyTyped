package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.Disabled
import typingsSlinky.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps
import typingsSlinky.officeUiFabricReact.buttonGridTypesMod.IButtonGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/ButtonGrid", JSImport.Namespace)
@js.native
object libButtonGridMod extends js.Object {
  
  val ButtonGrid: ReactComponentClass[IButtonGridProps] = js.native
  
  val Grid: ReactComponentClass[IButtonGridProps] = js.native
  
  @js.native
  class ButtonGridCell[T, P /* <: IButtonGridCellProps[T] */] ()
    extends typingsSlinky.officeUiFabricReact.buttonGridMod.ButtonGridCell[T, P]
  /* static members */
  @js.native
  object ButtonGridCell extends js.Object {
    
    var defaultProps: Disabled = js.native
  }
  
  @js.native
  class GridCell[T, P /* <: IButtonGridCellProps[/* import warning: RewrittenClass.unapply cls was tparam T */ _] */] ()
    extends typingsSlinky.officeUiFabricReact.buttonGridCellMod.ButtonGridCell[T, P]
  @js.native
  object GridCell
    extends Instantiable0[
          typingsSlinky.officeUiFabricReact.buttonGridCellMod.ButtonGridCell[
            js.Object, 
            IButtonGridCellProps[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
          ]
        ] {
    
    var defaultProps: Disabled = js.native
  }
}
