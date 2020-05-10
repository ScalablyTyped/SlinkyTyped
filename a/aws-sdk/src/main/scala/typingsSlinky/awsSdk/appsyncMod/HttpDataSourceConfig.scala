package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpDataSourceConfig extends js.Object {
  /**
    * The authorization config in case the HTTP endpoint requires authorization.
    */
  var authorizationConfig: js.UndefOr[AuthorizationConfig] = js.native
  /**
    * The HTTP URL endpoint. You can either specify the domain name or IP, and port combination, and the URL scheme must be HTTP or HTTPS. If the port is not specified, AWS AppSync uses the default port 80 for the HTTP endpoint and port 443 for HTTPS endpoints.
    */
  var endpoint: js.UndefOr[String] = js.native
}

object HttpDataSourceConfig {
  @scala.inline
  def apply(): HttpDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpDataSourceConfig]
  }
  @scala.inline
  implicit class HttpDataSourceConfigOps[Self <: HttpDataSourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationConfig(value: AuthorizationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
  }
  
}

