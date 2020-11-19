package typingsSlinky.reactNavigationMaterialBottomTabs.createMaterialBottomTabNavigatorMod

import typingsSlinky.reactNavigation.mod.CreateNavigatorConfig
import typingsSlinky.reactNavigation.mod.NavigationNavigator
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationProp
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap
import typingsSlinky.reactNavigation.mod.NavigationState
import typingsSlinky.reactNavigation.mod.NavigationTabRouterConfig
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabConfig
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabOptions
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/navigators/createMaterialBottomTabNavigator", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
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
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
}
