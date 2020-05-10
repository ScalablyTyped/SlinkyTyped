package typingsSlinky.awsSdkClientXrayNode.typesGetTraceSummariesOutputMod

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesTraceSummaryMod.UnmarshalledTraceSummary
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTraceSummariesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The start time of this page of results.</p>
    */
  var ApproximateTime: js.UndefOr[js.Date] = js.native
  /**
    * <p>If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * <p>Trace IDs and metadata for traces that were found in the specified time frame.</p>
    */
  var TraceSummaries: js.UndefOr[js.Array[UnmarshalledTraceSummary]] = js.native
  /**
    * <p>The total number of traces processed, including traces that did not match the specified filter expression.</p>
    */
  var TracesProcessedCount: js.UndefOr[Double] = js.native
}

object GetTraceSummariesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetTraceSummariesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceSummariesOutput]
  }
  @scala.inline
  implicit class GetTraceSummariesOutputOps[Self <: GetTraceSummariesOutput] (val x: Self) extends AnyVal {
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
    def withApproximateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproximateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceSummaries(value: js.Array[UnmarshalledTraceSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraceSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraceSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withTracesProcessedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TracesProcessedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracesProcessedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TracesProcessedCount")(js.undefined)
        ret
    }
  }
  
}

