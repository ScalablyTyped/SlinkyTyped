package typingsSlinky.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadMultipartPartExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
    - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
    - typingsSlinky.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod.RequestTimeoutException
    - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
  */
  trait UploadMultipartPartExceptionsUnion extends StObject
  object UploadMultipartPartExceptionsUnion {
    
    @scala.inline
    def InvalidParameterValueException(
      name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InvalidParameterValueException
    ): typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    @scala.inline
    def MissingParameterValueException(
      name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.MissingParameterValueException
    ): typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException]
    }
    
    @scala.inline
    def RequestTimeoutException(name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException): typingsSlinky.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod.RequestTimeoutException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod.RequestTimeoutException]
    }
    
    @scala.inline
    def ResourceNotFoundException(
      name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException
    ): typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    @scala.inline
    def ServiceUnavailableException(
      name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ServiceUnavailableException
    ): typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException]
    }
  }
}
