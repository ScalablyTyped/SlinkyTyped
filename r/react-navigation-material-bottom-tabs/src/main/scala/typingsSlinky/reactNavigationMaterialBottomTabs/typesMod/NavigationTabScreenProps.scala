package typingsSlinky.reactNavigationMaterialBottomTabs.typesMod

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTabScreenProps[Params, ScreenProps] extends js.Object {
  var navigation: NavigationTabProp[NavigationRoute[NavigationParams], Params]
  var screenProps: ScreenProps
  var theme: SupportedThemes
}

object NavigationTabScreenProps {
  @scala.inline
  def apply[Params, ScreenProps](
    navigation: NavigationTabProp[NavigationRoute[NavigationParams], Params],
    screenProps: ScreenProps,
    theme: SupportedThemes
  ): NavigationTabScreenProps[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationTabScreenProps[Params, ScreenProps]]
  }
}

