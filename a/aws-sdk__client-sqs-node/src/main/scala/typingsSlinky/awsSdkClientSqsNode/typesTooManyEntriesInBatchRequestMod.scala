package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.deleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTooManyEntriesInBatchRequestMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TooManyEntriesInBatchRequestDetails> * / any */ @js.native
  trait TooManyEntriesInBatchRequest
    extends ChangeMessageVisibilityBatchExceptionsUnion
       with DeleteMessageBatchExceptionsUnion
       with SendMessageBatchExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.TooManyEntriesInBatchRequest = js.native
  }
  object TooManyEntriesInBatchRequest {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.TooManyEntriesInBatchRequest): TooManyEntriesInBatchRequest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooManyEntriesInBatchRequest]
    }
    
    @scala.inline
    implicit class TooManyEntriesInBatchRequestMutableBuilder[Self <: TooManyEntriesInBatchRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.TooManyEntriesInBatchRequest): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooManyEntriesInBatchRequestDetails extends StObject
}
