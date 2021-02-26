package typingsSlinky.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revokeGrantExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
    - typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod.InvalidGrantIdException
    - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typingsSlinky.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait RevokeGrantExceptionsUnion extends StObject
  object RevokeGrantExceptionsUnion {
    
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
    def InvalidGrantIdException(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantIdException): typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod.InvalidGrantIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod.InvalidGrantIdException]
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
    def NotFoundException(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.NotFoundException): typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
