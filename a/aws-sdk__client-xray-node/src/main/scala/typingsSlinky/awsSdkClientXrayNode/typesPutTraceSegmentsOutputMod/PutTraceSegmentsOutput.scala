package typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsOutputMod

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesUnprocessedTraceSegmentMod.UnmarshalledUnprocessedTraceSegment
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTraceSegmentsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Segments that failed processing.</p>
    */
  var UnprocessedTraceSegments: js.UndefOr[js.Array[UnmarshalledUnprocessedTraceSegment]] = js.undefined
}

object PutTraceSegmentsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    UnprocessedTraceSegments: js.Array[UnmarshalledUnprocessedTraceSegment] = null
  ): PutTraceSegmentsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (UnprocessedTraceSegments != null) __obj.updateDynamic("UnprocessedTraceSegments")(UnprocessedTraceSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTraceSegmentsOutput]
  }
}

