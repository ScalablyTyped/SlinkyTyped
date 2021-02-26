package typingsSlinky.ipify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get your public IP address.
  @returns An IP address.
  @example
  ```
  import ipify = require('ipify');
  (async () => {
  	console.log(await ipify());
  	//=> '2001:0db8:85a3:0000:0000:8a2e:0370:7334'
  	console.log(await ipify({useIPv6: false});
  	//=> '82.142.31.236'
  })();
  ```
  */
  @JSImport("ipify", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[String] = js.native
  @JSImport("ipify", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Custom API endpoint.
    		@default 'https://api6.ipify.org'
    		*/
    val endpoint: js.UndefOr[String] = js.native
    
    /**
    		Use the IPv6 API endpoint. The IPv6 endpoint will return an IPv6 address if available, IPv4 address otherwise.
    		Setting the `endpoint` option will override this.
    		@default true
    		*/
    val useIPv6: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setUseIPv6(value: Boolean): Self = StObject.set(x, "useIPv6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseIPv6Undefined: Self = StObject.set(x, "useIPv6", js.undefined)
    }
  }
}
