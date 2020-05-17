package typingsSlinky.googleAppsScriptOauth2.GoogleAppsScriptOAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StateParameterLocation extends js.Object

@JSGlobal("GoogleAppsScriptOAuth2.StateParameterLocation")
@js.native
object StateParameterLocation extends js.Object {
  /**
    * Pass the state parameter in the authorization URL.
    */
  @js.native
  sealed trait AUTHORIZATION_URL extends StateParameterLocation
  
  /**
    * Pass the state token in the redirect URL, as a workaround for APIs that don't support the state parameter.
    */
  @js.native
  sealed trait REDIRECT_URL extends StateParameterLocation
  
}

