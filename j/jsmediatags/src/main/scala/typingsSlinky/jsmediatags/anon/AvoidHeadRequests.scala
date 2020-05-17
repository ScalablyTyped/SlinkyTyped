package typingsSlinky.jsmediatags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvoidHeadRequests extends js.Object {
  var avoidHeadRequests: Boolean = js.native
  var disallowedXhrHeaders: js.Array[String] = js.native
  var timeoutInSec: Double = js.native
}

object AvoidHeadRequests {
  @scala.inline
  def apply(avoidHeadRequests: Boolean, disallowedXhrHeaders: js.Array[String], timeoutInSec: Double): AvoidHeadRequests = {
    val __obj = js.Dynamic.literal(avoidHeadRequests = avoidHeadRequests.asInstanceOf[js.Any], disallowedXhrHeaders = disallowedXhrHeaders.asInstanceOf[js.Any], timeoutInSec = timeoutInSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvoidHeadRequests]
  }
  @scala.inline
  implicit class AvoidHeadRequestsOps[Self <: AvoidHeadRequests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidHeadRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidHeadRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallowedXhrHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowedXhrHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutInSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

