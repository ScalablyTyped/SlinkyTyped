package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTcpProxiesSetBackendServiceRequest extends js.Object {
  /** The URL of the new BackendService resource for the targetTcpProxy. */
  var service: js.UndefOr[String] = js.native
}

object TargetTcpProxiesSetBackendServiceRequest {
  @scala.inline
  def apply(): TargetTcpProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetTcpProxiesSetBackendServiceRequest]
  }
  @scala.inline
  implicit class TargetTcpProxiesSetBackendServiceRequestOps[Self <: TargetTcpProxiesSetBackendServiceRequest] (val x: Self) extends AnyVal {
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

