package typingsSlinky.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transport {
  
  @JSImport("dav", "transport.Basic")
  @js.native
  class Basic protected () extends Transport {
    /**
      * Create a new Basic object. This sends dav requests using http basic authentication.
      * @param credentials user authorization.
      */
    def this(credentials: Credentials) = this()
  }
  
  /**
    * Create a new OAuth2 object.This sends dav requests authorized via rfc 6749 oauth2.
    * @param credentials user authorization.
    */
  @JSImport("dav", "transport.OAuth2")
  @js.native
  class OAuth2 protected () extends Transport {
    def this(credentials: Credentials) = this()
  }
  
  @JSImport("dav", "transport.Transport")
  @js.native
  class Transport protected () extends StObject {
    /**
      * @param credentials user authorization.
      */
    def this(credentials: Credentials) = this()
    
    def send(request: Request_, url: String): js.Promise[_] = js.native
    def send(request: Request_, url: String, options: TransportOptions): js.Promise[_] = js.native
  }
  
  @js.native
  trait TransportOptions extends StObject {
    
    var retry: js.UndefOr[Boolean] = js.native
    
    /**
      *  request sandbox.
      */
    var sandbox: js.UndefOr[Sandbox] = js.native
  }
  object TransportOptions {
    
    @scala.inline
    def apply(): TransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportOptions]
    }
    
    @scala.inline
    implicit class TransportOptionsMutableBuilder[Self <: TransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSandbox(value: Sandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    }
  }
}
