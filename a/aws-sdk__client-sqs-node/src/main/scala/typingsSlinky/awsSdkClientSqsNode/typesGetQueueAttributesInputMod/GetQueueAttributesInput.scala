package typingsSlinky.awsSdkClientSqsNode.typesGetQueueAttributesInputMod

import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.All
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateNumberOfMessages
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateNumberOfMessagesDelayed
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateNumberOfMessagesNotVisible
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ContentBasedDeduplication
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.CreatedTimestamp
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.DelaySeconds
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.FifoQueue
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.KmsDataKeyReusePeriodSeconds
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.KmsMasterKeyId
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.LastModifiedTimestamp
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MaximumMessageSize
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageRetentionPeriod
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.Policy
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueArn
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiveMessageWaitTimeSeconds
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.RedrivePolicy
import typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.VisibilityTimeout
import typingsSlinky.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQueueAttributesInput extends InputTypesUnion {
  
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
    * <p>A list of attributes for which to retrieve information.</p> <note> <p>In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully.</p> </note> <p>The following attributes are supported:</p> <ul> <li> <p> <code>All</code> - Returns all values. </p> </li> <li> <p> <code>ApproximateNumberOfMessages</code> - Returns the approximate number of messages available for retrieval from the queue.</p> </li> <li> <p> <code>ApproximateNumberOfMessagesDelayed</code> - Returns the approximate number of messages in the queue that are delayed and not available for reading immediately. This can happen when the queue is configured as a delay queue or when a message has been sent with a delay parameter.</p> </li> <li> <p> <code>ApproximateNumberOfMessagesNotVisible</code> - Returns the approximate number of messages that are in flight. Messages are considered to be <i>in flight</i> if they have been sent to a client but have not yet been deleted or have not yet reached the end of their visibility window. </p> </li> <li> <p> <code>CreatedTimestamp</code> - Returns the time when the queue was created in seconds (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).</p> </li> <li> <p> <code>DelaySeconds</code> - Returns the default delay on the queue in seconds.</p> </li> <li> <p> <code>LastModifiedTimestamp</code> - Returns the time when the queue was last changed in seconds (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a>).</p> </li> <li> <p> <code>MaximumMessageSize</code> - Returns the limit of how many bytes a message can contain before Amazon SQS rejects it.</p> </li> <li> <p> <code>MessageRetentionPeriod</code> - Returns the length of time, in seconds, for which Amazon SQS retains a message.</p> </li> <li> <p> <code>Policy</code> - Returns the policy of the queue.</p> </li> <li> <p> <code>QueueArn</code> - Returns the Amazon resource name (ARN) of the queue.</p> </li> <li> <p> <code>ReceiveMessageWaitTimeSeconds</code> - Returns the length of time, in seconds, for which the <code>ReceiveMessage</code> action waits for a message to arrive. </p> </li> <li> <p> <code>RedrivePolicy</code> - Returns the string that includes the parameters for dead-letter queue functionality of the source queue. For more information about the redrive policy and dead-letter queues, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>. </p> <ul> <li> <p> <code>deadLetterTargetArn</code> - The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.</p> </li> <li> <p> <code>maxReceiveCount</code> - The number of times a message is delivered to the source queue before being moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.</p> </li> </ul> </li> <li> <p> <code>VisibilityTimeout</code> - Returns the visibility timeout for the queue. For more information about the visibility timeout, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html">Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>. </p> </li> </ul> <p>The following attributes apply only to <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html">server-side-encryption</a>:</p> <ul> <li> <p> <code>KmsMasterKeyId</code> - Returns the ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms">Key Terms</a>. </p> </li> <li> <p> <code>KmsDataKeyReusePeriodSeconds</code> - Returns the length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work">How Does the Data Key Reuse Period Work?</a>. </p> </li> </ul> <p>The following attributes apply only to <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO (first-in-first-out) queues</a>:</p> <ul> <li> <p> <code>FifoQueue</code> - Returns whether the queue is FIFO. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic">FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p> <note> <p>To determine whether a queue is <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO</a>, you can check whether <code>QueueName</code> ends with the <code>.fifo</code> suffix.</p> </note> </li> <li> <p> <code>ContentBasedDeduplication</code> - Returns whether content-based deduplication is enabled for the queue. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing">Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>. </p> </li> </ul>
    */
  var AttributeNames: js.UndefOr[
    (js.Array[
      All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String
    ]) | (js.Iterable[
      All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String
    ])
  ] = js.native
  
  /**
    * <p>The URL of the Amazon SQS queue whose attribute information is retrieved.</p> <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: String = js.native
}
object GetQueueAttributesInput {
  
  @scala.inline
  def apply(QueueUrl: String): GetQueueAttributesInput = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueAttributesInput]
  }
  
  @scala.inline
  implicit class GetQueueAttributesInputOps[Self <: GetQueueAttributesInput] (val x: Self) extends AnyVal {
    
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
    def setAttributeNamesVarargs(
      value: (All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String)*
    ): Self = this.set("AttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setAttributeNamesIterable(
      value: js.Iterable[
          All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String
        ]
    ): Self = this.set("AttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNames(
      value: (js.Array[
          All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String
        ]) | (js.Iterable[
          All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String
        ])
    ): Self = this.set("AttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeNames: Self = this.set("AttributeNames", js.undefined)
  }
}
