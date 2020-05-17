package typingsSlinky.reactNavigation.anon

import typingsSlinky.reactNavigation.mod.NavigationRouter
import typingsSlinky.reactNavigation.mod.NavigationScreenConfig
import typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router[Options, NavigationPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationPropType, _]] = js.native
  var router: NavigationRouter[Options, js.Object] = js.native
}

object Router {
  @scala.inline
  def apply[Options, NavigationPropType](router: NavigationRouter[Options, js.Object]): Router[Options, NavigationPropType] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router[Options, NavigationPropType]]
  }
  @scala.inline
  implicit class RouterOps[Self[options, navigationproptype] <: Router[options, navigationproptype], Options, NavigationPropType] (val x: Self[Options, NavigationPropType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options, NavigationPropType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options, NavigationPropType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Options, NavigationPropType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Options, NavigationPropType]) with Other]
    @scala.inline
    def withRouter(value: NavigationRouter[Options, js.Object]): Self[Options, NavigationPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationPropType, _]) with NavigationOptionsOptions[Options] => Options
    ): Self[Options, NavigationPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNavigationOptions(value: NavigationScreenConfig[Options, NavigationPropType, _]): Self[Options, NavigationPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationOptions: Self[Options, NavigationPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.undefined)
        ret
    }
  }
  
}

