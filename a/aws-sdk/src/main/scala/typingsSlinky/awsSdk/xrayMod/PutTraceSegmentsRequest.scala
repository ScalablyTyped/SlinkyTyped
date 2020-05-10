package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTraceSegmentsRequest extends js.Object {
  /**
    * A string containing a JSON document defining one or more segments or subsegments.
    */
  var TraceSegmentDocuments: TraceSegmentDocumentList = js.native
}

object PutTraceSegmentsRequest {
  @scala.inline
  def apply(TraceSegmentDocuments: TraceSegmentDocumentList): PutTraceSegmentsRequest = {
    val __obj = js.Dynamic.literal(TraceSegmentDocuments = TraceSegmentDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTraceSegmentsRequest]
  }
  @scala.inline
  implicit class PutTraceSegmentsRequestOps[Self <: PutTraceSegmentsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTraceSegmentDocuments(value: TraceSegmentDocumentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraceSegmentDocuments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

