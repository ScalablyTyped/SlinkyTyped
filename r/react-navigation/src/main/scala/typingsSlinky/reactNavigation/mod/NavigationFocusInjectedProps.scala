package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationFocusInjectedProps[P] extends NavigationInjectedProps[P] {
  var isFocused: Boolean = js.native
}

object NavigationFocusInjectedProps {
  @scala.inline
  def apply[P](isFocused: Boolean, navigation: NavigationScreenProp[NavigationRoute[P], P]): NavigationFocusInjectedProps[P] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFocusInjectedProps[P]]
  }
  @scala.inline
  implicit class NavigationFocusInjectedPropsOps[Self[p] <: NavigationFocusInjectedProps[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withIsFocused(value: Boolean): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

