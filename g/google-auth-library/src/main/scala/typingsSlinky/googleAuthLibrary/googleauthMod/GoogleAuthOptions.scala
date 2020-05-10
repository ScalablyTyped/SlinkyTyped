package typingsSlinky.googleAuthLibrary.googleauthMod

import typingsSlinky.googleAuthLibrary.credentialsMod.CredentialBody
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typingsSlinky.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleAuthOptions extends js.Object {
  /**
    * Options object passed to the constructor of the client
    */
  var clientOptions: js.UndefOr[JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions] = js.native
  /**
    * Object containing client_email and private_key properties
    */
  var credentials: js.UndefOr[CredentialBody] = js.native
  /**
    * Path to a .json, .pem, or .p12 key file
    */
  var keyFile: js.UndefOr[String] = js.native
  /**
    * Path to a .json, .pem, or .p12 key file
    */
  var keyFilename: js.UndefOr[String] = js.native
  /**
    * Your project ID.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required scopes for the desired API request
    */
  var scopes: js.UndefOr[String | js.Array[String]] = js.native
}

object GoogleAuthOptions {
  @scala.inline
  def apply(): GoogleAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAuthOptions]
  }
  @scala.inline
  implicit class GoogleAuthOptionsOps[Self <: GoogleAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientOptions(value: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: CredentialBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFile")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: String | js.Array[String]): Self = {
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
  }
  
}

