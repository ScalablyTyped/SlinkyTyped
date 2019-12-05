package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsOverflowSetOverflowSetDotTypesMod.IOverflowSetProps
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.role
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.vertical
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/OverflowSet", JSImport.Namespace)
@js.native
object libOverflowSetMod extends js.Object {
  @js.native
  class OverflowSetBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsOverflowSetMod.OverflowSetBase {
    def this(props: IOverflowSetProps) = this()
  }
  
  val OverflowSet: ReactComponentClass[IOverflowSetProps] = js.native
  /* static members */
  @js.native
  object OverflowSetBase extends js.Object {
    var defaultProps: Pick[IOverflowSetProps, vertical | role] = js.native
  }
  
}

