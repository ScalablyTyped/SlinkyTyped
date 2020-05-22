package typingsSlinky.reactRouterNavigation.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactRouterNavigationCore.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card
  extends RouteProps
     with NavBarProps {
  var key: String
}

@JSImport("react-router-navigation", "Card")
@js.native
object Card extends js.Object {
  def apply(props: CardProps): ReactElement = js.native
}

