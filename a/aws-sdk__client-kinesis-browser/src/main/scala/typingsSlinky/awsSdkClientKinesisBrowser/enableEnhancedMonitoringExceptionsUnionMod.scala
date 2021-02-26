package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableEnhancedMonitoringExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
    - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
    - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  */
  trait EnableEnhancedMonitoringExceptionsUnion extends StObject
  object EnableEnhancedMonitoringExceptionsUnion {
    
    @scala.inline
    def InvalidArgumentException(
      name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.InvalidArgumentException
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException]
    }
    
    @scala.inline
    def LimitExceededException(
      name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LimitExceededException
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def ResourceInUseException(
      name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceInUseException
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException]
    }
    
    @scala.inline
    def ResourceNotFoundException(
      name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ResourceNotFoundException
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
  }
}
