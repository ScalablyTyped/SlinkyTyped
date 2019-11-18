package typingsSlinky.reactDashNavigation

import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationSwitchProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptionsNavigationParams[Params, ScreenProps] extends js.Object {
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.undefined
}

object Anon_NavigationOptionsNavigationParams {
  @scala.inline
  def apply[Params, ScreenProps](
    navigationOptions: NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ] = null
  ): Anon_NavigationOptionsNavigationParams[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptionsNavigationParams[Params, ScreenProps]]
  }
}

