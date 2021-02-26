package typingsSlinky.gapi

import typingsSlinky.gapi.anon.Authuser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiOAuth2TokenSessionState extends StObject {
  
  var extraQueryParams: Authuser = js.native
}
object GoogleApiOAuth2TokenSessionState {
  
  @scala.inline
  def apply(extraQueryParams: Authuser): GoogleApiOAuth2TokenSessionState = {
    val __obj = js.Dynamic.literal(extraQueryParams = extraQueryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiOAuth2TokenSessionState]
  }
  
  @scala.inline
  implicit class GoogleApiOAuth2TokenSessionStateMutableBuilder[Self <: GoogleApiOAuth2TokenSessionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraQueryParams(value: Authuser): Self = StObject.set(x, "extraQueryParams", value.asInstanceOf[js.Any])
  }
}
