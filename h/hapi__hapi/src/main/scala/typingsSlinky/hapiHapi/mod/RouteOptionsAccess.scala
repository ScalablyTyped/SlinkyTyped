package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiHapi.hapiHapiBooleans.`false`
import typingsSlinky.hapiHapi.hapiHapiStrings.optional
import typingsSlinky.hapiHapi.hapiHapiStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsAccess extends js.Object {
  /**
    * @default none.
    * An object or array of objects specifying the route access rules. Each rule is evaluated against an incoming request and access is granted if at least one of the rules matches. Each rule object
    * must include at least one of scope or entity.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccess)
    */
  var access: js.UndefOr[RouteOptionsAccessObject | js.Array[RouteOptionsAccessObject]] = js.native
  /**
    * @default 'any'.
    * The required authenticated entity type. If set, must match the entity value of the request authenticated credentials. Available values:
    * * 'any' - the authentication can be on behalf of a user or application.
    * * 'user' - the authentication must be on behalf of a user which is identified by the presence of a 'user' attribute in the credentials object returned by the authentication strategy.
    * * 'app' - the authentication must be on behalf of an application which is identified by the lack of presence of a user attribute in the credentials object returned by the authentication
    * strategy.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessentity)
    */
  var entity: js.UndefOr[AccessEntity] = js.native
  /**
    * @default 'required'.
    * The authentication mode. Available values:
    * * 'required' - authentication is required.
    * * 'optional' - authentication is optional - the request must include valid credentials or no credentials at all.
    * * 'try' - similar to 'optional', any request credentials are attempted authentication, but if the credentials are invalid, the request proceeds regardless of the authentication error.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthmode)
    */
  var mode: js.UndefOr[AuthMode] = js.native
  /**
    * @default false, unless the scheme requires payload authentication.
    * If set, the incoming request payload is authenticated after it is processed. Requires a strategy with payload authentication support (e.g. Hawk). Cannot be set to a value other than 'required'
    * when the scheme sets the authentication options.payload to true. Available values:
    * * false - no payload authentication.
    * * 'required' - payload authentication required.
    * * 'optional' - payload authentication performed only when the client includes payload authentication information (e.g. hash attribute in Hawk).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthpayload)
    */
  var payload: js.UndefOr[`false` | required | optional] = js.native
  /**
    * @default false (no scope requirements).
    * The application scope required to access the route. Value can be a scope string or an array of scope strings. When authenticated, the credentials object scope property must contain at least
    * one of the scopes defined to access the route. If a scope string begins with a + character, that scope is required. If a scope string begins with a ! character, that scope is forbidden. For
    * example, the scope ['!a', '+b', 'c', 'd'] means the incoming request credentials' scope must not include 'a', must include 'b', and must include one of 'c' or 'd'. You may also access
    * properties on the request object (query, params, payload, and credentials) to populate a dynamic scope by using the '{' and '}' characters around the property name, such as 'user-{params.id}'.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessscope)
    */
  var scope: js.UndefOr[RouteOptionsAccessScope] = js.native
  /**
    * @default the default strategy set via server.auth.default().
    * An array of string strategy names in the order they should be attempted. Cannot be used together with strategy.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthstrategies)
    */
  var strategies: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default the default strategy set via server.auth.default().
    * A string strategy names. Cannot be used together with strategies.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthstrategy)
    */
  var strategy: js.UndefOr[String] = js.native
}

object RouteOptionsAccess {
  @scala.inline
  def apply(): RouteOptionsAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptionsAccess]
  }
  @scala.inline
  implicit class RouteOptionsAccessOps[Self <: RouteOptionsAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: RouteOptionsAccessObject | js.Array[RouteOptionsAccessObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity(value: AccessEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: AuthMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: `false` | required | optional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: RouteOptionsAccessScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategies")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
  }
  
}

