package typingsSlinky.awsSdkClientSqsNode.typesSendMessageInputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientSqsNode.typesMessageAttributeValueMod.MessageAttributeValue
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessageInput extends InputTypesUnion {
  
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
    * <p> The length of time, in seconds, for which to delay a specific message. Valid values: 0 to 900. Maximum: 15 minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing after the delay period is finished. If you don't specify a value, the default value for the queue applies. </p> <note> <p>When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set this parameter only on a queue level.</p> </note>
    */
  var DelaySeconds: js.UndefOr[Double] = js.native
  
  /**
    * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  var MessageAttributes: js.UndefOr[
    StringDictionary[MessageAttributeValue] | (js.Iterable[js.Tuple2[String, MessageAttributeValue]])
  ] = js.native
  
  /**
    * <p>The message to send. The maximum string size is 256 KB.</p> <important> <p>A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:</p> <p> <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | <code>#x20</code> to <code>#xD7FF</code> | <code>#xE000</code> to <code>#xFFFD</code> | <code>#x10000</code> to <code>#x10FFFF</code> </p> <p>Any characters not included in this list will be rejected. For more information, see the <a href="http://www.w3.org/TR/REC-xml/#charsets">W3C specification for characters</a>.</p> </important>
    */
  var MessageBody: String = js.native
  
  /**
    * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p> <p>The token used for deduplication of sent messages. If a message with a particular <code>MessageDeduplicationId</code> is sent successfully, any messages sent with the same <code>MessageDeduplicationId</code> are accepted successfully but aren't delivered during the 5-minute deduplication interval. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"> Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p> <ul> <li> <p>Every message must have a unique <code>MessageDeduplicationId</code>,</p> <ul> <li> <p>You may provide a <code>MessageDeduplicationId</code> explicitly.</p> </li> <li> <p>If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message). </p> </li> <li> <p>If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have <code>ContentBasedDeduplication</code> set, the action fails with an error.</p> </li> <li> <p>If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides the generated one.</p> </li> </ul> </li> <li> <p>When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the deduplication interval are treated as duplicates and only one copy of the message is delivered.</p> </li> <li> <p>If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a <code>MessageDeduplicationId</code> that is the same as the one generated for the first <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message is delivered. </p> </li> </ul> <note> <p>The <code>MessageDeduplicationId</code> is available to the consumer of the message (this can be useful for troubleshooting delivery issues).</p> <p>If a message is sent successfully but the acknowledgement is lost and the message is resent with the same <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate messages.</p> <p>Amazon SQS continues to keep track of the message deduplication ID even after the message is received and deleted.</p> </note> <p>The length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code> can contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).</p> <p>For best practices of using <code>MessageDeduplicationId</code>, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html">Using the MessageDeduplicationId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  var MessageDeduplicationId: js.UndefOr[String] = js.native
  
  /**
    * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p> <p>The tag that specifies that a message belongs to a specific message group. Messages that belong to the same message group are processed in a FIFO manner (however, messages in different message groups might be processed out of order). To interleave multiple ordered streams within a single queue, use <code>MessageGroupId</code> values (for example, session data for multiple users). In this scenario, multiple consumers can process the queue, but the session data of each user is processed in a FIFO fashion.</p> <ul> <li> <p>You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a <code>MessageGroupId</code>, the action fails.</p> </li> <li> <p> <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For each <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't specify a <code>MessageGroupId</code>.</p> </li> </ul> <p>The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and punctuation <code>(!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~)</code>.</p> <p>For best practices of using <code>MessageGroupId</code>, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html">Using the MessageGroupId Property</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p> <important> <p> <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.</p> </important>
    */
  var MessageGroupId: js.UndefOr[String] = js.native
  
  /**
    * <p>The URL of the Amazon SQS queue to which a message is sent.</p> <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: String = js.native
}
object SendMessageInput {
  
  @scala.inline
  def apply(MessageBody: String, QueueUrl: String): SendMessageInput = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageInput]
  }
  
  @scala.inline
  implicit class SendMessageInputOps[Self <: SendMessageInput] (val x: Self) extends AnyVal {
    
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
    def setMessageBody(value: String): Self = this.set("MessageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUrl(value: String): Self = this.set("QueueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    
    @scala.inline
    def setDelaySeconds(value: Double): Self = this.set("DelaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelaySeconds: Self = this.set("DelaySeconds", js.undefined)
    
    @scala.inline
    def setMessageAttributesIterable(value: js.Iterable[js.Tuple2[String, MessageAttributeValue]]): Self = this.set("MessageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageAttributes(
      value: StringDictionary[MessageAttributeValue] | (js.Iterable[js.Tuple2[String, MessageAttributeValue]])
    ): Self = this.set("MessageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageAttributes: Self = this.set("MessageAttributes", js.undefined)
    
    @scala.inline
    def setMessageDeduplicationId(value: String): Self = this.set("MessageDeduplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDeduplicationId: Self = this.set("MessageDeduplicationId", js.undefined)
    
    @scala.inline
    def setMessageGroupId(value: String): Self = this.set("MessageGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageGroupId: Self = this.set("MessageGroupId", js.undefined)
  }
}
