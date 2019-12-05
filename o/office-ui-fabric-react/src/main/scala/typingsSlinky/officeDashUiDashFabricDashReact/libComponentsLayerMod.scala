package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod.ILayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Layer", JSImport.Namespace)
@js.native
object libComponentsLayerMod extends js.Object {
  @js.native
  class LayerBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotBaseMod.LayerBase {
    def this(props: ILayerProps) = this()
  }
  
  @js.native
  class LayerHost ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsLayerLayerHostMod.LayerHost
  
  val Layer: ReactComponentClass[ILayerProps] = js.native
  /* static members */
  @js.native
  object LayerBase extends js.Object {
    var defaultProps: ILayerProps = js.native
  }
  
}

