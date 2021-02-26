package typingsSlinky.csurf

import typingsSlinky.csurf.mod.CookieOptions
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cookie extends StObject {
    
    /**
      * @default false
      */
    var cookie: js.UndefOr[CookieOptions | Boolean] = js.native
    
    var ignoreMethods: js.UndefOr[js.Array[String]] = js.native
    
    var sessionKey: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary, _, _, ParsedQs], String]] = js.native
  }
  object Cookie {
    
    @scala.inline
    def apply(): Cookie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: CookieOptions | Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setIgnoreMethods(value: js.Array[String]): Self = StObject.set(x, "ignoreMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreMethodsUndefined: Self = StObject.set(x, "ignoreMethods", js.undefined)
      
      @scala.inline
      def setIgnoreMethodsVarargs(value: String*): Self = StObject.set(x, "ignoreMethods", js.Array(value :_*))
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setValue(value: /* req */ Request[ParamsDictionary, _, _, ParsedQs] => String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
