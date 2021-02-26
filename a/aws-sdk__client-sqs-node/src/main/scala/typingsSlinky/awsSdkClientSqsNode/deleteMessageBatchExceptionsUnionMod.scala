package typingsSlinky.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteMessageBatchExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest
    - typingsSlinky.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest
    - typingsSlinky.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct
    - typingsSlinky.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId
  */
  trait DeleteMessageBatchExceptionsUnion extends StObject
  object DeleteMessageBatchExceptionsUnion {
    
    @scala.inline
    def BatchEntryIdsNotDistinct(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct): typingsSlinky.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct]
    }
    
    @scala.inline
    def EmptyBatchRequest(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest): typingsSlinky.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest]
    }
    
    @scala.inline
    def InvalidBatchEntryId(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidBatchEntryId): typingsSlinky.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId]
    }
    
    @scala.inline
    def TooManyEntriesInBatchRequest(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.TooManyEntriesInBatchRequest): typingsSlinky.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest]
    }
  }
}
