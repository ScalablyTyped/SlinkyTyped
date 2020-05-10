package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationResultType extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The expiration period of the authentication result in seconds.
    */
  var ExpiresIn: js.UndefOr[IntegerType] = js.native
  /**
    * The ID token.
    */
  var IdToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The new device metadata from an authentication result.
    */
  var NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType] = js.native
  /**
    * The refresh token.
    */
  var RefreshToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The token type.
    */
  var TokenType: js.UndefOr[StringType] = js.native
}

object AuthenticationResultType {
  @scala.inline
  def apply(): AuthenticationResultType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationResultType]
  }
  @scala.inline
  implicit class AuthenticationResultTypeOps[Self <: AuthenticationResultType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: TokenModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresIn(value: IntegerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiresIn")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: TokenModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNewDeviceMetadata(value: NewDeviceMetadataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewDeviceMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewDeviceMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewDeviceMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshToken(value: TokenModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenType(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenType")(js.undefined)
        ret
    }
  }
  
}

