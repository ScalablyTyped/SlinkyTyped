package typingsSlinky.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteAliasExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
    - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
    - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait DeleteAliasExceptionsUnion extends StObject
  object DeleteAliasExceptionsUnion {
    
    @scala.inline
    def DependencyTimeoutException(
      name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DependencyTimeoutException
    ): typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
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
  }
}
