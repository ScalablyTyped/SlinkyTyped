package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.linkTypesMod.ILinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLinkMod {
  
  @JSImport("office-ui-fabric-react/lib/Link", "Link")
  @js.native
  val Link: ReactComponentClass[ILinkProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Link", "LinkBase")
  @js.native
  class LinkBase protected ()
    extends typingsSlinky.officeUiFabricReact.linkMod.LinkBase {
    def this(props: ILinkProps) = this()
  }
}
