package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.layerHostTypesMod.ILayerHostProps
import typingsSlinky.officeUiFabricReact.layerTypesMod.ILayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayerMod {
  
  @JSImport("office-ui-fabric-react/lib/Layer", "Layer")
  @js.native
  val Layer: ReactComponentClass[ILayerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Layer", "LayerBase")
  @js.native
  class LayerBase protected ()
    extends typingsSlinky.officeUiFabricReact.layerMod.LayerBase {
    def this(props: ILayerProps) = this()
  }
  /* static members */
  object LayerBase {
    
    @JSImport("office-ui-fabric-react/lib/Layer", "LayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Layer", "LayerBase.defaultProps")
    @js.native
    def defaultProps: ILayerProps = js.native
    @scala.inline
    def defaultProps_=(x: ILayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Layer", "LayerHost")
  @js.native
  class LayerHost protected ()
    extends typingsSlinky.officeUiFabricReact.layerMod.LayerHost {
    def this(props: ILayerHostProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ILayerHostProps, context: js.Any) = this()
  }
}
