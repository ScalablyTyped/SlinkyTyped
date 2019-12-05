package typingsSlinky.atAwsDashSdkClientDashSqsDashNode

import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreBatchResultErrorEntryMod._UnmarshalledBatchResultErrorEntry
import typingsSlinky.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreChangeMessageVisibilityBatchResultEntryMod._UnmarshalledChangeMessageVisibilityBatchResultEntry
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/ChangeMessageVisibilityBatchOutput", JSImport.Namespace)
@js.native
object typesChangeMessageVisibilityBatchOutputMod extends js.Object {
  @js.native
  trait ChangeMessageVisibilityBatchOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A list of <code> <a>BatchResultErrorEntry</a> </code> items.</p>
      */
    var Failed: js.Array[_UnmarshalledBatchResultErrorEntry] = js.native
    /**
      * <p>A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.</p>
      */
    var Successful: js.Array[_UnmarshalledChangeMessageVisibilityBatchResultEntry] = js.native
  }
  
}

