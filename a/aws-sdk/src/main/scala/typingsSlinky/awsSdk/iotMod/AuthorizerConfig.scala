package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerConfig extends js.Object {
  /**
    * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
    */
  var allowAuthorizerOverride: js.UndefOr[AllowAuthorizerOverride] = js.native
  /**
    * The name of the authorization service for a domain configuration.
    */
  var defaultAuthorizerName: js.UndefOr[AuthorizerName] = js.native
}

object AuthorizerConfig {
  @scala.inline
  def apply(): AuthorizerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerConfig]
  }
  @scala.inline
  implicit class AuthorizerConfigOps[Self <: AuthorizerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAuthorizerOverride(value: AllowAuthorizerOverride): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAuthorizerOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAuthorizerOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAuthorizerOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAuthorizerName(value: AuthorizerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAuthorizerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAuthorizerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAuthorizerName")(js.undefined)
        ret
    }
  }
  
}

