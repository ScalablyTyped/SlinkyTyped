package typingsSlinky.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesOutputMod

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod.UnmarshalledSamplingStatisticSummary
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingStatisticSummariesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Pagination token. Not used.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * <p>Information about the number of requests instrumented for each sampling rule.</p>
    */
  var SamplingStatisticSummaries: js.UndefOr[js.Array[UnmarshalledSamplingStatisticSummary]] = js.native
}

object GetSamplingStatisticSummariesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetSamplingStatisticSummariesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingStatisticSummariesOutput]
  }
  @scala.inline
  implicit class GetSamplingStatisticSummariesOutputOps[Self <: GetSamplingStatisticSummariesOutput] (val x: Self) extends AnyVal {
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
    def withSamplingStatisticSummaries(value: js.Array[UnmarshalledSamplingStatisticSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingStatisticSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingStatisticSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingStatisticSummaries")(js.undefined)
        ret
    }
  }
  
}

