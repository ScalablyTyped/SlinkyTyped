package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.deleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchEntryIdsNotDistinctMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BatchEntryIdsNotDistinctDetails> * / any */ @js.native
  trait BatchEntryIdsNotDistinct
    extends ChangeMessageVisibilityBatchExceptionsUnion
       with DeleteMessageBatchExceptionsUnion
       with SendMessageBatchExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct = js.native
  }
  object BatchEntryIdsNotDistinct {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct): BatchEntryIdsNotDistinct = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchEntryIdsNotDistinct]
    }
    
    @scala.inline
    implicit class BatchEntryIdsNotDistinctMutableBuilder[Self <: BatchEntryIdsNotDistinct] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BatchEntryIdsNotDistinctDetails extends StObject
}
