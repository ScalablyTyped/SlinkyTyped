package typingsSlinky.awsSdkSmithyClient

import typingsSlinky.awsSdkSmithyClient.awsSdkSmithyClientStrings.client
import typingsSlinky.awsSdkSmithyClient.awsSdkSmithyClientStrings.server
import typingsSlinky.awsSdkSmithyClient.retryableTraitMod.RetryableTrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionMod {
  
  @js.native
  trait SmithyException extends StObject {
    
    /**
      * Whether the client or server are at fault.
      */
    @JSName("$fault")
    val $fault: client | server = js.native
    
    /**
      * Indicates that an error MAY be retried by the client.
      */
    @JSName("$retryable")
    val $retryable: js.UndefOr[RetryableTrait] = js.native
    
    /**
      * The service that encountered the exception.
      */
    @JSName("$service")
    val $service: js.UndefOr[String] = js.native
    
    /**
      * The shape ID name of the exception.
      */
    val name: String = js.native
  }
  object SmithyException {
    
    @scala.inline
    def apply($fault: client | server, name: String): SmithyException = {
      val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmithyException]
    }
    
    @scala.inline
    implicit class SmithyExceptionMutableBuilder[Self <: SmithyException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$fault(value: client | server): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$retryable(value: RetryableTrait): Self = StObject.set(x, "$retryable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$retryableUndefined: Self = StObject.set(x, "$retryable", js.undefined)
      
      @scala.inline
      def set$service(value: String): Self = StObject.set(x, "$service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$serviceUndefined: Self = StObject.set(x, "$service", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
