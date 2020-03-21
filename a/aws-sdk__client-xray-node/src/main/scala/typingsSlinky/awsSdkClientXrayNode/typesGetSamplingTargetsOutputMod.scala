package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesSamplingTargetDocumentMod.UnmarshalledSamplingTargetDocument
import typingsSlinky.awsSdkClientXrayNode.typesUnprocessedStatisticsMod.UnmarshalledUnprocessedStatistics
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetSamplingTargetsOutput", JSImport.Namespace)
@js.native
object typesGetSamplingTargetsOutputMod extends js.Object {
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
  
}

