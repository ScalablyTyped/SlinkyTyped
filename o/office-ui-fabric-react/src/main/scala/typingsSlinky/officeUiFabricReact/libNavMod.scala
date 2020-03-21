package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.navTypesMod.INavProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Nav", JSImport.Namespace)
@js.native
object libNavMod extends js.Object {
  @js.native
  class NavBase protected ()
    extends typingsSlinky.officeUiFabricReact.navMod.NavBase {
    def this(props: INavProps) = this()
  }
  
  val Nav: ReactComponentClass[INavProps] = js.native
  def isRelativeUrl(url: String): Boolean = js.native
  /* static members */
  @js.native
  object NavBase extends js.Object {
    var defaultProps: INavProps = js.native
  }
  
}

