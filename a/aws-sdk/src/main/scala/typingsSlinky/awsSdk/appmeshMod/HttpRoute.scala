package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRoute extends js.Object {
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: HttpRouteAction = js.native
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: HttpRouteMatch = js.native
  /**
    * An object that represents a retry policy.
    */
  var retryPolicy: js.UndefOr[HttpRetryPolicy] = js.native
}

object HttpRoute {
  @scala.inline
  def apply(action: HttpRouteAction, `match`: HttpRouteMatch): HttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRoute]
  }
  @scala.inline
  implicit class HttpRouteOps[Self <: HttpRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: HttpRouteAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: HttpRouteMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryPolicy(value: HttpRetryPolicy): Self = {
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

