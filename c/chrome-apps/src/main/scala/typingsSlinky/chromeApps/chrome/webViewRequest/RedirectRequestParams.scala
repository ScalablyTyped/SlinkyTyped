package typingsSlinky.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectRequestParams extends StObject {
  
  /** Destination to where the request is redirected. */
  var redirectUrl: String = js.native
}
object RedirectRequestParams {
  
  @scala.inline
  def apply(redirectUrl: String): RedirectRequestParams = {
    val __obj = js.Dynamic.literal(redirectUrl = redirectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequestParams]
  }
  
  @scala.inline
  implicit class RedirectRequestParamsMutableBuilder[Self <: RedirectRequestParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
  }
}
