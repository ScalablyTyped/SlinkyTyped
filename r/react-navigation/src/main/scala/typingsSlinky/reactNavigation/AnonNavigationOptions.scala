package typingsSlinky.reactNavigation

import typingsSlinky.reactNavigation.mod.NavigationScreenConfig
import typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNavigationOptions[Options, NavigationScreenPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.native
}

object AnonNavigationOptions {
  @scala.inline
  def apply[Options, NavigationScreenPropType](): AnonNavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNavigationOptions[Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class AnonNavigationOptionsOps[Self[options, navigationscreenproptype] <: AnonNavigationOptions[options, navigationscreenproptype], Options, NavigationScreenPropType] (val x: Self[Options, NavigationScreenPropType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options, NavigationScreenPropType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options, NavigationScreenPropType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Options, NavigationScreenPropType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Options, NavigationScreenPropType]) with Other]
    @scala.inline
    def withNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, _]) with AnonNavigationOptionsOptions[Options] => Options
    ): Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, _]): Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationOptions: Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.undefined)
        ret
    }
  }
  
}

