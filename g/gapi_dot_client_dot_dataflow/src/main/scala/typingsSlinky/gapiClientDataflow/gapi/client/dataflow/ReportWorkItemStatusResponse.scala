package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportWorkItemStatusResponse extends js.Object {
  /**
    * A set of messages indicating the service-side state for each
    * WorkItem whose status was reported, in the same order as the
    * WorkItemStatus messages in the ReportWorkItemStatusRequest which
    * resulting in this response.
    */
  var workItemServiceStates: js.UndefOr[js.Array[WorkItemServiceState]] = js.native
}

object ReportWorkItemStatusResponse {
  @scala.inline
  def apply(): ReportWorkItemStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportWorkItemStatusResponse]
  }
  @scala.inline
  implicit class ReportWorkItemStatusResponseOps[Self <: ReportWorkItemStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkItemServiceStates(value: js.Array[WorkItemServiceState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemServiceStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkItemServiceStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemServiceStates")(js.undefined)
        ret
    }
  }
  
}

