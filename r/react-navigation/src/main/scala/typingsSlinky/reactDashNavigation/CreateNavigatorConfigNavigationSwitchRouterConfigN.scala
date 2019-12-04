package typingsSlinky.reactDashNavigation

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationPathsConfig
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationSwitchProp
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.history
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.initialRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.none
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.CreateNavigatorConfig<{}, react-navigation.react-navigation.NavigationSwitchRouterConfig, {}, react-navigation.react-navigation.NavigationSwitchProp<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>, react-navigation.react-navigation.NavigationParams>> */
trait CreateNavigatorConfigNavigationSwitchRouterConfigN extends js.Object {
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.undefined
  var defaultNavigationOptions: js.UndefOr[
    NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.undefined
  var order: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
   // defaults to 'none'
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
}

object CreateNavigatorConfigNavigationSwitchRouterConfigN {
  @scala.inline
  def apply(
    backBehavior: none | initialRoute | history | order = null,
    defaultNavigationOptions: NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ] = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    navigationOptions: NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ] = null,
    order: js.Array[String] = null,
    paths: NavigationPathsConfig = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined
  ): CreateNavigatorConfigNavigationSwitchRouterConfigN = {
    val __obj = js.Dynamic.literal()
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNavigatorConfigNavigationSwitchRouterConfigN]
  }
}

