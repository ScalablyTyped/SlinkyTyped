package typingsSlinky.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendMessageExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents
    - typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation
  */
  trait SendMessageExceptionsUnion extends StObject
  object SendMessageExceptionsUnion {
    
    @scala.inline
    def InvalidMessageContents(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidMessageContents): typingsSlinky.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents]
    }
    
    @scala.inline
    def UnsupportedOperation(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation): typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation]
    }
  }
}
