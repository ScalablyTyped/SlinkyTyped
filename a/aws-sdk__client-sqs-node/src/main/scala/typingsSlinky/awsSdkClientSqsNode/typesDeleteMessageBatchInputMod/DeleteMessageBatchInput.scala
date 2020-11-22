package typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod

import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchRequestEntryMod.DeleteMessageBatchRequestEntry
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMessageBatchInput extends InputTypesUnion {
  
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
    * <p>A list of receipt handles for the messages to be deleted.</p>
    */
  var Entries: js.Array[DeleteMessageBatchRequestEntry] | js.Iterable[DeleteMessageBatchRequestEntry] = js.native
  
  /**
    * <p>The URL of the Amazon SQS queue from which messages are deleted.</p> <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: String = js.native
}
object DeleteMessageBatchInput {
  
  @scala.inline
  def apply(
    Entries: js.Array[DeleteMessageBatchRequestEntry] | js.Iterable[DeleteMessageBatchRequestEntry],
    QueueUrl: String
  ): DeleteMessageBatchInput = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchInput]
  }
  
  @scala.inline
  implicit class DeleteMessageBatchInputOps[Self <: DeleteMessageBatchInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntriesVarargs(value: DeleteMessageBatchRequestEntry*): Self = this.set("Entries", js.Array(value :_*))
    
    @scala.inline
    def setEntriesIterable(value: js.Iterable[DeleteMessageBatchRequestEntry]): Self = this.set("Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: js.Array[DeleteMessageBatchRequestEntry] | js.Iterable[DeleteMessageBatchRequestEntry]): Self = this.set("Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUrl(value: String): Self = this.set("QueueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
    ): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
  }
}
