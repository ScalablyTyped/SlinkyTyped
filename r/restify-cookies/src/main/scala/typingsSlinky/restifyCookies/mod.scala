package typingsSlinky.restifyCookies

import typingsSlinky.restifyCookies.restifyCookiesStrings.lax
import typingsSlinky.restifyCookies.restifyCookiesStrings.none
import typingsSlinky.restifyCookies.restifyCookiesStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restify-cookies", "parse")
  @js.native
  def parse(): js.Any = js.native
  
  /* augmented module */
  object restifyAugmentingMod {
    
    @js.native
    trait CookieOptions extends StObject {
      
      var domain: js.UndefOr[String] = js.native
      
      var encode: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
      
      var expires: js.UndefOr[js.Date] = js.native
      
      var httpOnly: js.UndefOr[Boolean] = js.native
      
      var maxAge: js.UndefOr[Double] = js.native
      
      var path: js.UndefOr[String] = js.native
      
      var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.native
      
      var secure: js.UndefOr[Boolean] = js.native
    }
    object CookieOptions {
      
      @scala.inline
      def apply(): CookieOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CookieOptions]
      }
      
      @scala.inline
      implicit class CookieOptionsMutableBuilder[Self <: CookieOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setEncode(value: /* input */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
        
        @scala.inline
        def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        @scala.inline
        def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
        
        @scala.inline
        def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
        
        @scala.inline
        def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      }
    }
    
    @js.native
    trait Request extends StObject {
      
      var cookies: js.Any = js.native
    }
    object Request {
      
      @scala.inline
      def apply(cookies: js.Any): Request = {
        val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCookies(value: js.Any): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Response extends StObject {
      
      def setCookie(key: String, `val`: String): Unit = js.native
      def setCookie(key: String, `val`: String, options: CookieOptions): Unit = js.native
    }
  }
}
