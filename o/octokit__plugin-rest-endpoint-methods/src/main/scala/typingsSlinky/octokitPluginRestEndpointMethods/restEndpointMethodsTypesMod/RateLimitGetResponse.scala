package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimitGetResponse extends js.Object {
  var rate: RateLimitGetResponseRate = js.native
  var resources: RateLimitGetResponseResources = js.native
}

object RateLimitGetResponse {
  @scala.inline
  def apply(rate: RateLimitGetResponseRate, resources: RateLimitGetResponseResources): RateLimitGetResponse = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitGetResponse]
  }
  @scala.inline
  implicit class RateLimitGetResponseOps[Self <: RateLimitGetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRate(value: RateLimitGetResponseRate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: RateLimitGetResponseResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

