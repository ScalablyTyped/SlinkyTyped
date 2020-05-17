package typingsSlinky.airtable.mod.global.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AirtableOptions extends js.Object {
  var allowUnauthorizedSsl: js.UndefOr[Boolean] = js.native
  var apiKey: js.UndefOr[String] = js.native
  var apiVersion: js.UndefOr[String] = js.native
  var endpointUrl: js.UndefOr[String] = js.native
  var noRetryIfRateLimited: js.UndefOr[Boolean] = js.native
  var requestTimeout: js.UndefOr[Double] = js.native
}

object AirtableOptions {
  @scala.inline
  def apply(): AirtableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AirtableOptions]
  }
  @scala.inline
  implicit class AirtableOptionsOps[Self <: AirtableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUnauthorizedSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnauthorizedSsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnauthorizedSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnauthorizedSsl")(js.undefined)
        ret
    }
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRetryIfRateLimited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRetryIfRateLimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRetryIfRateLimited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRetryIfRateLimited")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(js.undefined)
        ret
    }
  }
  
}

