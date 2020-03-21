package typingsSlinky.reactToolbox

import typingsSlinky.react.mod.Component
import typingsSlinky.reactToolbox.layoutLayoutMod.LayoutProps
import typingsSlinky.reactToolbox.navDrawerMod.NavDrawerProps
import typingsSlinky.reactToolbox.panelMod.PanelProps
import typingsSlinky.reactToolbox.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/components/layout", JSImport.Namespace)
@js.native
object layoutMod extends js.Object {
  @js.native
  class Layout ()
    extends Component[LayoutProps, js.Object, js.Any]
  
  @js.native
  class NavDrawer ()
    extends Component[NavDrawerProps, js.Object, js.Any]
  
  @js.native
  class Panel ()
    extends Component[PanelProps, js.Object, js.Any]
  
  @js.native
  class Sidebar ()
    extends Component[SidebarProps, js.Object, js.Any]
  
}

