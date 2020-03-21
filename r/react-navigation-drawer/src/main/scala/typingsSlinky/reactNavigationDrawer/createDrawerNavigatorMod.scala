package typingsSlinky.reactNavigationDrawer

import typingsSlinky.reactNavigation.mod.CreateNavigatorConfig
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerConfig
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerOptions
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerProp
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerRouterConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-drawer/lib/typescript/src/navigators/createDrawerNavigator", JSImport.Namespace)
@js.native
object createDrawerNavigatorMod extends js.Object {
  def default(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): js.Any = js.native
  def default(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _], 
      _
    ],
    config: CreateNavigatorConfig[
      NavigationDrawerConfig, 
      NavigationDrawerRouterConfig, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
}

