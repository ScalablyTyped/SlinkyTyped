package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.deleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEmptyBatchRequestMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_EmptyBatchRequestDetails> * / any */ @js.native
  trait EmptyBatchRequest
    extends ChangeMessageVisibilityBatchExceptionsUnion
       with DeleteMessageBatchExceptionsUnion
       with SendMessageBatchExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest = js.native
  }
  object EmptyBatchRequest {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest): EmptyBatchRequest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmptyBatchRequest]
    }
    
    @scala.inline
    implicit class EmptyBatchRequestMutableBuilder[Self <: EmptyBatchRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmptyBatchRequestDetails extends StObject
}
