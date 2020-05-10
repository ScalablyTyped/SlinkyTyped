package typingsSlinky.expressRateLimit.mod._Global_.Express

import typingsSlinky.expressRateLimit.mod.RateLimitInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * property is added to all requests with the limit, current,
    * and remaining number of requests and, if the store provides it, a resetTime Date object.
    * These may be used in your application code to take additional actions or inform the user of their status
    */
  var rateLimit: RateLimitInfo = js.native
}

object Request {
  @scala.inline
  def apply(rateLimit: RateLimitInfo): Request = {
    val __obj = js.Dynamic.literal(rateLimit = rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRateLimit(value: RateLimitInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

