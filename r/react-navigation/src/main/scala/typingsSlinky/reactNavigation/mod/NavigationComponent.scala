package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationScreenComponent[Options, NavigationPropType]
  - typingsSlinky.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType]
*/
trait NavigationComponent[Options, NavigationPropType]
  extends NavigationRouteConfig[Options, NavigationPropType, js.Any]

object NavigationComponent {
  @scala.inline
  implicit def apply[Options, NavigationPropType](
    value: (NavigationNavigator[Options, NavigationPropType]) | (NavigationScreenComponent[Options, NavigationPropType])
  ): NavigationComponent[Options, NavigationPropType] = value.asInstanceOf[NavigationComponent[Options, NavigationPropType]]
}

