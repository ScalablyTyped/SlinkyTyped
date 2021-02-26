package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.linkTypesMod.ILinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Link", "Link")
  @js.native
  val Link: ReactComponentClass[ILinkProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Link", "LinkBase")
  @js.native
  class LinkBase protected ()
    extends typingsSlinky.officeUiFabricReact.linkBaseMod.LinkBase {
    def this(props: ILinkProps) = this()
  }
}
