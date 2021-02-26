package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKeytipLayerMod {
  
  @JSImport("office-ui-fabric-react/lib/KeytipLayer", "KeytipLayer")
  @js.native
  val KeytipLayer: ReactComponentClass[IKeytipLayerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/KeytipLayer", "KeytipLayerBase")
  @js.native
  class KeytipLayerBase protected ()
    extends typingsSlinky.officeUiFabricReact.keytipLayerMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: js.Any) = this()
  }
  /* static members */
  object KeytipLayerBase {
    
    @JSImport("office-ui-fabric-react/lib/KeytipLayer", "KeytipLayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/KeytipLayer", "KeytipLayerBase.defaultProps")
    @js.native
    def defaultProps: IKeytipLayerProps = js.native
    @scala.inline
    def defaultProps_=(x: IKeytipLayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
