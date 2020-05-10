package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableServiceRequest extends js.Object {
  /**
    * The identity of consumer resource which service disablement will be
    * applied to.
    *
    * The Google Service Management implementation accepts the following
    * forms:
    * - "project:<project_id>"
    *
    * Note: this is made compatible with
    * google.api.servicecontrol.v1.Operation.consumer_id.
    */
  var consumerId: js.UndefOr[String] = js.native
}

object DisableServiceRequest {
  @scala.inline
  def apply(): DisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableServiceRequest]
  }
  @scala.inline
  implicit class DisableServiceRequestOps[Self <: DisableServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerId")(js.undefined)
        ret
    }
  }
  
}

