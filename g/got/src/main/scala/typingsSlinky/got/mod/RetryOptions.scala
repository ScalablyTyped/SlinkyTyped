package typingsSlinky.got.mod

import typingsSlinky.got.gotNumbers.`408`
import typingsSlinky.got.gotNumbers.`413`
import typingsSlinky.got.gotNumbers.`429`
import typingsSlinky.got.gotNumbers.`500`
import typingsSlinky.got.gotNumbers.`502`
import typingsSlinky.got.gotNumbers.`503`
import typingsSlinky.got.gotNumbers.`504`
import typingsSlinky.got.gotStrings.DELETE
import typingsSlinky.got.gotStrings.GET
import typingsSlinky.got.gotStrings.HEAD
import typingsSlinky.got.gotStrings.OPTIONS
import typingsSlinky.got.gotStrings.POST
import typingsSlinky.got.gotStrings.PUT
import typingsSlinky.got.gotStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOptions extends js.Object {
  /**
    * Allowed error codes.
    */
  var errorCodes: js.UndefOr[js.Array[String]] = js.native
  var maxRetryAfter: js.UndefOr[Double] = js.native
  var methods: js.UndefOr[js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE]] = js.native
  var retries: js.UndefOr[Double | RetryFunction] = js.native
  var statusCodes: js.UndefOr[js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`]] = js.native
}

object RetryOptions {
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetryAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetryAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetryAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetryAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withRetriesFunction2(value: (/* retry */ Double, /* error */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRetries(value: Double | RetryFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCodes(value: js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(js.undefined)
        ret
    }
  }
  
}

