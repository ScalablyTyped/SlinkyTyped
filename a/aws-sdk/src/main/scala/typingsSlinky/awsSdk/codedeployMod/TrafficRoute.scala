package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficRoute extends js.Object {
  /**
    *  The ARN of one listener. The listener identifies the route between a target group and a load balancer. This is an array of strings with a maximum size of one. 
    */
  var listenerArns: js.UndefOr[ListenerArnList] = js.native
}

object TrafficRoute {
  @scala.inline
  def apply(): TrafficRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficRoute]
  }
  @scala.inline
  implicit class TrafficRouteOps[Self <: TrafficRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListenerArns(value: ListenerArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListenerArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerArns")(js.undefined)
        ret
    }
  }
  
}

