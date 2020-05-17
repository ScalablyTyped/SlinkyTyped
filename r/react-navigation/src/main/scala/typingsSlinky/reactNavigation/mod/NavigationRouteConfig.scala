package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.anon.GetScreen
import typingsSlinky.reactNavigation.anon.Path
import typingsSlinky.reactNavigation.anon.Screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationComponent[Options, NavigationScreenPropType]
  - ((typingsSlinky.reactNavigation.anon.Screen[Options, NavigationScreenPropType]) | (typingsSlinky.reactNavigation.anon.GetScreen[Options, NavigationScreenPropType])) with (typingsSlinky.reactNavigation.anon.Path[Options, NavigationScreenPropType, ScreenProps])
*/
trait NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps] extends js.Object

object NavigationRouteConfig {
  @scala.inline
  implicit def apply[Options, NavigationScreenPropType, ScreenProps](
    value: ((Screen[Options, NavigationScreenPropType]) | (GetScreen[Options, NavigationScreenPropType])) with (Path[Options, NavigationScreenPropType, ScreenProps])
  ): NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps] = value.asInstanceOf[NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps]]
  @scala.inline
  implicit def apply[Options, NavigationScreenPropType, ScreenProps](value: NavigationComponent[Options, NavigationScreenPropType]): NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps] = value.asInstanceOf[NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps]]
}

