package typingsSlinky.awsSdkClientSqsNode

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
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
import typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchRequestEntryMod.ChangeMessageVisibilityBatchRequestEntry
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchRequestEntryMod.DeleteMessageBatchRequestEntry
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchRequestEntryMod.SendMessageBatchRequestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput
    - typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput
    - typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput
    - typingsSlinky.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput
    - typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput
    - typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
    - typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput
    - typingsSlinky.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput
    - typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput
    - typingsSlinky.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput
    - typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput
    - typingsSlinky.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput
    - typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput
    - typingsSlinky.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput
    - typingsSlinky.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput
    - typingsSlinky.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput
    - typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput
    - typingsSlinky.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput
    - typingsSlinky.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput
    - typingsSlinky.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def AddPermissionInput(
      AWSAccountIds: js.Array[String] | js.Iterable[String],
      Actions: js.Array[String] | js.Iterable[String],
      Label: String,
      QueueUrl: String
    ): typingsSlinky.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput = {
      val __obj = js.Dynamic.literal(AWSAccountIds = AWSAccountIds.asInstanceOf[js.Any], Actions = Actions.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput]
    }
    
    @scala.inline
    def ChangeMessageVisibilityBatchInput(
      Entries: js.Array[ChangeMessageVisibilityBatchRequestEntry] | js.Iterable[ChangeMessageVisibilityBatchRequestEntry],
      QueueUrl: String
    ): typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput]
    }
    
    @scala.inline
    def ChangeMessageVisibilityInput(QueueUrl: String, ReceiptHandle: String, VisibilityTimeout: Double): typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any], VisibilityTimeout = VisibilityTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput]
    }
    
    @scala.inline
    def CreateQueueInput(QueueName: String): typingsSlinky.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput = {
      val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput]
    }
    
    @scala.inline
    def DeleteMessageBatchInput(
      Entries: js.Array[DeleteMessageBatchRequestEntry] | js.Iterable[DeleteMessageBatchRequestEntry],
      QueueUrl: String
    ): typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput]
    }
    
    @scala.inline
    def DeleteMessageInput(QueueUrl: String, ReceiptHandle: String): typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput]
    }
    
    @scala.inline
    def DeleteQueueInput(QueueUrl: String): typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput]
    }
    
    @scala.inline
    def GetQueueAttributesInput(QueueUrl: String): typingsSlinky.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput]
    }
    
    @scala.inline
    def GetQueueUrlInput(QueueName: String): typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput = {
      val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput]
    }
    
    @scala.inline
    def ListDeadLetterSourceQueuesInput(QueueUrl: String): typingsSlinky.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput]
    }
    
    @scala.inline
    def ListQueueTagsInput(QueueUrl: String): typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput]
    }
    
    @scala.inline
    def ListQueuesInput(): typingsSlinky.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput]
    }
    
    @scala.inline
    def PurgeQueueInput(QueueUrl: String): typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput]
    }
    
    @scala.inline
    def ReceiveMessageInput(QueueUrl: String): typingsSlinky.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput]
    }
    
    @scala.inline
    def RemovePermissionInput(Label: String, QueueUrl: String): typingsSlinky.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput = {
      val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput]
    }
    
    @scala.inline
    def SendMessageBatchInput(
      Entries: js.Array[SendMessageBatchRequestEntry] | js.Iterable[SendMessageBatchRequestEntry],
      QueueUrl: String
    ): typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput]
    }
    
    @scala.inline
    def SendMessageInput(MessageBody: String, QueueUrl: String): typingsSlinky.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput = {
      val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput]
    }
    
    @scala.inline
    def SetQueueAttributesInput(
      Attributes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string}
      */ typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.SetQueueAttributesInput with TopLevel[js.Any]) | (js.Iterable[
          js.Tuple2[
            All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String, 
            String
          ]
        ]),
      QueueUrl: String
    ): typingsSlinky.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput = {
      val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput]
    }
    
    @scala.inline
    def TagQueueInput(QueueUrl: String, Tags: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): typingsSlinky.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput]
    }
    
    @scala.inline
    def UntagQueueInput(QueueUrl: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput]
    }
  }
}
