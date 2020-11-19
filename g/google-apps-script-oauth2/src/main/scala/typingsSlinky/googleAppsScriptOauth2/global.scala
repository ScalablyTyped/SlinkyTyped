package typingsSlinky.googleAppsScriptOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var OAuth2: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.OAuth2 = js.native
  
  @js.native
  object GoogleAppsScriptOAuth2 extends js.Object {
    
    @js.native
    object TokenFormat extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat with String
          ] = js.native
      
      /* "application/x-www-form-urlencoded" */ val FORM_URL_ENCODED: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat.FORM_URL_ENCODED with String = js.native
      
      /* "application/json" */ val JSON: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat.JSON with String = js.native
    }
  }
}
