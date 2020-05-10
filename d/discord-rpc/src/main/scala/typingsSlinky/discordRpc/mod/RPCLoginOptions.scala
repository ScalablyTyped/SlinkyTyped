package typingsSlinky.discordRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RPCLoginOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var clientId: String = js.native
  var clientSecret: js.UndefOr[String] = js.native
  var rpcToken: js.UndefOr[String] = js.native
  var scopes: js.UndefOr[js.Array[String]] = js.native
  var tokenEndpoint: js.UndefOr[String] = js.native
}

object RPCLoginOptions {
  @scala.inline
  def apply(clientId: String): RPCLoginOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCLoginOptions]
  }
  @scala.inline
  implicit class RPCLoginOptionsOps[Self <: RPCLoginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withRpcToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpcToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRpcToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpcToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenEndpoint")(js.undefined)
        ret
    }
  }
  
}

