package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.gridTypesMod.IGrid
import typingsSlinky.officeUiFabricReact.gridTypesMod.IGridProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/grid/Grid.base", JSImport.Namespace)
@js.native
object gridBaseMod extends js.Object {
  
  @js.native
  class GridBase protected ()
    extends Component[IGridProps, js.Object, js.Any]
       with IGrid {
    def this(props: IGridProps) = this()
    
    var _id: js.Any = js.native
  }
}
