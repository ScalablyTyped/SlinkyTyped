package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/KeytipLayer", JSImport.Namespace)
@js.native
object keytipLayerMod extends js.Object {
  
  val KeytipLayer: ReactComponentClass[IKeytipLayerProps] = js.native
  
  @js.native
  class KeytipLayerBase protected ()
    extends typingsSlinky.officeUiFabricReact.keytipLayerBaseMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object KeytipLayerBase extends js.Object {
    
    var defaultProps: IKeytipLayerProps = js.native
  }
}
