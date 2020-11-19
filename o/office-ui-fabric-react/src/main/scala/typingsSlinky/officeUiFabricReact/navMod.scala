package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.navTypesMod.INavProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Nav", JSImport.Namespace)
@js.native
object navMod extends js.Object {
  
  val Nav: ReactComponentClass[INavProps] = js.native
  
  def isRelativeUrl(url: String): Boolean = js.native
  
  @js.native
  class NavBase protected ()
    extends typingsSlinky.officeUiFabricReact.navBaseMod.NavBase {
    def this(props: INavProps) = this()
  }
  /* static members */
  @js.native
  object NavBase extends js.Object {
    
    var defaultProps: INavProps = js.native
  }
}
