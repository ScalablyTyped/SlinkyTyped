package typingsSlinky.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import typingsSlinky.history.historyMod.History
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashRouterDashNavigationDashCore.Anon_False
import typingsSlinky.reactDashRouterDashNavigationDashCore.Anon_KeyLoadedTabs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "TabStack")
@js.native
class TabStack protected ()
  extends Component[TabStackProps, Anon_KeyLoadedTabs, js.Any] {
  def this(props: TabStackProps) = this()
  var unlistenHistory: js.UndefOr[js.Function0[Unit]] = js.native
  def onIndexChange(index: Double): Unit = js.native
  def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
}

/* static members */
@JSImport("react-router-navigation-core", "TabStack")
@js.native
object TabStack extends js.Object {
  var defaultProps: Anon_False = js.native
}

