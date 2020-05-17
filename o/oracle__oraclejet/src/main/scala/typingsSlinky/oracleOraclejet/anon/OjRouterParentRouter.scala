package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OjRouterParentRouter extends js.Object {
  var ojRouter: ParentRouter = js.native
}

object OjRouterParentRouter {
  @scala.inline
  def apply(ojRouter: ParentRouter): OjRouterParentRouter = {
    val __obj = js.Dynamic.literal(ojRouter = ojRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OjRouterParentRouter]
  }
  @scala.inline
  implicit class OjRouterParentRouterOps[Self <: OjRouterParentRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOjRouter(value: ParentRouter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojRouter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

