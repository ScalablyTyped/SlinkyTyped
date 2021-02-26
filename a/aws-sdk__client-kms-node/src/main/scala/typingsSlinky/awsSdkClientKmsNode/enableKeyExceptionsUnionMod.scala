package typingsSlinky.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableKeyExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
    - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
    - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait EnableKeyExceptionsUnion extends StObject
  object EnableKeyExceptionsUnion {
    
    @scala.inline
    def DependencyTimeoutException(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DependencyTimeoutException): typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def InvalidArnException(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidArnException): typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    @scala.inline
    def KMSInternalException(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInternalException): typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    @scala.inline
    def KMSInvalidStateException(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInvalidStateException): typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    @scala.inline
    def LimitExceededException(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.LimitExceededException): typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def NotFoundException(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.NotFoundException): typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
