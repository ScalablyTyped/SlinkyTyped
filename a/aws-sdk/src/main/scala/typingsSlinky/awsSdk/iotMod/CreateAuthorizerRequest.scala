package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAuthorizerRequest extends js.Object {
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: AuthorizerFunctionArn = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  /**
    * Specifies whether AWS IoT validates the token signature in an authorization request.
    */
  var signingDisabled: js.UndefOr[BooleanKey] = js.native
  /**
    * The status of the create authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  /**
    * The name of the token key used to extract the token from the HTTP headers.
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  /**
    * The public keys used to verify the digital signature returned by your custom authentication service.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
}

object CreateAuthorizerRequest {
  @scala.inline
  def apply(authorizerFunctionArn: AuthorizerFunctionArn, authorizerName: AuthorizerName): CreateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerFunctionArn = authorizerFunctionArn.asInstanceOf[js.Any], authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthorizerRequest]
  }
  @scala.inline
  implicit class CreateAuthorizerRequestOps[Self <: CreateAuthorizerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerFunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizerName(value: AuthorizerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningDisabled(value: BooleanKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AuthorizerStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenKeyName(value: TokenKeyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenSigningPublicKeys(value: PublicKeyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSigningPublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenSigningPublicKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSigningPublicKeys")(js.undefined)
        ret
    }
  }
  
}

