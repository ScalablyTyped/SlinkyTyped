package typingsSlinky.googleAppsScriptOauth2

import typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.OAuth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object GoogleAppsScriptOAuth2 {
    
    @JSGlobal("GoogleAppsScriptOAuth2.TokenFormat")
    @js.native
    object TokenFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat with String
          ] = js.native
      
      /* "application/x-www-form-urlencoded" */ val FORM_URL_ENCODED: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat.FORM_URL_ENCODED with String = js.native
      
      /* "application/json" */ val JSON: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat.JSON with String = js.native
    }
  }
  
  @JSGlobal("OAuth2")
  @js.native
  def OAuth2: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.OAuth2 = js.native
  @scala.inline
  def OAuth2_=(x: OAuth2): Unit = js.Dynamic.global.updateDynamic("OAuth2")(x.asInstanceOf[js.Any])
}
