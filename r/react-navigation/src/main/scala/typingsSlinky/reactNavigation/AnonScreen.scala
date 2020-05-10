package typingsSlinky.reactNavigation

import typingsSlinky.reactNavigation.mod.NavigationComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScreen[Options, NavigationScreenPropType] extends js.Object {
  var screen: NavigationComponent[Options, NavigationScreenPropType] = js.native
}

object AnonScreen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](screen: NavigationComponent[Options, NavigationScreenPropType]): AnonScreen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScreen[Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class AnonScreenOps[Self[options, navigationscreenproptype] <: AnonScreen[options, navigationscreenproptype], Options, NavigationScreenPropType] (val x: Self[Options, NavigationScreenPropType]) extends AnyVal {
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

