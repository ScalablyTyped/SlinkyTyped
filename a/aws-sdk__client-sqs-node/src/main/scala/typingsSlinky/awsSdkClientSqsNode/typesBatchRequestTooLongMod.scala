package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchRequestTooLongMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BatchRequestTooLongDetails> * / any */ @js.native
  trait BatchRequestTooLong extends SendMessageBatchExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong = js.native
  }
  object BatchRequestTooLong {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong): BatchRequestTooLong = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchRequestTooLong]
    }
    
    @scala.inline
    implicit class BatchRequestTooLongMutableBuilder[Self <: BatchRequestTooLong] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BatchRequestTooLongDetails extends StObject
}
