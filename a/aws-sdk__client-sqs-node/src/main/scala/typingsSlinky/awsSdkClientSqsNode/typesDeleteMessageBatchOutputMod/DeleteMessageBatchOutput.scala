package typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod

import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchResultEntryMod.UnmarshalledDeleteMessageBatchResultEntry
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessageBatchOutput extends OutputTypesUnion {
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
    * <p>A list of <code> <a>DeleteMessageBatchResultEntry</a> </code> items.</p>
    */
  var Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry] = js.native
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
  @scala.inline
  implicit class DeleteMessageBatchOutputOps[Self <: DeleteMessageBatchOutput] (val x: Self) extends AnyVal {
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
    def withFailed(value: js.Array[UnmarshalledBatchResultErrorEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessful(value: js.Array[UnmarshalledDeleteMessageBatchResultEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successful")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

