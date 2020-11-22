package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.officeUiFabricReact.buttonGridTypesMod.IButtonGrid
import typingsSlinky.officeUiFabricReact.buttonGridTypesMod.IButtonGridProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", JSImport.Namespace)
@js.native
object buttonGridBaseMod extends js.Object {
  
  val GridBase: Instantiable1[/* props */ IButtonGridProps, ButtonGridBase] = js.native
  
  @js.native
  class ButtonGridBase protected ()
    extends Component[IButtonGridProps, js.Object, js.Any]
       with IButtonGrid {
    def this(props: IButtonGridProps) = this()
    
    var _id: js.Any = js.native
  }
}
