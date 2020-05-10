package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsOutput extends js.Object {
  var IsTruncated: js.UndefOr[typingsSlinky.awsSdk.importexportMod.IsTruncated] = js.native
  var Jobs: js.UndefOr[JobsList] = js.native
}

object ListJobsOutput {
  @scala.inline
  def apply(): ListJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsOutput]
  }
  @scala.inline
  implicit class ListJobsOutputOps[Self <: ListJobsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsTruncated(value: IsTruncated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(js.undefined)
        ret
    }
    @scala.inline
    def withJobs(value: JobsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jobs")(js.undefined)
        ret
    }
  }
  
}

