package typingsSlinky.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersOptions extends BaseClientOptions {
  
  var headers: js.UndefOr[js.Any] = js.native
}
object UsersOptions {
  
  @scala.inline
  def apply(baseUrl: String): UsersOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersOptions]
  }
  
  @scala.inline
  implicit class UsersOptionsMutableBuilder[Self <: UsersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
