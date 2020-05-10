package typingsSlinky.httperr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration object for constructing HttpErrors. */
@js.native
trait Config extends js.Object {
  /**
    *  The methods allowed for this URL.
    *  This property is only available for 405 Method Not Allowed errors
    *  and can be used to populate the Allow header.
    */
  var allowed: js.UndefOr[js.Array[String]] = js.native
  /** The underlying exception that caused the HTTP error. */
  var cause: js.UndefOr[js.Error] = js.native
  /** A detailed human-readable description of the error's cause and possible solutions. */
  var details: js.UndefOr[String] = js.native
  /**
    *  The location for which the request should be repeated.
    *  This property is only available for 451 Redirect (Microsoft) errors and can be
    *  used to populate the proprietary X-MS-Location response header.
    */
  var location: js.UndefOr[js.Any] = js.native
  /** A descriptive human-readable title describing the error's cause. */
  var message: js.UndefOr[String] = js.native
  /**
    *  The parameters with which the request should be retried.
    *  This property is only available for 449 Retry With (Microsoft) errors and can be
    *  used to populate the response status message.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  /**
    *  The minimum delay before the request should be attempted again.
    *  This property is only available for 429 Too Many Requests and 420 Enhance Your Calm
    *  (Twitter API) errors and can be used to populate the Retry-After header.
    */
  var retryAfter: js.UndefOr[js.Any] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(js.undefined)
        ret
    }
    @scala.inline
    def withCause(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryAfter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAfter")(js.undefined)
        ret
    }
  }
  
}

