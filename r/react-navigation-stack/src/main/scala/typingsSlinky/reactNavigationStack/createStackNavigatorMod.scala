package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNavigation.mod.CreateNavigatorConfig
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap
import typingsSlinky.reactNavigation.mod.NavigationStackRouterConfig
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackConfig
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackOptions
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/navigators/createStackNavigator", JSImport.Namespace)
@js.native
object createStackNavigatorMod extends js.Object {
  def default(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _]
  ): js.Any = js.native
  def default(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _],
    stackConfig: CreateNavigatorConfig[
      NavigationStackConfig, 
      NavigationStackRouterConfig, 
      NavigationStackOptions, 
      NavigationStackProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
}

