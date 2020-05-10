package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobResponse extends js.Object {
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.native
  /**
    * Information about the job.
    */
  var job: js.UndefOr[Job] = js.native
}

object DescribeJobResponse {
  @scala.inline
  def apply(): DescribeJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobResponse]
  }
  @scala.inline
  implicit class DescribeJobResponseOps[Self <: DescribeJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentSource(value: JobDocumentSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSource")(js.undefined)
        ret
    }
    @scala.inline
    def withJob(value: Job): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(js.undefined)
        ret
    }
  }
  
}

