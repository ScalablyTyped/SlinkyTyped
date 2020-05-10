package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationInjectedProps[P] extends js.Object {
  var navigation: NavigationScreenProp[NavigationRoute[P], P] = js.native
}

object NavigationInjectedProps {
  @scala.inline
  def apply[P](navigation: NavigationScreenProp[NavigationRoute[P], P]): NavigationInjectedProps[P] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationInjectedProps[P]]
  }
  @scala.inline
  implicit class NavigationInjectedPropsOps[Self[p] <: NavigationInjectedProps[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withNavigation(value: NavigationScreenProp[NavigationRoute[P], P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

