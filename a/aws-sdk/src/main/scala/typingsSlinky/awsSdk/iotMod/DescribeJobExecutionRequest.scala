package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobExecutionRequest extends js.Object {
  /**
    * A string (consisting of the digits "0" through "9" which is used to specify a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId = js.native
  /**
    * The name of the thing on which the job execution is running.
    */
  var thingName: ThingName = js.native
}

object DescribeJobExecutionRequest {
  @scala.inline
  def apply(jobId: JobId, thingName: ThingName): DescribeJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobExecutionRequest]
  }
  @scala.inline
  implicit class DescribeJobExecutionRequestOps[Self <: DescribeJobExecutionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionNumber(value: ExecutionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionNumber")(js.undefined)
        ret
    }
  }
  
}

