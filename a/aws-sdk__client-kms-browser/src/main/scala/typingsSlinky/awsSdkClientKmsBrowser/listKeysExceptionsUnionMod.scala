package typingsSlinky.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listKeysExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
    - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException
  */
  trait ListKeysExceptionsUnion extends StObject
  object ListKeysExceptionsUnion {
    
    @scala.inline
    def DependencyTimeoutException(
      name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DependencyTimeoutException
    ): typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    @scala.inline
    def InvalidMarkerException(name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException): typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod.InvalidMarkerException]
    }
    
    @scala.inline
    def KMSInternalException(name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInternalException): typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException]
    }
  }
}
