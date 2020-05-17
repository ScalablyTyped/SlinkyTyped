package typingsSlinky.reduxLittleRouter.mod

import typingsSlinky.reduxLittleRouter.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressRouterArgs extends js.Object {
  var request: BaseUrl = js.native
  var routes: Routes = js.native
}

object ExpressRouterArgs {
  @scala.inline
  def apply(request: BaseUrl, routes: Routes): ExpressRouterArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressRouterArgs]
  }
  @scala.inline
  implicit class ExpressRouterArgsOps[Self <: ExpressRouterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: BaseUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: Routes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

