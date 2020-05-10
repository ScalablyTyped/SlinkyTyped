package typingsSlinky.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobExecutionRequest extends js.Object {
  /**
    * Optional. A number that identifies a particular job execution on a particular device. If not specified, the latest job execution is returned.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * Optional. When set to true, the response contains the job document. The default is false.
    */
  var includeJobDocument: js.UndefOr[IncludeJobDocument] = js.native
  /**
    * The unique identifier assigned to this job when it was created.
    */
  var jobId: DescribeJobExecutionJobId = js.native
  /**
    * The thing name associated with the device the job execution is running on.
    */
  var thingName: ThingName = js.native
}

object DescribeJobExecutionRequest {
  @scala.inline
  def apply(jobId: DescribeJobExecutionJobId, thingName: ThingName): DescribeJobExecutionRequest = {
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
    def withJobId(value: DescribeJobExecutionJobId): Self = {
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
    @scala.inline
    def withIncludeJobDocument(value: IncludeJobDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeJobDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeJobDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeJobDocument")(js.undefined)
        ret
    }
  }
  
}

