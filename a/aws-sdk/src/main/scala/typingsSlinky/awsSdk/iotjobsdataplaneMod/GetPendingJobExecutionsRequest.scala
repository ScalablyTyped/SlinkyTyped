package typingsSlinky.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPendingJobExecutionsRequest extends js.Object {
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: ThingName = js.native
}

object GetPendingJobExecutionsRequest {
  @scala.inline
  def apply(thingName: ThingName): GetPendingJobExecutionsRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPendingJobExecutionsRequest]
  }
  @scala.inline
  implicit class GetPendingJobExecutionsRequestOps[Self <: GetPendingJobExecutionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

