package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerDescription extends js.Object {
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.native
  /**
    * The authorizer's Lambda function ARN.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.native
  /**
    * The UNIX timestamp of when the authorizer was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The UNIX timestamp of when the authorizer was last updated.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * Specifies whether AWS IoT validates the token signature in an authorization request.
    */
  var signingDisabled: js.UndefOr[BooleanKey] = js.native
  /**
    * The status of the authorizer.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  /**
    * The key used to extract the token from the HTTP headers.
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  /**
    * The public keys used to validate the token signature returned by your custom authentication service.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
}

object AuthorizerDescription {
  @scala.inline
  def apply(): AuthorizerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerDescription]
  }
  @scala.inline
  implicit class AuthorizerDescriptionOps[Self <: AuthorizerDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizerArn(value: AuthorizerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerArn")(js.undefined)
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
    def withAuthorizerName(value: AuthorizerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
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

