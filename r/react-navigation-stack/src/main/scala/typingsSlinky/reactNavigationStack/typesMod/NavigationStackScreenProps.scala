package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationStackScreenProps[Params, ScreenProps] extends js.Object {
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], Params] = js.native
  var screenProps: ScreenProps = js.native
  var theme: SupportedThemes = js.native
}

object NavigationStackScreenProps {
  @scala.inline
  def apply[Params, ScreenProps](
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], Params],
    screenProps: ScreenProps,
    theme: SupportedThemes
  ): NavigationStackScreenProps[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackScreenProps[Params, ScreenProps]]
  }
  @scala.inline
  implicit class NavigationStackScreenPropsOps[Self[params, screenprops] <: NavigationStackScreenProps[params, screenprops], Params, ScreenProps] (val x: Self[Params, ScreenProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params, ScreenProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params, ScreenProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Params, ScreenProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Params, ScreenProps]) with Other]
    @scala.inline
    def withNavigation(value: NavigationStackProp[NavigationRoute[NavigationParams], Params]): Self[Params, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenProps(value: ScreenProps): Self[Params, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: SupportedThemes): Self[Params, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

