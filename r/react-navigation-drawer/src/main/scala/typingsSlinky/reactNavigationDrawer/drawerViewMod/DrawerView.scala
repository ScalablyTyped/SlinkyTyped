package typingsSlinky.reactNavigationDrawer.drawerViewMod

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import typingsSlinky.reactNavigation.mod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerView
  extends Component[Props, State, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MDrawerView(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDrawerView(prevProps: Props): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDrawerView(): Unit = js.native
  
  @JSName("context")
  var context_DrawerView: ContextType[Context[SupportedThemes]] = js.native
  
  var drawerGestureRef: js.Any = js.native
  
  var getDrawerBackgroundColor: js.Any = js.native
  
  var getLockMode: js.Any = js.native
  
  var getOverlayColor: js.Any = js.native
  
  var handleDrawerClose: js.Any = js.native
  
  var handleDrawerOpen: js.Any = js.native
  
  var renderContent: js.Any = js.native
  
  var renderNavigationView: js.Any = js.native
  
  var setDrawerGestureRef: js.Any = js.native
  
  var updateWidth: js.Any = js.native
}
