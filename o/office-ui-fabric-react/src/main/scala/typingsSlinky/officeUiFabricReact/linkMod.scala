package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.linkTypesMod.ILinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Link", JSImport.Namespace)
@js.native
object linkMod extends js.Object {
  @js.native
  class LinkBase protected ()
    extends typingsSlinky.officeUiFabricReact.linkBaseMod.LinkBase {
    def this(props: ILinkProps) = this()
  }
  
  val Link: ReactComponentClass[ILinkProps] = js.native
}

