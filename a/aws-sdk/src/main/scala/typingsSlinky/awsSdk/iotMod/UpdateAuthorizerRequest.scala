package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAuthorizerRequest extends js.Object {
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  /**
    * The status of the update authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  /**
    * The key used to extract the token from the HTTP headers. 
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  /**
    * The public keys used to verify the token signature.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
}

object UpdateAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): UpdateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthorizerRequest]
  }
  @scala.inline
  implicit class UpdateAuthorizerRequestOps[Self <: UpdateAuthorizerRequest] (val x: Self) extends AnyVal {
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
    def withAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerFunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerFunctionArn")(js.undefined)
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

