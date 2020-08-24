package typingsSlinky.reactRouterNavigation.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation", "Navigation")
@js.native
class Navigation ()
  extends Component[NavigationComponentProps, js.Object, js.Any] {
  @JSName("props")
  var props_Navigation: NavigationComponentProps = js.native
  def renderHeader(sceneProps: CardSubViewProps, props: CardSubViewProps): ReactElement = js.native
  def renderSceneComponent(sceneProps: CardSubViewProps): js.UndefOr[ReactComponentClass[_]] = js.native
}

