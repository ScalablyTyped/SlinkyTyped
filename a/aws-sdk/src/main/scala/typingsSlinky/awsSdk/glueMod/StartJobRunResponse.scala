package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartJobRunResponse extends js.Object {
  /**
    * The ID assigned to this job run.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}

object StartJobRunResponse {
  @scala.inline
  def apply(): StartJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartJobRunResponse]
  }
  @scala.inline
  implicit class StartJobRunResponseOps[Self <: StartJobRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobRunId(value: IdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobRunId")(js.undefined)
        ret
    }
  }
  
}

