package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/KeytipLayer", JSImport.Namespace)
@js.native
object keytipLayerMod extends js.Object {
  @js.native
  class KeytipLayerBase protected ()
    extends typingsSlinky.officeUiFabricReact.keytipLayerBaseMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: js.Any) = this()
  }
  
  val KeytipLayer: ReactComponentClass[IKeytipLayerProps] = js.native
  /* static members */
  @js.native
  object KeytipLayerBase extends js.Object {
    var defaultProps: IKeytipLayerProps = js.native
  }
  
}

