package typingsSlinky.reactRouterNavigationCore.mod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.Component
import typingsSlinky.reactRouterNavigationCore.anon.ForceSync
import typingsSlinky.reactRouterNavigationCore.anon.LoadedTabs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-router-navigation-core", "TabStack")
@js.native
class TabStack protected ()
  extends Component[TabStackProps, LoadedTabs, js.Any] {
  def this(props: TabStackProps) = this()
  
  def onIndexChange(index: Double): Unit = js.native
  
  def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
  
  var unlistenHistory: js.UndefOr[js.Function0[Unit]] = js.native
}
/* static members */
@JSImport("react-router-navigation-core", "TabStack")
@js.native
object TabStack extends js.Object {
  
  var defaultProps: ForceSync = js.native
}
