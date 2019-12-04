package typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod

import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerScreenProps[Params, ScreenProps] extends js.Object {
  var navigation: NavigationDrawerProp[NavigationRoute[NavigationParams], Params]
  var screenProps: ScreenProps
  var theme: SupportedThemes
}

object NavigationDrawerScreenProps {
  @scala.inline
  def apply[Params, ScreenProps](
    navigation: NavigationDrawerProp[NavigationRoute[NavigationParams], Params],
    screenProps: ScreenProps,
    theme: SupportedThemes
  ): NavigationDrawerScreenProps[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationDrawerScreenProps[Params, ScreenProps]]
  }
}

