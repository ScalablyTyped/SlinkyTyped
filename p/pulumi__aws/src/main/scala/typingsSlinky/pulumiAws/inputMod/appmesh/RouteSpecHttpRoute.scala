package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: Input[RouteSpecHttpRouteAction] = js.native
  /**
    * The method and value to match the header value sent with a request. Specify one match method.
    */
  var `match`: Input[RouteSpecHttpRouteMatch] = js.native
}

object RouteSpecHttpRoute {
  @scala.inline
  def apply(action: Input[RouteSpecHttpRouteAction], `match`: Input[RouteSpecHttpRouteMatch]): RouteSpecHttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRoute]
  }
  @scala.inline
  implicit class RouteSpecHttpRouteOps[Self <: RouteSpecHttpRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Input[RouteSpecHttpRouteAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: Input[RouteSpecHttpRouteMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

