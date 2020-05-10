package typingsSlinky.reactRouterNavigationCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationState[OwnRoute] extends js.Object {
  var index: Double = js.native
  var routes: js.Array[Route[js.Object] with OwnRoute] = js.native
}

object NavigationState {
  @scala.inline
  def apply[OwnRoute](index: Double, routes: js.Array[Route[js.Object] with OwnRoute]): NavigationState[OwnRoute] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationState[OwnRoute]]
  }
  @scala.inline
  implicit class NavigationStateOps[Self[ownroute] <: NavigationState[ownroute], OwnRoute] (val x: Self[OwnRoute]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OwnRoute] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OwnRoute]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OwnRoute] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OwnRoute] with Other]
    @scala.inline
    def withIndex(value: Double): Self[OwnRoute] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[Route[js.Object] with OwnRoute]): Self[OwnRoute] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

