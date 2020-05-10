package typingsSlinky.reactNavigationDrawer

import typingsSlinky.reactNavigation.AnonNavigationOptionsOptions
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenConfig
import typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerOptions
import typingsSlinky.reactNavigationDrawer.typesMod.NavigationDrawerProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNavigationOptions[Params, ScreenProps] extends js.Object {
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.native
}

object AnonNavigationOptions {
  @scala.inline
  def apply[Params, ScreenProps](): AnonNavigationOptions[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNavigationOptions[Params, ScreenProps]]
  }
  @scala.inline
  implicit class AnonNavigationOptionsOps[Self[params, screenprops] <: AnonNavigationOptions[params, screenprops], Params, ScreenProps] (val x: Self[Params, ScreenProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params, ScreenProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params, ScreenProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Params, ScreenProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Params, ScreenProps]) with Other]
    @scala.inline
    def withNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationDrawerProp[NavigationRoute[NavigationParams], Params], ScreenProps]) with AnonNavigationOptionsOptions[NavigationDrawerOptions] => NavigationDrawerOptions
    ): Self[Params, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNavigationOptions(
      value: NavigationScreenConfig[
          NavigationDrawerOptions, 
          NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
          ScreenProps
        ]
    ): Self[Params, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationOptions: Self[Params, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.undefined)
        ret
    }
  }
  
}

