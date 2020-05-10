package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpec extends js.Object {
  /**
    * An object that represents the specification of a gRPC route.
    */
  var grpcRoute: js.UndefOr[GrpcRoute] = js.native
  /**
    * An object that represents the specification of an HTTP/2 route.
    */
  var http2Route: js.UndefOr[HttpRoute] = js.native
  /**
    * An object that represents the specification of an HTTP route.
    */
  var httpRoute: js.UndefOr[HttpRoute] = js.native
  /**
    * The priority for the route. Routes are matched based on the specified value, where 0 is
    the highest priority.
    */
  var priority: js.UndefOr[RoutePriority] = js.native
  /**
    * An object that represents the specification of a TCP route.
    */
  var tcpRoute: js.UndefOr[TcpRoute] = js.native
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
    def withGrpcRoute(value: GrpcRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpcRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpcRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpcRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp2Route(value: HttpRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http2Route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp2Route: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http2Route")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpRoute(value: HttpRoute): Self = {
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
    def withPriority(value: RoutePriority): Self = {
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
    def withTcpRoute(value: TcpRoute): Self = {
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

