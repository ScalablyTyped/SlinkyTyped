package typingsSlinky.reactNavigationMaterialBottomTabs

import typingsSlinky.reactNavigation.mod.CreateNavigatorConfig
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap
import typingsSlinky.reactNavigation.mod.NavigationTabRouterConfig
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabConfig
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabOptions
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-material-bottom-tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createMaterialBottomTabNavigator(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): js.Any = js.native
  def createMaterialBottomTabNavigator(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ],
    config: CreateNavigatorConfig[
      NavigationMaterialBottomTabConfig, 
      NavigationTabRouterConfig, 
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
}

