package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectActionConfig extends js.Object {
  /**
    * The hostname. This component is not percent-encoded. The hostname can contain #{host}.
    */
  var Host: js.UndefOr[RedirectActionHost] = js.native
  /**
    * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
    */
  var Path: js.UndefOr[RedirectActionPath] = js.native
  /**
    * The port. You can specify a value from 1 to 65535 or #{port}.
    */
  var Port: js.UndefOr[RedirectActionPort] = js.native
  /**
    * The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
    */
  var Protocol: js.UndefOr[RedirectActionProtocol] = js.native
  /**
    * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?", as it is automatically added. You can specify any of the reserved keywords.
    */
  var Query: js.UndefOr[RedirectActionQuery] = js.native
  /**
    * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
    */
  var StatusCode: RedirectActionStatusCodeEnum = js.native
}

object RedirectActionConfig {
  @scala.inline
  def apply(StatusCode: RedirectActionStatusCodeEnum): RedirectActionConfig = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectActionConfig]
  }
  @scala.inline
  implicit class RedirectActionConfigOps[Self <: RedirectActionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusCode(value: RedirectActionStatusCodeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: RedirectActionHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: RedirectActionPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: RedirectActionPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: RedirectActionProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: RedirectActionQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(js.undefined)
        ret
    }
  }
  
}

