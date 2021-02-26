package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.Disabled
import typingsSlinky.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps
import typingsSlinky.officeUiFabricReact.buttonGridTypesMod.IButtonGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("office-ui-fabric-react/lib/Grid", "ButtonGrid")
  @js.native
  val ButtonGrid: ReactComponentClass[IButtonGridProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Grid", "ButtonGridCell")
  @js.native
  class ButtonGridCell[T, P /* <: IButtonGridCellProps[T] */] protected ()
    extends typingsSlinky.officeUiFabricReact.buttonGridMod.ButtonGridCell[T, P] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
  }
  /* static members */
  object ButtonGridCell {
    
    @JSImport("office-ui-fabric-react/lib/Grid", "ButtonGridCell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Grid", "ButtonGridCell.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Grid", "Grid")
  @js.native
  val Grid: ReactComponentClass[IButtonGridProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/Grid", "GridCell")
  @js.native
  class GridCell[T, P /* <: IButtonGridCellProps[/* import warning: RewrittenClass.unapply cls was tparam T */ _] */] ()
    extends typingsSlinky.officeUiFabricReact.buttonGridCellMod.ButtonGridCell[T, P]
  object GridCell {
    
    @JSImport("office-ui-fabric-react/lib/Grid", "GridCell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Grid", "GridCell.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
