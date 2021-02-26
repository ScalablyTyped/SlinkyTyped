package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchRequestEntryMod.SendMessageBatchRequestEntry
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendMessageBatchInputMod {
  
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
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
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
  object SendMessageBatchInput {
    
    @scala.inline
    def apply(
      Entries: js.Array[SendMessageBatchRequestEntry] | js.Iterable[SendMessageBatchRequestEntry],
      QueueUrl: String
    ): SendMessageBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessageBatchInput]
    }
    
    @scala.inline
    implicit class SendMessageBatchInputMutableBuilder[Self <: SendMessageBatchInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setEntries(value: js.Array[SendMessageBatchRequestEntry] | js.Iterable[SendMessageBatchRequestEntry]): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesIterable(value: js.Iterable[SendMessageBatchRequestEntry]): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: SendMessageBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
      
      @scala.inline
      def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    }
  }
}
