package typingsSlinky.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateDetectorRequest extends js.Object {
  /**
    * The list of detectors (instances) to update, along with the values to update.
    */
  var detectors: UpdateDetectorRequests = js.native
}

object BatchUpdateDetectorRequest {
  @scala.inline
  def apply(detectors: UpdateDetectorRequests): BatchUpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectors = detectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateDetectorRequest]
  }
  @scala.inline
  implicit class BatchUpdateDetectorRequestOps[Self <: BatchUpdateDetectorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectors(value: UpdateDetectorRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

