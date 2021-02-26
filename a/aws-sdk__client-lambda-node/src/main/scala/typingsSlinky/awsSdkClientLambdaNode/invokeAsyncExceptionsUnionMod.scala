package typingsSlinky.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeAsyncExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
    - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsSlinky.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException
    - typingsSlinky.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException
  */
  trait InvokeAsyncExceptionsUnion extends StObject
  object InvokeAsyncExceptionsUnion {
    
    @scala.inline
    def InvalidRequestContentException(
      name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRequestContentException
    ): typingsSlinky.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException]
    }
    
    @scala.inline
    def InvalidRuntimeException(name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRuntimeException): typingsSlinky.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException]
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
  }
}
