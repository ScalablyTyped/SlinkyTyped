package typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsOutputMod

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesUnprocessedTraceSegmentMod.UnmarshalledUnprocessedTraceSegment
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTraceSegmentsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Segments that failed processing.</p>
    */
  var UnprocessedTraceSegments: js.UndefOr[js.Array[UnmarshalledUnprocessedTraceSegment]] = js.native
}

object PutTraceSegmentsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutTraceSegmentsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTraceSegmentsOutput]
  }
  @scala.inline
  implicit class PutTraceSegmentsOutputOps[Self <: PutTraceSegmentsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedTraceSegments(value: js.Array[UnmarshalledUnprocessedTraceSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedTraceSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedTraceSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedTraceSegments")(js.undefined)
        ret
    }
  }
  
}

