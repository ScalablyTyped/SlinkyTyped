package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.linkTypesMod.ILinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Link", JSImport.Namespace)
@js.native
object libLinkMod extends js.Object {
  
  val Link: ReactComponentClass[ILinkProps] = js.native
  
  @js.native
  class LinkBase protected ()
    extends typingsSlinky.officeUiFabricReact.linkMod.LinkBase {
    def this(props: ILinkProps) = this()
  }
}
