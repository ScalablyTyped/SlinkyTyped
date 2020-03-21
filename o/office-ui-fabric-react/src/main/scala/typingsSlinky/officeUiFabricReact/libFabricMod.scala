package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.fabricTypesMod.IFabricProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Fabric", JSImport.Namespace)
@js.native
object libFabricMod extends js.Object {
  @js.native
  class FabricBase protected ()
    extends typingsSlinky.officeUiFabricReact.fabricMod.FabricBase {
    def this(props: IFabricProps) = this()
  }
  
  val Fabric: ReactComponentClass[IFabricProps] = js.native
}

