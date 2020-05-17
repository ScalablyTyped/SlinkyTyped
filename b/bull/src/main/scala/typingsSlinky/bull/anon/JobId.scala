package typingsSlinky.bull.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobId extends js.Object {
  var jobId: js.UndefOr[typingsSlinky.bull.mod.JobId] = js.native
}

object JobId {
  @scala.inline
  def apply(): JobId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobId]
  }
  @scala.inline
  implicit class JobIdOps[Self <: JobId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: typingsSlinky.bull.mod.JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
        ret
    }
  }
  
}

