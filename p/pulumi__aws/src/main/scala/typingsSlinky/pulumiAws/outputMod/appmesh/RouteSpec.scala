package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpec extends js.Object {
  /**
    * The HTTP routing information for the route.
    */
  var httpRoute: js.UndefOr[RouteSpecHttpRoute] = js.native
  /**
    * The priority for the route, between `0` and `1000`.
    * Routes are matched based on the specified value, where `0` is the highest priority.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * The TCP routing information for the route.
    */
  var tcpRoute: js.UndefOr[RouteSpecTcpRoute] = js.native
}

object RouteSpec {
  @scala.inline
  def apply(): RouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpec]
  }
  @scala.inline
  implicit class RouteSpecOps[Self <: RouteSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpRoute(value: RouteSpecHttpRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpRoute(value: RouteSpecTcpRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpRoute")(js.undefined)
        ret
    }
  }
  
}

