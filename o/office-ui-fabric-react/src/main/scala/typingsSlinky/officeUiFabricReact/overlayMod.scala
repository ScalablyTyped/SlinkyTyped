package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.overlayTypesMod.IOverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Overlay", "Overlay")
  @js.native
  val Overlay: ReactComponentClass[IOverlayProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Overlay", "OverlayBase")
  @js.native
  class OverlayBase protected ()
    extends typingsSlinky.officeUiFabricReact.overlayBaseMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
}
