package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopEntitiesDetectionV2JobResponse extends js.Object {
  /**
    * The identifier of the medical entities detection job that was stopped.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.JobId] = js.native
}

object StopEntitiesDetectionV2JobResponse {
  @scala.inline
  def apply(): StopEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopEntitiesDetectionV2JobResponse]
  }
  @scala.inline
  implicit class StopEntitiesDetectionV2JobResponseOps[Self <: StopEntitiesDetectionV2JobResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
  }
  
}

