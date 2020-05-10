package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLeadResponse extends js.Object {
  /**
    * Lead that was created depending on the outcome of
    * <a href="https://www.google.com/recaptcha/">reCaptcha</a> validation.
    */
  var lead: js.UndefOr[Lead] = js.native
  /**
    * The outcome of <a href="https://www.google.com/recaptcha/">reCaptcha</a>
    * validation.
    */
  var recaptchaStatus: js.UndefOr[String] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
}

object CreateLeadResponse {
  @scala.inline
  def apply(): CreateLeadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLeadResponse]
  }
  @scala.inline
  implicit class CreateLeadResponseOps[Self <: CreateLeadResponse] (val x: Self) extends AnyVal {
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
    def withRecaptchaStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecaptchaStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseMetadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMetadata")(js.undefined)
        ret
    }
  }
  
}

