package typingsSlinky.reactNavigation.anon

import typingsSlinky.reactNavigation.mod.NavigationComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Screen[Options, NavigationScreenPropType] extends js.Object {
  var screen: NavigationComponent[Options, NavigationScreenPropType] = js.native
}

object Screen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](screen: NavigationComponent[Options, NavigationScreenPropType]): Screen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen[Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class ScreenOps[Self[options, navigationscreenproptype] <: Screen[options, navigationscreenproptype], Options, NavigationScreenPropType] (val x: Self[Options, NavigationScreenPropType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options, NavigationScreenPropType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options, NavigationScreenPropType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Options, NavigationScreenPropType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Options, NavigationScreenPropType]) with Other]
    @scala.inline
    def withScreen(value: NavigationComponent[Options, NavigationScreenPropType]): Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

