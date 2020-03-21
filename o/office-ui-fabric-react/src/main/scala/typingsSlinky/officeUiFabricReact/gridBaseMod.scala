package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.gridTypesMod.IGrid
import typingsSlinky.officeUiFabricReact.gridTypesMod.IGridProps
import typingsSlinky.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/grid/Grid.base", JSImport.Namespace)
@js.native
object gridBaseMod extends js.Object {
  @js.native
  class GridBase protected ()
    extends BaseComponent[IGridProps, js.Object]
       with IGrid {
    def this(props: IGridProps) = this()
    var _id: js.Any = js.native
  }
  
}

