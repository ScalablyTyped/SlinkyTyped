package typingsSlinky.reactNavigationMaterialBottomTabs.createMaterialBottomTabNavigatorMod

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

@JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/navigators/createMaterialBottomTabNavigator", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): js.Any = js.native
  def apply(
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

