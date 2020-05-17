package typingsSlinky.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationState[T /* <: typingsSlinky.reactNativeTabView.typesMod.Route */] extends js.Object {
  var navigationState: typingsSlinky.reactNativeTabView.typesMod.NavigationState[T] = js.native
}

object NavigationState {
  @scala.inline
  def apply[T](navigationState: typingsSlinky.reactNativeTabView.typesMod.NavigationState[T]): NavigationState[T] = {
    val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationState[T]]
  }
  @scala.inline
  implicit class NavigationStateOps[Self[t] <: NavigationState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNavigationState(value: typingsSlinky.reactNativeTabView.typesMod.NavigationState[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

