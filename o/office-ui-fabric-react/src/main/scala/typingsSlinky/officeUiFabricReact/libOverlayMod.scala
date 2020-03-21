package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.overlayTypesMod.IOverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Overlay", JSImport.Namespace)
@js.native
object libOverlayMod extends js.Object {
  @js.native
  class OverlayBase protected ()
    extends typingsSlinky.officeUiFabricReact.overlayMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
  
  val Overlay: ReactComponentClass[IOverlayProps] = js.native
}

