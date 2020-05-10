package typingsSlinky.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The OAuth2 endpoints (Registration URI, Authorize URI, Token URI)
  */
@js.native
trait OAuth2Endpoints extends js.Object {
  /**
    * OAuth2 Authorize URI
    */
  var authorize_uri: js.UndefOr[String] = js.native
  /**
    * OAuth2 Registration URI
    */
  var registration_uri: js.UndefOr[String] = js.native
  /**
    * OAuth2 Token URI
    */
  var token_uri: js.UndefOr[String] = js.native
}

object OAuth2Endpoints {
  @scala.inline
  def apply(): OAuth2Endpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2Endpoints]
  }
  @scala.inline
  implicit class OAuth2EndpointsOps[Self <: OAuth2Endpoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorize_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorize_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorize_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorize_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistration_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registration_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistration_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registration_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_uri")(js.undefined)
        ret
    }
  }
  
}

