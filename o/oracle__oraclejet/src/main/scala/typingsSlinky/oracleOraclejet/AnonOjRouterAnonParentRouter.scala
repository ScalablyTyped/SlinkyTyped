package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOjRouterAnonParentRouter extends js.Object {
  var ojRouter: AnonParentRouter = js.native
}

object AnonOjRouterAnonParentRouter {
  @scala.inline
  def apply(ojRouter: AnonParentRouter): AnonOjRouterAnonParentRouter = {
    val __obj = js.Dynamic.literal(ojRouter = ojRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOjRouterAnonParentRouter]
  }
  @scala.inline
  implicit class AnonOjRouterAnonParentRouterOps[Self <: AnonOjRouterAnonParentRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOjRouter(value: AnonParentRouter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojRouter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

