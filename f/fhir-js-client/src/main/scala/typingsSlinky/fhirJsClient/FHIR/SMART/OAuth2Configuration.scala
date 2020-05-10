package typingsSlinky.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OAuth2 Configuration of the SMART on FHIR Server
  */
@js.native
trait OAuth2Configuration extends js.Object {
  /**
    * Client or application specific settings provided on the FHIR server during the client/application registration.
    */
  var client: js.UndefOr[OAuth2ClientSettings] = js.native
  /**
    * Fake Access Token Response. Should contain the patient property to set the patient context.
    */
  var fake_token_response: js.UndefOr[js.Any] = js.native
  /**
    * OAuth2 Provider information. If provided during the Authorize call, the library skips the conformance statement introspection
    */
  var provider: js.UndefOr[OAuth2Provider] = js.native
  /**
    * Set the response type based on the Authorization Grant eg. code(Authorization Code Grant), token(Implicit Grant)
    */
  var response_type: js.UndefOr[String] = js.native
  /**
    * FHIR Service URL
    */
  var server: js.UndefOr[String] = js.native
}

object OAuth2Configuration {
  @scala.inline
  def apply(): OAuth2Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2Configuration]
  }
  @scala.inline
  implicit class OAuth2ConfigurationOps[Self <: OAuth2Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: OAuth2ClientSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withFake_token_response(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fake_token_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFake_token_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fake_token_response")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: OAuth2Provider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
  }
  
}

