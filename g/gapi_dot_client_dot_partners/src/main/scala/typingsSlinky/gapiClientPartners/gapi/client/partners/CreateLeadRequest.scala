package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLeadRequest extends js.Object {
  /**
    * The lead resource. The `LeadType` must not be `LEAD_TYPE_UNSPECIFIED`
    * and either `email` or `phone_number` must be provided.
    */
  var lead: js.UndefOr[Lead] = js.native
  /** <a href="https://www.google.com/recaptcha/">reCaptcha</a> challenge info. */
  var recaptchaChallenge: js.UndefOr[RecaptchaChallenge] = js.native
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.native
}

object CreateLeadRequest {
  @scala.inline
  def apply(): CreateLeadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLeadRequest]
  }
  @scala.inline
  implicit class CreateLeadRequestOps[Self <: CreateLeadRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLead(value: Lead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lead")(js.undefined)
        ret
    }
    @scala.inline
    def withRecaptchaChallenge(value: RecaptchaChallenge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaChallenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecaptchaChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaChallenge")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadata(value: RequestMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(js.undefined)
        ret
    }
  }
  
}

