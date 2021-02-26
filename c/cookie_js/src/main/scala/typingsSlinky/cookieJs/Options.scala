package typingsSlinky.cookieJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var domain: String = js.native
  
  var expires: Double | String | js.Date = js.native
  
  var path: String = js.native
  
  var secure: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(domain: String, expires: Double | String | js.Date, path: String, secure: Boolean): Options = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: Double | String | js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresDate(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
  }
}
