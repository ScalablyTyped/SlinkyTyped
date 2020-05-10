package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRouteMatch extends js.Object {
  /**
    * An object that represents the client request headers to match on.
    */
  var headers: js.UndefOr[HttpRouteHeaders] = js.native
  /**
    * The client request method to match on. Specify only one.
    */
  var method: js.UndefOr[HttpMethod] = js.native
  /**
    * Specifies the path to match requests with. This parameter must always start with
    /, which by itself matches all requests to the virtual service name. You
    can also match for path-based routing of requests. For example, if your virtual service
    name is my-service.local and you want the route to match requests to
    my-service.local/metrics, your prefix should be
    /metrics.
    */
  var prefix: String = js.native
  /**
    * The client request scheme to match on. Specify only one.
    */
  var scheme: js.UndefOr[HttpScheme] = js.native
}

object HttpRouteMatch {
  @scala.inline
  def apply(prefix: String): HttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRouteMatch]
  }
  @scala.inline
  implicit class HttpRouteMatchOps[Self <: HttpRouteMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: HttpRouteHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: HttpScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
  }
  
}

