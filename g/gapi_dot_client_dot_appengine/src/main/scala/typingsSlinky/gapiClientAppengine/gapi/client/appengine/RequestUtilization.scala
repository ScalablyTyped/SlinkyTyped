package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestUtilization extends js.Object {
  /** Target number of concurrent requests. */
  var targetConcurrentRequests: js.UndefOr[Double] = js.native
  /** Target requests per second. */
  var targetRequestCountPerSecond: js.UndefOr[Double] = js.native
}

object RequestUtilization {
  @scala.inline
  def apply(): RequestUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestUtilization]
  }
  @scala.inline
  implicit class RequestUtilizationOps[Self <: RequestUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetConcurrentRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetConcurrentRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetConcurrentRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetConcurrentRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRequestCountPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRequestCountPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetRequestCountPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRequestCountPerSecond")(js.undefined)
        ret
    }
  }
  
}

