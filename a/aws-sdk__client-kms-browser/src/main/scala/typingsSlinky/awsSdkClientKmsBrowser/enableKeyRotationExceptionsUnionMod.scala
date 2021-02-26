package typingsSlinky.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableKeyRotationExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
    - typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException
    - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
    - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
    - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
    - typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException
  */
  trait EnableKeyRotationExceptionsUnion extends StObject
  object EnableKeyRotationExceptionsUnion {
    
    @scala.inline
    def DependencyTimeoutException(
      name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DependencyTimeoutException
    ): typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def DisabledException(name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DisabledException): typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDisabledExceptionMod.DisabledException]
    }
    
    @scala.inline
    def InvalidArnException(name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidArnException): typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    @scala.inline
    def KMSInternalException(name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInternalException): typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    @scala.inline
    def KMSInvalidStateException(name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInvalidStateException): typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    @scala.inline
    def NotFoundException(name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.NotFoundException): typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
    
    @scala.inline
    def UnsupportedOperationException(
      name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.UnsupportedOperationException
    ): typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesUnsupportedOperationExceptionMod.UnsupportedOperationException]
    }
  }
}
