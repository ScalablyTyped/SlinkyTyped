package typingsSlinky.reactDashNavigation

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultNavigationOptions[Options, NavigationScreenPropType] extends js.Object {
  var defaultNavigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.undefined
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.undefined
}

object Anon_DefaultNavigationOptions {
  @scala.inline
  def apply[Options, NavigationScreenPropType](
    defaultNavigationOptions: NavigationScreenConfig[Options, NavigationScreenPropType, _] = null,
    navigationOptions: NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ] = null
  ): Anon_DefaultNavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultNavigationOptions[Options, NavigationScreenPropType]]
  }
}

