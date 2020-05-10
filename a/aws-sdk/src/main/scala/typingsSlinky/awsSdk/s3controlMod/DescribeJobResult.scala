package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobResult extends js.Object {
  /**
    * Contains the configuration parameters and status for the job specified in the Describe Job request.
    */
  var Job: js.UndefOr[JobDescriptor] = js.native
}

object DescribeJobResult {
  @scala.inline
  def apply(): DescribeJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobResult]
  }
  @scala.inline
  implicit class DescribeJobResultOps[Self <: DescribeJobResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJob(value: JobDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Job")(js.undefined)
        ret
    }
  }
  
}

