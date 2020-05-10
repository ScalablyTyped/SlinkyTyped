package typingsSlinky.router5.routerMod

import typingsSlinky.router5.baseMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeState extends js.Object {
  var previousRoute: State = js.native
  var route: State = js.native
}

object SubscribeState {
  @scala.inline
  def apply(previousRoute: State, route: State): SubscribeState = {
    val __obj = js.Dynamic.literal(previousRoute = previousRoute.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeState]
  }
  @scala.inline
  implicit class SubscribeStateOps[Self <: SubscribeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviousRoute(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoute(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

