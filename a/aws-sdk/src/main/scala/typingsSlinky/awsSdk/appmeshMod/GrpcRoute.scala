package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcRoute extends js.Object {
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: GrpcRouteAction = js.native
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: GrpcRouteMatch = js.native
  /**
    * An object that represents a retry policy.
    */
  var retryPolicy: js.UndefOr[GrpcRetryPolicy] = js.native
}

object GrpcRoute {
  @scala.inline
  def apply(action: GrpcRouteAction, `match`: GrpcRouteMatch): GrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRoute]
  }
  @scala.inline
  implicit class GrpcRouteOps[Self <: GrpcRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: GrpcRouteAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: GrpcRouteMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryPolicy(value: GrpcRetryPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryPolicy")(js.undefined)
        ret
    }
  }
  
}

