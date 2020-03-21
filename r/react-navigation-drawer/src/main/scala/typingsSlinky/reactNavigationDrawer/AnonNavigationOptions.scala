package typingsSlinky.reactNavigationDrawer

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenConfig
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerOptions
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNavigationOptions[Params, ScreenProps] extends js.Object {
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.undefined
}

object AnonNavigationOptions {
  @scala.inline
  def apply[Params, ScreenProps](
    navigationOptions: NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ] = null
  ): AnonNavigationOptions[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNavigationOptions[Params, ScreenProps]]
  }
}

