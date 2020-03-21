package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.layerTypesMod.ILayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Layer", JSImport.Namespace)
@js.native
object layerMod extends js.Object {
  @js.native
  class LayerBase protected ()
    extends typingsSlinky.officeUiFabricReact.layerBaseMod.LayerBase {
    def this(props: ILayerProps) = this()
  }
  
  @js.native
  class LayerHost ()
    extends typingsSlinky.officeUiFabricReact.layerHostMod.LayerHost
  
  val Layer: ReactComponentClass[ILayerProps] = js.native
  /* static members */
  @js.native
  object LayerBase extends js.Object {
    var defaultProps: ILayerProps = js.native
  }
  
}

