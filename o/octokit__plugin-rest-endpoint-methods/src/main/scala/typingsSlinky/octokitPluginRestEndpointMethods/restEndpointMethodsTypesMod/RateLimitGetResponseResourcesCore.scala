package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimitGetResponseResourcesCore extends js.Object {
  var limit: Double = js.native
  var remaining: Double = js.native
  var reset: Double = js.native
}

object RateLimitGetResponseResourcesCore {
  @scala.inline
  def apply(limit: Double, remaining: Double, reset: Double): RateLimitGetResponseResourcesCore = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitGetResponseResourcesCore]
  }
  @scala.inline
  implicit class RateLimitGetResponseResourcesCoreOps[Self <: RateLimitGetResponseResourcesCore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

