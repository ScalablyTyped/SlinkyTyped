package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneContext
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneProps
import typingsSlinky.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ScrollablePane", JSImport.Namespace)
@js.native
object libScrollablePaneMod extends js.Object {
  @js.native
  class ScrollablePaneBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsScrollablePaneMod.ScrollablePaneBase {
    def this(props: IScrollablePaneProps) = this()
  }
  
  val ScrollablePane: ReactComponentClass[IScrollablePaneProps] = js.native
  val ScrollablePaneContext: Context[IScrollablePaneContext] = js.native
  @js.native
  object ScrollbarVisibility extends js.Object {
    var always: typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.always = js.native
    var auto: typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.auto = js.native
  }
  
}

