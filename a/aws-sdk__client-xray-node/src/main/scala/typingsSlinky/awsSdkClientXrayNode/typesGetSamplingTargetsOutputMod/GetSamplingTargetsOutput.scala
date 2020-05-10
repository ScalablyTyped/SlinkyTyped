package typingsSlinky.awsSdkClientXrayNode.typesGetSamplingTargetsOutputMod

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesSamplingTargetDocumentMod.UnmarshalledSamplingTargetDocument
import typingsSlinky.awsSdkClientXrayNode.typesUnprocessedStatisticsMod.UnmarshalledUnprocessedStatistics
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingTargetsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.</p>
    */
  var LastRuleModification: js.UndefOr[js.Date] = js.native
  /**
    * <p>Updated rules that the service should use to sample requests.</p>
    */
  var SamplingTargetDocuments: js.UndefOr[js.Array[UnmarshalledSamplingTargetDocument]] = js.native
  /**
    * <p>Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.</p>
    */
  var UnprocessedStatistics: js.UndefOr[js.Array[UnmarshalledUnprocessedStatistics]] = js.native
}

object GetSamplingTargetsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetSamplingTargetsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingTargetsOutput]
  }
  @scala.inline
  implicit class GetSamplingTargetsOutputOps[Self <: GetSamplingTargetsOutput] (val x: Self) extends AnyVal {
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
    def withLastRuleModification(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRuleModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRuleModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRuleModification")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingTargetDocuments(value: js.Array[UnmarshalledSamplingTargetDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingTargetDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingTargetDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingTargetDocuments")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedStatistics(value: js.Array[UnmarshalledUnprocessedStatistics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedStatistics")(js.undefined)
        ret
    }
  }
  
}

