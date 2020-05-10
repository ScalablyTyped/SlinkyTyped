package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSoftwareUpdatesRequest extends js.Object {
  /**
    * The ID for a job that you want to get the software update file for, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typingsSlinky.awsSdk.snowballMod.JobId = js.native
}

object GetSoftwareUpdatesRequest {
  @scala.inline
  def apply(JobId: JobId): GetSoftwareUpdatesRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSoftwareUpdatesRequest]
  }
  @scala.inline
  implicit class GetSoftwareUpdatesRequestOps[Self <: GetSoftwareUpdatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

