package typingsSlinky.reactNavigation

import typingsSlinky.reactNavigation.mod.NavigationScreenComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetScreen[Options, NavigationScreenPropType] extends js.Object {
  def getScreen(): NavigationScreenComponent[Options, NavigationScreenPropType] = js.native
}

object AnonGetScreen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](getScreen: () => NavigationScreenComponent[Options, NavigationScreenPropType]): AnonGetScreen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getScreen = js.Any.fromFunction0(getScreen))
    __obj.asInstanceOf[AnonGetScreen[Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class AnonGetScreenOps[Self[options, navigationscreenproptype] <: AnonGetScreen[options, navigationscreenproptype], Options, NavigationScreenPropType] (val x: Self[Options, NavigationScreenPropType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options, NavigationScreenPropType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options, NavigationScreenPropType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Options, NavigationScreenPropType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Options, NavigationScreenPropType]) with Other]
    @scala.inline
    def withGetScreen(value: () => NavigationScreenComponent[Options, NavigationScreenPropType]): Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScreen")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

