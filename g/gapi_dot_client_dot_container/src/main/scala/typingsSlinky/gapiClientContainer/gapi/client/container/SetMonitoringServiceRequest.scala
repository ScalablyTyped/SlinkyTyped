package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetMonitoringServiceRequest extends js.Object {
  /**
    * The monitoring service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; "monitoring.googleapis.com" - the Google Cloud Monitoring service
    * &#42; "none" - no metrics will be exported from the cluster
    */
  var monitoringService: js.UndefOr[String] = js.native
}

object SetMonitoringServiceRequest {
  @scala.inline
  def apply(): SetMonitoringServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetMonitoringServiceRequest]
  }
  @scala.inline
  implicit class SetMonitoringServiceRequestOps[Self <: SetMonitoringServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitoringService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoringService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoringService")(js.undefined)
        ret
    }
  }
  
}

