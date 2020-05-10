package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRouteAction extends js.Object {
  /**
    * An object that represents the targets that traffic is routed to when a request matches the route.
    */
  var weightedTargets: WeightedTargets = js.native
}

object HttpRouteAction {
  @scala.inline
  def apply(weightedTargets: WeightedTargets): HttpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRouteAction]
  }
  @scala.inline
  implicit class HttpRouteActionOps[Self <: HttpRouteAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWeightedTargets(value: WeightedTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedTargets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

