package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typingsSlinky.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReceiptHandleIsInvalidMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ReceiptHandleIsInvalidDetails> * / any */ @js.native
  trait ReceiptHandleIsInvalid
    extends ChangeMessageVisibilityExceptionsUnion
       with DeleteMessageExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid = js.native
  }
  object ReceiptHandleIsInvalid {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid): ReceiptHandleIsInvalid = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptHandleIsInvalid]
    }
    
    @scala.inline
    implicit class ReceiptHandleIsInvalidMutableBuilder[Self <: ReceiptHandleIsInvalid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReceiptHandleIsInvalidDetails extends StObject
}
