package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeAuthorizerRequest extends js.Object {
  /**
    * The custom authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  /**
    * Specifies a test HTTP authorization request.
    */
  var httpContext: js.UndefOr[HttpContext] = js.native
  /**
    * Specifies a test MQTT authorization request.
    */
  var mqttContext: js.UndefOr[MqttContext] = js.native
  /**
    * Specifies a test TLS authorization request.
    */
  var tlsContext: js.UndefOr[TlsContext] = js.native
  /**
    * The token returned by your custom authentication service.
    */
  var token: js.UndefOr[Token] = js.native
  /**
    * The signature made with the token and your custom authentication service's private key.
    */
  var tokenSignature: js.UndefOr[TokenSignature] = js.native
}

object TestInvokeAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
  @scala.inline
  implicit class TestInvokeAuthorizerRequestOps[Self <: TestInvokeAuthorizerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizerName(value: AuthorizerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpContext(value: HttpContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpContext")(js.undefined)
        ret
    }
    @scala.inline
    def withMqttContext(value: MqttContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mqttContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMqttContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mqttContext")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsContext(value: TlsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsContext")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenSignature(value: TokenSignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSignature")(js.undefined)
        ret
    }
  }
  
}

