package typingsSlinky.awsSdkClientSqsNode

import typingsSlinky.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesQueueDoesNotExistMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_QueueDoesNotExistDetails> * / any */ @js.native
  trait QueueDoesNotExist extends PurgeQueueExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist = js.native
  }
  object QueueDoesNotExist {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist): QueueDoesNotExist = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueDoesNotExist]
    }
    
    @scala.inline
    implicit class QueueDoesNotExistMutableBuilder[Self <: QueueDoesNotExist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueueDoesNotExistDetails extends StObject
}
