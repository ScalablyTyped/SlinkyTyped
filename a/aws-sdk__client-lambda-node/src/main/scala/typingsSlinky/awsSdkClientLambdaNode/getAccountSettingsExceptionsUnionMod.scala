package typingsSlinky.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccountSettingsExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
    - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  */
  trait GetAccountSettingsExceptionsUnion extends StObject
  object GetAccountSettingsExceptionsUnion {
    
    @scala.inline
    def ServiceException(name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ServiceException): typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException]
    }
    
    @scala.inline
    def TooManyRequestsException(name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.TooManyRequestsException): typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
