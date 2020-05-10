package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobResult extends js.Object {
  /**
    * The ID for this job. Amazon S3 generates this ID automatically and returns it after a successful Create Job request.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.JobId] = js.native
}

object CreateJobResult {
  @scala.inline
  def apply(): CreateJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobResult]
  }
  @scala.inline
  implicit class CreateJobResultOps[Self <: CreateJobResult] (val x: Self) extends AnyVal {
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

