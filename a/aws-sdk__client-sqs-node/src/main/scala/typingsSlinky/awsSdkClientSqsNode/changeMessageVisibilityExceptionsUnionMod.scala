package typingsSlinky.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeMessageVisibilityExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight
    - typingsSlinky.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
  */
  trait ChangeMessageVisibilityExceptionsUnion extends StObject
  object ChangeMessageVisibilityExceptionsUnion {
    
    @scala.inline
    def MessageNotInflight(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight): typingsSlinky.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight]
    }
    
    @scala.inline
    def ReceiptHandleIsInvalid(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid): typingsSlinky.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid]
    }
  }
}
