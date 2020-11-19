package typingsSlinky.roads

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cookie.mod.CookieSerializeOptions
import typingsSlinky.roads.responseMod.default
import typingsSlinky.roads.roadMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roads/types/middleware/cookie", JSImport.Namespace)
@js.native
object cookieMod extends js.Object {
  
  var default: Middleware = js.native
  
  @js.native
  class CookieResponse () extends default {
    
    def getCookies(): StringDictionary[String] = js.native
    
    def setCookie(name: String): Unit = js.native
    def setCookie(name: String, value: js.UndefOr[scala.Nothing], options: CookieSerializeOptions): Unit = js.native
    def setCookie(name: String, value: js.Any): Unit = js.native
    def setCookie(name: String, value: js.Any, options: CookieSerializeOptions): Unit = js.native
  }
}
