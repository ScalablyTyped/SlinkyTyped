package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.overlayTypesMod.IOverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Overlay", JSImport.Namespace)
@js.native
object overlayMod extends js.Object {
  
  val Overlay: ReactComponentClass[IOverlayProps] = js.native
  
  @js.native
  class OverlayBase protected ()
    extends typingsSlinky.officeUiFabricReact.overlayBaseMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
}
