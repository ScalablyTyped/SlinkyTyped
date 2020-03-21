package typingsSlinky.reactRouterNavigation.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactRouterNavigation.AnonKey
import typingsSlinky.reactRouterNavigation.AnonLazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "BottomNavigation")
@js.native
class BottomNavigation ()
  extends Component[BottomNavigationProps, AnonKey, js.Any] {
  def renderNavigationBar(sceneProps: TabSubViewProps, props: TabSubViewProps): TagMod[Any] = js.native
  def renderPager(sceneProps: TabSubViewProps): TagMod[Any] = js.native
  def renderScene(sceneProps: TabSubViewProps): ReactElement = js.native
  def renderSceneView(sceneProps: TabSubViewProps): TagMod[Any] = js.native
}

/* static members */
@JSImport("react-router-navigation", "BottomNavigation")
@js.native
object BottomNavigation extends js.Object {
  var defaultProps: AnonLazy = js.native
}

