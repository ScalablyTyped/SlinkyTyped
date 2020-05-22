package typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod

import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchResultEntryMod.UnmarshalledDeleteMessageBatchResultEntry
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMessageBatchOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of <code> <a>BatchResultErrorEntry</a> </code> items.</p>
    */
  var Failed: js.Array[UnmarshalledBatchResultErrorEntry]
  /**
    * <p>A list of <code> <a>DeleteMessageBatchResultEntry</a> </code> items.</p>
    */
  var Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry]
}

object DeleteMessageBatchOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Failed: js.Array[UnmarshalledBatchResultErrorEntry],
    Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry]
  ): DeleteMessageBatchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchOutput]
  }
}

