package typingsSlinky.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createQueueExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently
    - typingsSlinky.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists
  */
  trait CreateQueueExceptionsUnion extends StObject
  object CreateQueueExceptionsUnion {
    
    @scala.inline
    def QueueDeletedRecently(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDeletedRecently): typingsSlinky.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently]
    }
    
    @scala.inline
    def QueueNameExists(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists): typingsSlinky.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists]
    }
  }
}
