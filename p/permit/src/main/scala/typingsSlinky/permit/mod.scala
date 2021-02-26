package typingsSlinky.permit

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("permit", "Basic")
  @js.native
  class Basic protected () extends Permit {
    def this(options: PermitOptions) = this()
  }
  
  @JSImport("permit", "Bearer")
  @js.native
  class Bearer protected () extends Permit {
    def this(options: BearerOptions) = this()
  }
  
  @JSImport("permit", "Permit")
  @js.native
  class Permit protected () extends StObject {
    def this(options: PermitOptions) = this()
    
    def check(req: IncomingMessage): Unit = js.native
    
    def fail(res: ServerResponse): Unit = js.native
  }
  
  @js.native
  trait BearerOptions extends PermitOptions {
    
    var basic: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var query: js.UndefOr[String] = js.native
  }
  object BearerOptions {
    
    @scala.inline
    def apply(): BearerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BearerOptions]
    }
    
    @scala.inline
    implicit class BearerOptionsMutableBuilder[Self <: BearerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasic(value: String): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  @js.native
  trait PermitOptions extends StObject {
    
    var proxy: js.UndefOr[String] = js.native
    
    var realm: js.UndefOr[String] = js.native
    
    var scheme: js.UndefOr[String] = js.native
  }
  object PermitOptions {
    
    @scala.inline
    def apply(): PermitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermitOptions]
    }
    
    @scala.inline
    implicit class PermitOptionsMutableBuilder[Self <: PermitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
}
