package typingsSlinky.reactDashNavigationDashDrawer

import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerOptions
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptions[Params, ScreenProps] extends js.Object {
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.undefined
}

object Anon_NavigationOptions {
  @scala.inline
  def apply[Params, ScreenProps](
    navigationOptions: NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ] = null
  ): Anon_NavigationOptions[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptions[Params, ScreenProps]]
  }
}

