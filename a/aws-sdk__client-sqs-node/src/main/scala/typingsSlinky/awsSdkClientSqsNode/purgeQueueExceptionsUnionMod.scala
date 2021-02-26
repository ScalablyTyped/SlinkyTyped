package typingsSlinky.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object purgeQueueExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist
    - typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress
  */
  trait PurgeQueueExceptionsUnion extends StObject
  object PurgeQueueExceptionsUnion {
    
    @scala.inline
    def PurgeQueueInProgress(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress): typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress]
    }
    
    @scala.inline
    def QueueDoesNotExist(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist): typingsSlinky.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist]
    }
  }
}
