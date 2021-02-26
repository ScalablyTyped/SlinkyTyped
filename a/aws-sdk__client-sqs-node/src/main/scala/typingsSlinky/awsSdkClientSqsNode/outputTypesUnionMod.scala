package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchResultEntryMod.UnmarshalledChangeMessageVisibilityBatchResultEntry
import typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchResultEntryMod.UnmarshalledDeleteMessageBatchResultEntry
import typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchResultEntryMod.UnmarshalledSendMessageBatchResultEntry
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput
    - typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput
    - typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput
    - typingsSlinky.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput
    - typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput
    - typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
    - typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput
    - typingsSlinky.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput
    - typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput
    - typingsSlinky.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput
    - typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput
    - typingsSlinky.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput
    - typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput
    - typingsSlinky.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput
    - typingsSlinky.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput
    - typingsSlinky.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput
    - typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
    - typingsSlinky.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput
    - typingsSlinky.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput
    - typingsSlinky.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    @scala.inline
    def AddPermissionOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput]
    }
    
    @scala.inline
    def ChangeMessageVisibilityBatchOutput(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledChangeMessageVisibilityBatchResultEntry]
    ): typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput]
    }
    
    @scala.inline
    def ChangeMessageVisibilityOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput]
    }
    
    @scala.inline
    def CreateQueueOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput]
    }
    
    @scala.inline
    def DeleteMessageBatchOutput(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry]
    ): typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput]
    }
    
    @scala.inline
    def DeleteMessageOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput]
    }
    
    @scala.inline
    def DeleteQueueOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput]
    }
    
    @scala.inline
    def GetQueueAttributesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput]
    }
    
    @scala.inline
    def GetQueueUrlOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput]
    }
    
    @scala.inline
    def ListDeadLetterSourceQueuesOutput($metadata: ResponseMetadata, queueUrls: js.Array[String]): typingsSlinky.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], queueUrls = queueUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput]
    }
    
    @scala.inline
    def ListQueueTagsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput]
    }
    
    @scala.inline
    def ListQueuesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput]
    }
    
    @scala.inline
    def PurgeQueueOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput]
    }
    
    @scala.inline
    def ReceiveMessageOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput]
    }
    
    @scala.inline
    def RemovePermissionOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput]
    }
    
    @scala.inline
    def SendMessageBatchOutput(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledSendMessageBatchResultEntry]
    ): typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput]
    }
    
    @scala.inline
    def SendMessageOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput]
    }
    
    @scala.inline
    def SetQueueAttributesOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput]
    }
    
    @scala.inline
    def TagQueueOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput]
    }
    
    @scala.inline
    def UntagQueueOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput]
    }
  }
}
