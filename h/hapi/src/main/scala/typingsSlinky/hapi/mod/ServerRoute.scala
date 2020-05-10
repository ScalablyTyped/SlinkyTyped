package typingsSlinky.hapi.mod

import typingsSlinky.hapi.mod.Lifecycle.Method
import typingsSlinky.hapi.mod.Lifecycle.ReturnValue
import typingsSlinky.hapi.mod.Util.HTTP_METHODS_PARTIAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRoute extends js.Object {
  /**
    * (required when handler is not set) the route handler function called to generate the response after successful authentication and validation.
    */
  var handler: js.UndefOr[Method | HandlerDecorations] = js.native
  /**
    * (required) the HTTP method. Typically one of 'GET', 'POST', 'PUT', 'PATCH', 'DELETE', or 'OPTIONS'. Any HTTP method is allowed, except for 'HEAD'. Use '*' to match against any HTTP method
    * (only when an exact match was not found, and any match with a specific method will be given a higher priority over a wildcard match). Can be assigned an array of methods which has the same
    * result as adding the same route with different methods manually.
    */
  var method: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String = js.native
  /**
    * additional route options. The options value can be an object or a function that returns an object using the signature function(server) where server is the server the route is being added to
    * and this is bound to the current realm's bind option.
    */
  var options: js.UndefOr[RouteOptions | (js.Function1[/* server */ Server, RouteOptions])] = js.native
  /**
    * (required) the absolute path used to match incoming requests (must begin with '/'). Incoming requests are compared to the configured paths based on the server's router configuration. The path
    * can include named parameters enclosed in {} which will be matched against literal values in the request as described in Path parameters. For context [See
    * docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverrouteroute) For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#path-parameters)
    */
  var path: String = js.native
  /**
    * route custom rules object. The object is passed to each rules processor registered with server.rules(). Cannot be used if route.options.rules is defined.
    */
  var rules: js.UndefOr[js.Object] = js.native
  /**
    * (optional) a domain string or an array of domain strings for limiting the route to only requests with a matching host header field. Matching is done against the hostname part of the header
    * only (excluding the port). Defaults to all hosts.
    */
  var vhost: js.UndefOr[String | js.Array[String]] = js.native
}

object ServerRoute {
  @scala.inline
  def apply(method: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String, path: String): ServerRoute = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRoute]
  }
  @scala.inline
  implicit class ServerRouteOps[Self <: ServerRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandlerFunction3(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[js.Error]) => ReturnValue
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHandler(value: Method | HandlerDecorations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsFunction1(value: /* server */ Server => RouteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: RouteOptions | (js.Function1[/* server */ Server, RouteOptions])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withVhost(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(js.undefined)
        ret
    }
  }
  
}

