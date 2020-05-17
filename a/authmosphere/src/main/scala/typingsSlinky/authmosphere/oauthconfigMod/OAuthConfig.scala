package typingsSlinky.authmosphere.oauthconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.authmosphere.oauthconfigMod.ClientCredentialsGrantConfig
  - typingsSlinky.authmosphere.oauthconfigMod.AuthorizationCodeGrantConfig
  - typingsSlinky.authmosphere.oauthconfigMod.PasswordCredentialsGrantConfig
  - typingsSlinky.authmosphere.oauthconfigMod.RefreshGrantConfig
*/
trait OAuthConfig extends js.Object

object OAuthConfig {
  @scala.inline
  implicit def apply(value: AuthorizationCodeGrantConfig | ClientCredentialsGrantConfig | RefreshGrantConfig): OAuthConfig = value.asInstanceOf[OAuthConfig]
  @scala.inline
  implicit def apply(value: PasswordCredentialsGrantConfig): OAuthConfig = value.asInstanceOf[OAuthConfig]
}

