package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.`no-preference`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationNavigatorProps[Options, State, ScreenProps] extends js.Object {
  var detached: js.UndefOr[Boolean] = js.native
  var navigation: js.UndefOr[NavigationProp[State]] = js.native
  var navigationOptions: js.UndefOr[Options] = js.native
  var screenProps: js.UndefOr[ScreenProps] = js.native
  var theme: js.UndefOr[SupportedThemes | `no-preference`] = js.native
}

object NavigationNavigatorProps {
  @scala.inline
  def apply[Options, State, ScreenProps](): NavigationNavigatorProps[Options, State, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationNavigatorProps[Options, State, ScreenProps]]
  }
  @scala.inline
  implicit class NavigationNavigatorPropsOps[Self[options, state, screenprops] <: NavigationNavigatorProps[options, state, screenprops], Options, State, ScreenProps] (val x: Self[Options, State, ScreenProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options, State, ScreenProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options, State, ScreenProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Options, State, ScreenProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Options, State, ScreenProps]) with Other]
    @scala.inline
    def withDetached(value: Boolean): Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetached: Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationProp[State]): Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationOptions(value: Options): Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationOptions: Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenProps(value: ScreenProps): Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenProps: Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: SupportedThemes | `no-preference`): Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[Options, State, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

