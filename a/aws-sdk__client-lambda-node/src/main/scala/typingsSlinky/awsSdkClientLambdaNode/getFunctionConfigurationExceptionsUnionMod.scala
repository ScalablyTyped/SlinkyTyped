package typingsSlinky.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFunctionConfigurationExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
    - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
    - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  */
  trait GetFunctionConfigurationExceptionsUnion extends StObject
  object GetFunctionConfigurationExceptionsUnion {
    
    @scala.inline
    def InvalidParameterValueException(
      name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidParameterValueException
    ): typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    @scala.inline
    def ResourceNotFoundException(name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException): typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
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
