package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod.INavProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Nav", JSImport.Namespace)
@js.native
object libComponentsNavMod extends js.Object {
  @js.native
  class NavBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsNavNavDotBaseMod.NavBase {
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

