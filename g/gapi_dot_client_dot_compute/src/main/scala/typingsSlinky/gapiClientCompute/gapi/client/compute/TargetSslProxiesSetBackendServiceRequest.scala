package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetSslProxiesSetBackendServiceRequest extends js.Object {
  /** The URL of the new BackendService resource for the targetSslProxy. */
  var service: js.UndefOr[String] = js.native
}

object TargetSslProxiesSetBackendServiceRequest {
  @scala.inline
  def apply(): TargetSslProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSslProxiesSetBackendServiceRequest]
  }
  @scala.inline
  implicit class TargetSslProxiesSetBackendServiceRequestOps[Self <: TargetSslProxiesSetBackendServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

