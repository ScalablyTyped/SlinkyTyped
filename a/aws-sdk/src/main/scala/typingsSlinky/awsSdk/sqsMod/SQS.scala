package typingsSlinky.awsSdk.sqsMod

import typingsSlinky.awsSdk.configBaseMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SQS extends Service {
  
  /**
    * Adds a permission to a queue for a specific principal. This allows sharing access to the queue. When you create a queue, you have full control access rights for the queue. Only you, the owner of the queue, can grant or deny permissions to the queue. For more information about these permissions, see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer Guide.     AddPermission generates a policy for you. You can use  SetQueueAttributes  to upload your policy. For more information, see Using Custom Policies with the Amazon SQS Access Policy Language in the Amazon Simple Queue Service Developer Guide.   An Amazon SQS policy can have a maximum of 7 actions.   To remove the ability to change queue permissions, you must deny permission to the AddPermission, RemovePermission, and SetQueueAttributes actions in your IAM policy.    Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def addPermission(): Request[js.Object, AWSError] = js.native
  def addPermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds a permission to a queue for a specific principal. This allows sharing access to the queue. When you create a queue, you have full control access rights for the queue. Only you, the owner of the queue, can grant or deny permissions to the queue. For more information about these permissions, see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer Guide.     AddPermission generates a policy for you. You can use  SetQueueAttributes  to upload your policy. For more information, see Using Custom Policies with the Amazon SQS Access Policy Language in the Amazon Simple Queue Service Developer Guide.   An Amazon SQS policy can have a maximum of 7 actions.   To remove the ability to change queue permissions, you must deny permission to the AddPermission, RemovePermission, and SetQueueAttributes actions in your IAM policy.    Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def addPermission(params: AddPermissionRequest): Request[js.Object, AWSError] = js.native
  def addPermission(
    params: AddPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes the visibility timeout of a specified message in a queue to a new value. The default visibility timeout for a message is 30 seconds. The minimum is 0 seconds. The maximum is 12 hours. For more information, see Visibility Timeout in the Amazon Simple Queue Service Developer Guide. For example, you have a message with a visibility timeout of 5 minutes. After 3 minutes, you call ChangeMessageVisibility with a timeout of 10 minutes. You can continue to call ChangeMessageVisibility to extend the visibility timeout to the maximum allowed time. If you try to extend the visibility timeout beyond the maximum, your request is rejected. An Amazon SQS message has three basic states:   Sent to a queue by a producer.   Received from the queue by a consumer.   Deleted from the queue.   A message is considered to be stored after it is sent to a queue by a producer, but not yet received from the queue by a consumer (that is, between states 1 and 2). There is no limit to the number of stored messages. A message is considered to be in flight after it is received from a queue by a consumer, but not yet deleted from the queue (that is, between states 2 and 3). There is a limit to the number of inflight messages. Limits that apply to inflight messages are unrelated to the unlimited number of stored messages. For most standard queues (depending on queue traffic and message backlog), there can be a maximum of approximately 120,000 inflight messages (received from a queue by a consumer, but not yet deleted from the queue). If you reach this limit, Amazon SQS returns the OverLimit error message. To avoid reaching the limit, you should delete messages from the queue after they're processed. You can also increase the number of queues you use to process your messages. To request a limit increase, file a support request. For FIFO queues, there can be a maximum of 20,000 inflight messages (received from a queue by a consumer, but not yet deleted from the queue). If you reach this limit, Amazon SQS returns no error messages.  If you attempt to set the VisibilityTimeout to a value greater than the maximum time left, Amazon SQS returns an error. Amazon SQS doesn't automatically recalculate and increase the timeout to the maximum remaining time. Unlike with a queue, when you change the visibility timeout for a specific message the timeout value is applied immediately but isn't saved in memory for that message. If you don't delete a message after it is received, the visibility timeout for the message reverts to the original timeout value (not to the value you set using the ChangeMessageVisibility action) the next time the message is received. 
    */
  def changeMessageVisibility(): Request[js.Object, AWSError] = js.native
  def changeMessageVisibility(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the visibility timeout of a specified message in a queue to a new value. The default visibility timeout for a message is 30 seconds. The minimum is 0 seconds. The maximum is 12 hours. For more information, see Visibility Timeout in the Amazon Simple Queue Service Developer Guide. For example, you have a message with a visibility timeout of 5 minutes. After 3 minutes, you call ChangeMessageVisibility with a timeout of 10 minutes. You can continue to call ChangeMessageVisibility to extend the visibility timeout to the maximum allowed time. If you try to extend the visibility timeout beyond the maximum, your request is rejected. An Amazon SQS message has three basic states:   Sent to a queue by a producer.   Received from the queue by a consumer.   Deleted from the queue.   A message is considered to be stored after it is sent to a queue by a producer, but not yet received from the queue by a consumer (that is, between states 1 and 2). There is no limit to the number of stored messages. A message is considered to be in flight after it is received from a queue by a consumer, but not yet deleted from the queue (that is, between states 2 and 3). There is a limit to the number of inflight messages. Limits that apply to inflight messages are unrelated to the unlimited number of stored messages. For most standard queues (depending on queue traffic and message backlog), there can be a maximum of approximately 120,000 inflight messages (received from a queue by a consumer, but not yet deleted from the queue). If you reach this limit, Amazon SQS returns the OverLimit error message. To avoid reaching the limit, you should delete messages from the queue after they're processed. You can also increase the number of queues you use to process your messages. To request a limit increase, file a support request. For FIFO queues, there can be a maximum of 20,000 inflight messages (received from a queue by a consumer, but not yet deleted from the queue). If you reach this limit, Amazon SQS returns no error messages.  If you attempt to set the VisibilityTimeout to a value greater than the maximum time left, Amazon SQS returns an error. Amazon SQS doesn't automatically recalculate and increase the timeout to the maximum remaining time. Unlike with a queue, when you change the visibility timeout for a specific message the timeout value is applied immediately but isn't saved in memory for that message. If you don't delete a message after it is received, the visibility timeout for the message reverts to the original timeout value (not to the value you set using the ChangeMessageVisibility action) the next time the message is received. 
    */
  def changeMessageVisibility(params: ChangeMessageVisibilityRequest): Request[js.Object, AWSError] = js.native
  def changeMessageVisibility(
    params: ChangeMessageVisibilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Changes the visibility timeout of multiple messages. This is a batch version of  ChangeMessageVisibility. The result of the action on each message is reported individually in the response. You can send up to 10  ChangeMessageVisibility  requests with each ChangeMessageVisibilityBatch action.  Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second 
    */
  def changeMessageVisibilityBatch(): Request[ChangeMessageVisibilityBatchResult, AWSError] = js.native
  def changeMessageVisibilityBatch(callback: js.Function2[/* err */ AWSError, /* data */ ChangeMessageVisibilityBatchResult, Unit]): Request[ChangeMessageVisibilityBatchResult, AWSError] = js.native
  /**
    * Changes the visibility timeout of multiple messages. This is a batch version of  ChangeMessageVisibility. The result of the action on each message is reported individually in the response. You can send up to 10  ChangeMessageVisibility  requests with each ChangeMessageVisibilityBatch action.  Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second 
    */
  def changeMessageVisibilityBatch(params: ChangeMessageVisibilityBatchRequest): Request[ChangeMessageVisibilityBatchResult, AWSError] = js.native
  def changeMessageVisibilityBatch(
    params: ChangeMessageVisibilityBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ChangeMessageVisibilityBatchResult, Unit]
  ): Request[ChangeMessageVisibilityBatchResult, AWSError] = js.native
  
  @JSName("config")
  var config_SQS: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a new standard or FIFO queue. You can pass one or more attributes in the request. Keep the following in mind:   If you don't specify the FifoQueue attribute, Amazon SQS creates a standard queue.  You can't change the queue type after you create it and you can't convert an existing standard queue into a FIFO queue. You must either create a new FIFO queue for your application or delete your existing standard queue and recreate it as a FIFO queue. For more information, see Moving From a Standard Queue to a FIFO Queue in the Amazon Simple Queue Service Developer Guide.     If you don't provide a value for an attribute, the queue is created with the default value for the attribute.   If you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.   To successfully create a new queue, you must provide a queue name that adheres to the limits related to queues and is unique within the scope of your queues.  After you create a queue, you must wait at least one second after the queue is created to be able to use the queue.  To get the queue URL, use the  GetQueueUrl  action.  GetQueueUrl  requires only the QueueName parameter. be aware of existing queue names:   If you provide the name of an existing queue along with the exact names and values of all the queue's attributes, CreateQueue returns the queue URL for the existing queue.   If the queue name, attribute names, or attribute values don't match an existing queue, CreateQueue returns an error.   Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def createQueue(): Request[CreateQueueResult, AWSError] = js.native
  def createQueue(callback: js.Function2[/* err */ AWSError, /* data */ CreateQueueResult, Unit]): Request[CreateQueueResult, AWSError] = js.native
  /**
    * Creates a new standard or FIFO queue. You can pass one or more attributes in the request. Keep the following in mind:   If you don't specify the FifoQueue attribute, Amazon SQS creates a standard queue.  You can't change the queue type after you create it and you can't convert an existing standard queue into a FIFO queue. You must either create a new FIFO queue for your application or delete your existing standard queue and recreate it as a FIFO queue. For more information, see Moving From a Standard Queue to a FIFO Queue in the Amazon Simple Queue Service Developer Guide.     If you don't provide a value for an attribute, the queue is created with the default value for the attribute.   If you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.   To successfully create a new queue, you must provide a queue name that adheres to the limits related to queues and is unique within the scope of your queues.  After you create a queue, you must wait at least one second after the queue is created to be able to use the queue.  To get the queue URL, use the  GetQueueUrl  action.  GetQueueUrl  requires only the QueueName parameter. be aware of existing queue names:   If you provide the name of an existing queue along with the exact names and values of all the queue's attributes, CreateQueue returns the queue URL for the existing queue.   If the queue name, attribute names, or attribute values don't match an existing queue, CreateQueue returns an error.   Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def createQueue(params: CreateQueueRequest): Request[CreateQueueResult, AWSError] = js.native
  def createQueue(
    params: CreateQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateQueueResult, Unit]
  ): Request[CreateQueueResult, AWSError] = js.native
  
  /**
    * Deletes the specified message from the specified queue. To select the message to delete, use the ReceiptHandle of the message (not the MessageId which you receive when you send the message). Amazon SQS can delete a message from a queue even if a visibility timeout setting causes the message to be locked by another consumer. Amazon SQS automatically deletes messages left in a queue longer than the retention period configured for the queue.   The ReceiptHandle is associated with a specific instance of receiving a message. If you receive a message more than once, the ReceiptHandle is different each time you receive a message. When you use the DeleteMessage action, you must provide the most recently received ReceiptHandle for the message (otherwise, the request succeeds, but the message might not be deleted). For standard queues, it is possible to receive a message even after you delete it. This might happen on rare occasions if one of the servers which stores a copy of the message is unavailable when you send the request to delete the message. The copy remains on the server and might be returned to you during a subsequent receive request. You should ensure that your application is idempotent, so that receiving a message more than once does not cause issues. 
    */
  def deleteMessage(): Request[js.Object, AWSError] = js.native
  def deleteMessage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified message from the specified queue. To select the message to delete, use the ReceiptHandle of the message (not the MessageId which you receive when you send the message). Amazon SQS can delete a message from a queue even if a visibility timeout setting causes the message to be locked by another consumer. Amazon SQS automatically deletes messages left in a queue longer than the retention period configured for the queue.   The ReceiptHandle is associated with a specific instance of receiving a message. If you receive a message more than once, the ReceiptHandle is different each time you receive a message. When you use the DeleteMessage action, you must provide the most recently received ReceiptHandle for the message (otherwise, the request succeeds, but the message might not be deleted). For standard queues, it is possible to receive a message even after you delete it. This might happen on rare occasions if one of the servers which stores a copy of the message is unavailable when you send the request to delete the message. The copy remains on the server and might be returned to you during a subsequent receive request. You should ensure that your application is idempotent, so that receiving a message more than once does not cause issues. 
    */
  def deleteMessage(params: DeleteMessageRequest): Request[js.Object, AWSError] = js.native
  def deleteMessage(
    params: DeleteMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes up to ten messages from the specified queue. This is a batch version of  DeleteMessage. The result of the action on each message is reported individually in the response.  Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second 
    */
  def deleteMessageBatch(): Request[DeleteMessageBatchResult, AWSError] = js.native
  def deleteMessageBatch(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMessageBatchResult, Unit]): Request[DeleteMessageBatchResult, AWSError] = js.native
  /**
    * Deletes up to ten messages from the specified queue. This is a batch version of  DeleteMessage. The result of the action on each message is reported individually in the response.  Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second 
    */
  def deleteMessageBatch(params: DeleteMessageBatchRequest): Request[DeleteMessageBatchResult, AWSError] = js.native
  def deleteMessageBatch(
    params: DeleteMessageBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMessageBatchResult, Unit]
  ): Request[DeleteMessageBatchResult, AWSError] = js.native
  
  /**
    * Deletes the queue specified by the QueueUrl, regardless of the queue's contents.  Be careful with the DeleteQueue action: When you delete a queue, any messages in the queue are no longer available.   When you delete a queue, the deletion process takes up to 60 seconds. Requests you send involving that queue during the 60 seconds might succeed. For example, a  SendMessage  request might succeed, but after 60 seconds the queue and the message you sent no longer exist. When you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.  Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def deleteQueue(): Request[js.Object, AWSError] = js.native
  def deleteQueue(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the queue specified by the QueueUrl, regardless of the queue's contents.  Be careful with the DeleteQueue action: When you delete a queue, any messages in the queue are no longer available.   When you delete a queue, the deletion process takes up to 60 seconds. Requests you send involving that queue during the 60 seconds might succeed. For example, a  SendMessage  request might succeed, but after 60 seconds the queue and the message you sent no longer exist. When you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.  Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def deleteQueue(params: DeleteQueueRequest): Request[js.Object, AWSError] = js.native
  def deleteQueue(params: DeleteQueueRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets attributes for the specified queue.  To determine whether a queue is FIFO, you can check whether QueueName ends with the .fifo suffix. 
    */
  def getQueueAttributes(): Request[GetQueueAttributesResult, AWSError] = js.native
  def getQueueAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetQueueAttributesResult, Unit]): Request[GetQueueAttributesResult, AWSError] = js.native
  /**
    * Gets attributes for the specified queue.  To determine whether a queue is FIFO, you can check whether QueueName ends with the .fifo suffix. 
    */
  def getQueueAttributes(params: GetQueueAttributesRequest): Request[GetQueueAttributesResult, AWSError] = js.native
  def getQueueAttributes(
    params: GetQueueAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueueAttributesResult, Unit]
  ): Request[GetQueueAttributesResult, AWSError] = js.native
  
  /**
    * Returns the URL of an existing Amazon SQS queue. To access a queue that belongs to another AWS account, use the QueueOwnerAWSAccountId parameter to specify the account ID of the queue's owner. The queue's owner must grant you permission to access the queue. For more information about shared queue access, see  AddPermission  or see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer Guide. 
    */
  def getQueueUrl(): Request[GetQueueUrlResult, AWSError] = js.native
  def getQueueUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetQueueUrlResult, Unit]): Request[GetQueueUrlResult, AWSError] = js.native
  /**
    * Returns the URL of an existing Amazon SQS queue. To access a queue that belongs to another AWS account, use the QueueOwnerAWSAccountId parameter to specify the account ID of the queue's owner. The queue's owner must grant you permission to access the queue. For more information about shared queue access, see  AddPermission  or see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer Guide. 
    */
  def getQueueUrl(params: GetQueueUrlRequest): Request[GetQueueUrlResult, AWSError] = js.native
  def getQueueUrl(
    params: GetQueueUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueueUrlResult, Unit]
  ): Request[GetQueueUrlResult, AWSError] = js.native
  
  /**
    * Returns a list of your queues that have the RedrivePolicy queue attribute configured with a dead-letter queue.  The ListDeadLetterSourceQueues methods supports pagination. Set parameter MaxResults in the request to specify the maximum number of results to be returned in the response. If you do not set MaxResults, the response includes a maximum of 1,000 results. If you set MaxResults and there are additional results to display, the response includes a value for NextToken. Use NextToken as a parameter in your next request to ListDeadLetterSourceQueues to receive the next page of results.  For more information about using dead-letter queues, see Using Amazon SQS Dead-Letter Queues in the Amazon Simple Queue Service Developer Guide.
    */
  def listDeadLetterSourceQueues(): Request[ListDeadLetterSourceQueuesResult, AWSError] = js.native
  def listDeadLetterSourceQueues(callback: js.Function2[/* err */ AWSError, /* data */ ListDeadLetterSourceQueuesResult, Unit]): Request[ListDeadLetterSourceQueuesResult, AWSError] = js.native
  /**
    * Returns a list of your queues that have the RedrivePolicy queue attribute configured with a dead-letter queue.  The ListDeadLetterSourceQueues methods supports pagination. Set parameter MaxResults in the request to specify the maximum number of results to be returned in the response. If you do not set MaxResults, the response includes a maximum of 1,000 results. If you set MaxResults and there are additional results to display, the response includes a value for NextToken. Use NextToken as a parameter in your next request to ListDeadLetterSourceQueues to receive the next page of results.  For more information about using dead-letter queues, see Using Amazon SQS Dead-Letter Queues in the Amazon Simple Queue Service Developer Guide.
    */
  def listDeadLetterSourceQueues(params: ListDeadLetterSourceQueuesRequest): Request[ListDeadLetterSourceQueuesResult, AWSError] = js.native
  def listDeadLetterSourceQueues(
    params: ListDeadLetterSourceQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeadLetterSourceQueuesResult, Unit]
  ): Request[ListDeadLetterSourceQueuesResult, AWSError] = js.native
  
  /**
    * List all cost allocation tags added to the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def listQueueTags(): Request[ListQueueTagsResult, AWSError] = js.native
  def listQueueTags(callback: js.Function2[/* err */ AWSError, /* data */ ListQueueTagsResult, Unit]): Request[ListQueueTagsResult, AWSError] = js.native
  /**
    * List all cost allocation tags added to the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def listQueueTags(params: ListQueueTagsRequest): Request[ListQueueTagsResult, AWSError] = js.native
  def listQueueTags(
    params: ListQueueTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueueTagsResult, Unit]
  ): Request[ListQueueTagsResult, AWSError] = js.native
  
  /**
    * Returns a list of your queues in the current region. The response includes a maximum of 1,000 results. If you specify a value for the optional QueueNamePrefix parameter, only queues with a name that begins with the specified value are returned.  The listQueues methods supports pagination. Set parameter MaxResults in the request to specify the maximum number of results to be returned in the response. If you do not set MaxResults, the response includes a maximum of 1,000 results. If you set MaxResults and there are additional results to display, the response includes a value for NextToken. Use NextToken as a parameter in your next request to listQueues to receive the next page of results.   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def listQueues(): Request[ListQueuesResult, AWSError] = js.native
  def listQueues(callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResult, Unit]): Request[ListQueuesResult, AWSError] = js.native
  /**
    * Returns a list of your queues in the current region. The response includes a maximum of 1,000 results. If you specify a value for the optional QueueNamePrefix parameter, only queues with a name that begins with the specified value are returned.  The listQueues methods supports pagination. Set parameter MaxResults in the request to specify the maximum number of results to be returned in the response. If you do not set MaxResults, the response includes a maximum of 1,000 results. If you set MaxResults and there are additional results to display, the response includes a value for NextToken. Use NextToken as a parameter in your next request to listQueues to receive the next page of results.   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def listQueues(params: ListQueuesRequest): Request[ListQueuesResult, AWSError] = js.native
  def listQueues(
    params: ListQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResult, Unit]
  ): Request[ListQueuesResult, AWSError] = js.native
  
  /**
    * Deletes the messages in a queue specified by the QueueURL parameter.  When you use the PurgeQueue action, you can't retrieve any messages deleted from a queue. The message deletion process takes up to 60 seconds. We recommend waiting for 60 seconds regardless of your queue's size.   Messages sent to the queue before you call PurgeQueue might be received but are deleted within the next minute. Messages sent to the queue after you call PurgeQueue might be deleted while the queue is being purged.
    */
  def purgeQueue(): Request[js.Object, AWSError] = js.native
  def purgeQueue(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the messages in a queue specified by the QueueURL parameter.  When you use the PurgeQueue action, you can't retrieve any messages deleted from a queue. The message deletion process takes up to 60 seconds. We recommend waiting for 60 seconds regardless of your queue's size.   Messages sent to the queue before you call PurgeQueue might be received but are deleted within the next minute. Messages sent to the queue after you call PurgeQueue might be deleted while the queue is being purged.
    */
  def purgeQueue(params: PurgeQueueRequest): Request[js.Object, AWSError] = js.native
  def purgeQueue(params: PurgeQueueRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves one or more messages (up to 10), from the specified queue. Using the WaitTimeSeconds parameter enables long-poll support. For more information, see Amazon SQS Long Polling in the Amazon Simple Queue Service Developer Guide.  Short poll is the default behavior where a weighted random set of machines is sampled on a ReceiveMessage call. Thus, only the messages on the sampled machines are returned. If the number of messages in the queue is small (fewer than 1,000), you most likely get fewer messages than you requested per ReceiveMessage call. If the number of messages in the queue is extremely small, you might not receive any messages in a particular ReceiveMessage response. If this happens, repeat the request.  For each message returned, the response includes the following:   The message body.   An MD5 digest of the message body. For information about MD5, see RFC1321.   The MessageId you received when you sent the message to the queue.   The receipt handle.   The message attributes.   An MD5 digest of the message attributes.   The receipt handle is the identifier you must provide when deleting the message. For more information, see Queue and Message Identifiers in the Amazon Simple Queue Service Developer Guide. You can provide the VisibilityTimeout parameter in your request. The parameter is applied to the messages that Amazon SQS returns in the response. If you don't include the parameter, the overall visibility timeout for the queue is used for the returned messages. For more information, see Visibility Timeout in the Amazon Simple Queue Service Developer Guide. A message that isn't deleted or a message whose visibility isn't extended before the visibility timeout expires counts as a failed receive. Depending on the configuration of the queue, the message might be sent to the dead-letter queue.  In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully. 
    */
  def receiveMessage(): Request[ReceiveMessageResult, AWSError] = js.native
  def receiveMessage(callback: js.Function2[/* err */ AWSError, /* data */ ReceiveMessageResult, Unit]): Request[ReceiveMessageResult, AWSError] = js.native
  /**
    * Retrieves one or more messages (up to 10), from the specified queue. Using the WaitTimeSeconds parameter enables long-poll support. For more information, see Amazon SQS Long Polling in the Amazon Simple Queue Service Developer Guide.  Short poll is the default behavior where a weighted random set of machines is sampled on a ReceiveMessage call. Thus, only the messages on the sampled machines are returned. If the number of messages in the queue is small (fewer than 1,000), you most likely get fewer messages than you requested per ReceiveMessage call. If the number of messages in the queue is extremely small, you might not receive any messages in a particular ReceiveMessage response. If this happens, repeat the request.  For each message returned, the response includes the following:   The message body.   An MD5 digest of the message body. For information about MD5, see RFC1321.   The MessageId you received when you sent the message to the queue.   The receipt handle.   The message attributes.   An MD5 digest of the message attributes.   The receipt handle is the identifier you must provide when deleting the message. For more information, see Queue and Message Identifiers in the Amazon Simple Queue Service Developer Guide. You can provide the VisibilityTimeout parameter in your request. The parameter is applied to the messages that Amazon SQS returns in the response. If you don't include the parameter, the overall visibility timeout for the queue is used for the returned messages. For more information, see Visibility Timeout in the Amazon Simple Queue Service Developer Guide. A message that isn't deleted or a message whose visibility isn't extended before the visibility timeout expires counts as a failed receive. Depending on the configuration of the queue, the message might be sent to the dead-letter queue.  In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully. 
    */
  def receiveMessage(params: ReceiveMessageRequest): Request[ReceiveMessageResult, AWSError] = js.native
  def receiveMessage(
    params: ReceiveMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReceiveMessageResult, Unit]
  ): Request[ReceiveMessageResult, AWSError] = js.native
  
  /**
    * Revokes any permissions in the queue policy that matches the specified Label parameter.    Only the owner of a queue can remove permissions from it.   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide.   To remove the ability to change queue permissions, you must deny permission to the AddPermission, RemovePermission, and SetQueueAttributes actions in your IAM policy.   
    */
  def removePermission(): Request[js.Object, AWSError] = js.native
  def removePermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Revokes any permissions in the queue policy that matches the specified Label parameter.    Only the owner of a queue can remove permissions from it.   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide.   To remove the ability to change queue permissions, you must deny permission to the AddPermission, RemovePermission, and SetQueueAttributes actions in your IAM policy.   
    */
  def removePermission(params: RemovePermissionRequest): Request[js.Object, AWSError] = js.native
  def removePermission(
    params: RemovePermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delivers a message to the specified queue.  A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:  #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF  Any characters not included in this list will be rejected. For more information, see the W3C specification for characters. 
    */
  def sendMessage(): Request[SendMessageResult, AWSError] = js.native
  def sendMessage(callback: js.Function2[/* err */ AWSError, /* data */ SendMessageResult, Unit]): Request[SendMessageResult, AWSError] = js.native
  /**
    * Delivers a message to the specified queue.  A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:  #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF  Any characters not included in this list will be rejected. For more information, see the W3C specification for characters. 
    */
  def sendMessage(params: SendMessageRequest): Request[SendMessageResult, AWSError] = js.native
  def sendMessage(
    params: SendMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendMessageResult, Unit]
  ): Request[SendMessageResult, AWSError] = js.native
  
  /**
    * Delivers up to ten messages to the specified queue. This is a batch version of  SendMessage. For a FIFO queue, multiple messages within a single batch are enqueued in the order they are sent. The result of sending each message is reported individually in the response. Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200. The maximum allowed individual message size and the maximum total payload size (the sum of the individual lengths of all of the batched messages) are both 256 KB (262,144 bytes).  A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:  #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF  Any characters not included in this list will be rejected. For more information, see the W3C specification for characters.  If you don't specify the DelaySeconds parameter for an entry, Amazon SQS uses the default value for the queue. Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second 
    */
  def sendMessageBatch(): Request[SendMessageBatchResult, AWSError] = js.native
  def sendMessageBatch(callback: js.Function2[/* err */ AWSError, /* data */ SendMessageBatchResult, Unit]): Request[SendMessageBatchResult, AWSError] = js.native
  /**
    * Delivers up to ten messages to the specified queue. This is a batch version of  SendMessage. For a FIFO queue, multiple messages within a single batch are enqueued in the order they are sent. The result of sending each message is reported individually in the response. Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200. The maximum allowed individual message size and the maximum total payload size (the sum of the individual lengths of all of the batched messages) are both 256 KB (262,144 bytes).  A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:  #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF  Any characters not included in this list will be rejected. For more information, see the W3C specification for characters.  If you don't specify the DelaySeconds parameter for an entry, Amazon SQS uses the default value for the queue. Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;AttributeName.1=first   &amp;AttributeName.2=second 
    */
  def sendMessageBatch(params: SendMessageBatchRequest): Request[SendMessageBatchResult, AWSError] = js.native
  def sendMessageBatch(
    params: SendMessageBatchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendMessageBatchResult, Unit]
  ): Request[SendMessageBatchResult, AWSError] = js.native
  
  /**
    * Sets the value of one or more queue attributes. When you change a queue's attributes, the change can take up to 60 seconds for most of the attributes to propagate throughout the Amazon SQS system. Changes made to the MessageRetentionPeriod attribute can take up to 15 minutes.    In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully.   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide.   To remove the ability to change queue permissions, you must deny permission to the AddPermission, RemovePermission, and SetQueueAttributes actions in your IAM policy.   
    */
  def setQueueAttributes(): Request[js.Object, AWSError] = js.native
  def setQueueAttributes(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the value of one or more queue attributes. When you change a queue's attributes, the change can take up to 60 seconds for most of the attributes to propagate throughout the Amazon SQS system. Changes made to the MessageRetentionPeriod attribute can take up to 15 minutes.    In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully.   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide.   To remove the ability to change queue permissions, you must deny permission to the AddPermission, RemovePermission, and SetQueueAttributes actions in your IAM policy.   
    */
  def setQueueAttributes(params: SetQueueAttributesRequest): Request[js.Object, AWSError] = js.native
  def setQueueAttributes(
    params: SetQueueAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Add cost allocation tags to the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide. When you use queue tags, keep the following guidelines in mind:   Adding more than 50 tags to a queue isn't recommended.   Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   For a full list of tag restrictions, see Limits Related to Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def tagQueue(): Request[js.Object, AWSError] = js.native
  def tagQueue(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Add cost allocation tags to the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide. When you use queue tags, keep the following guidelines in mind:   Adding more than 50 tags to a queue isn't recommended.   Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   For a full list of tag restrictions, see Limits Related to Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def tagQueue(params: TagQueueRequest): Request[js.Object, AWSError] = js.native
  def tagQueue(params: TagQueueRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Remove cost allocation tags from the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def untagQueue(): Request[js.Object, AWSError] = js.native
  def untagQueue(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Remove cost allocation tags from the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def untagQueue(params: UntagQueueRequest): Request[js.Object, AWSError] = js.native
  def untagQueue(params: UntagQueueRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}
