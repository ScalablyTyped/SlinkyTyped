package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchRequestEntryMod.SendMessageBatchRequestEntry
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/SendMessageBatchInput", JSImport.Namespace)
@js.native
object typesSendMessageBatchInputMod extends js.Object {
  @js.native
  trait SendMessageBatchInput extends InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>A list of <code> <a>SendMessageBatchRequestEntry</a> </code> items.</p>
      */
    var Entries: js.Array[SendMessageBatchRequestEntry] | js.Iterable[SendMessageBatchRequestEntry] = js.native
    /**
      * <p>The URL of the Amazon SQS queue to which batched messages are sent.</p> <p>Queue URLs and names are case-sensitive.</p>
      */
    var QueueUrl: String = js.native
  }
  
}

