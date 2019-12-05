package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsToggleToggleDotBaseMod.IToggleState
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsToggleToggleDotTypesMod.IToggleProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Toggle", JSImport.Namespace)
@js.native
object libToggleMod extends js.Object {
  @js.native
  class ToggleBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsToggleMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  
  val Toggle: ReactComponentClass[IToggleProps] = js.native
  /* static members */
  @js.native
  object ToggleBase extends js.Object {
    def getDerivedStateFromProps(nextProps: IToggleProps, prevState: IToggleState): Partial[IToggleState] | Null = js.native
  }
  
}

