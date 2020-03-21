package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchResultEntryMod.UnmarshalledChangeMessageVisibilityBatchResultEntry
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
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
    var Failed: js.Array[UnmarshalledBatchResultErrorEntry] = js.native
    /**
      * <p>A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.</p>
      */
    var Successful: js.Array[UnmarshalledChangeMessageVisibilityBatchResultEntry] = js.native
  }
  
}

