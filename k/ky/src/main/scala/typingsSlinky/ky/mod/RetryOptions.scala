package typingsSlinky.ky.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOptions extends js.Object {
  /**
  	The HTTP status codes allowed to retry with a `Retry-After` header.
  	@default [413, 429, 503]
  	*/
  var afterStatusCodes: js.UndefOr[js.Array[Double]] = js.native
  /**
  	The number of times to retry failed requests.
  	@default 2
  	*/
  var limit: js.UndefOr[Double] = js.native
  /**
  	If the `Retry-After` header is greater than `maxRetryAfter`, the request will be canceled.
  	@default Infinity
  	*/
  var maxRetryAfter: js.UndefOr[Double] = js.native
  /**
  	The HTTP methods allowed to retry.
  	@default ['get', 'put', 'head', 'delete', 'options', 'trace']
  	*/
  var methods: js.UndefOr[js.Array[String]] = js.native
  /**
  	The HTTP status codes allowed to retry.
  	@default [408, 413, 429, 500, 502, 503, 504]
  	*/
  var statusCodes: js.UndefOr[js.Array[Double]] = js.native
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
    def withAfterStatusCodes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterStatusCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterStatusCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterStatusCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
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
    def withMethods(value: js.Array[String]): Self = {
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
    def withStatusCodes(value: js.Array[Double]): Self = {
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

