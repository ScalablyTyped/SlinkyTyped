package typingsSlinky.googleAppsScriptOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var OAuth2: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.OAuth2 = js.native
  @js.native
  object GoogleAppsScriptOAuth2 extends js.Object {
    @js.native
    object StateParameterLocation extends js.Object {
      /* 0 */ val AUTHORIZATION_URL: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.StateParameterLocation.AUTHORIZATION_URL with Double = js.native
      /* 1 */ val REDIRECT_URL: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.StateParameterLocation.REDIRECT_URL with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.StateParameterLocation with Double
          ] = js.native
    }
    
    @js.native
    object TokenFormat extends js.Object {
      /* 1 */ val FORM_URL_ENCODED: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat.FORM_URL_ENCODED with Double = js.native
      /* 0 */ val JSON: typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat.JSON with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat with Double
          ] = js.native
    }
    
  }
  
}

