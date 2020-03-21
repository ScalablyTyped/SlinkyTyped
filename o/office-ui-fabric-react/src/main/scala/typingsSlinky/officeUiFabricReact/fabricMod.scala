package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.fabricTypesMod.IFabricProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Fabric", JSImport.Namespace)
@js.native
object fabricMod extends js.Object {
  @js.native
  class FabricBase protected ()
    extends typingsSlinky.officeUiFabricReact.fabricBaseMod.FabricBase {
    def this(props: IFabricProps) = this()
  }
  
  val Fabric: ReactComponentClass[IFabricProps] = js.native
}

