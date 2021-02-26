package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeStreamExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  */
  trait DescribeStreamExceptionsUnion extends StObject
  object DescribeStreamExceptionsUnion {
    
    @scala.inline
    def LimitExceededException(
      name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LimitExceededException
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException]
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
