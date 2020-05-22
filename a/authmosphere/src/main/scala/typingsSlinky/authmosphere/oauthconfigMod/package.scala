package typingsSlinky.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oauthconfigMod {
  type AuthorizationCodeGrantConfig = typingsSlinky.authmosphere.oauthconfigMod.CredentialsConfig with typingsSlinky.authmosphere.oauthconfigMod.GrantConfigBase with typingsSlinky.authmosphere.anon.Code
  type ClientCredentialsGrantConfig = typingsSlinky.authmosphere.oauthconfigMod.CredentialsConfig with typingsSlinky.authmosphere.oauthconfigMod.GrantConfigBase
  type CredentialsPasswordConfig = typingsSlinky.authmosphere.oauthconfigMod.CredentialsDirConfig | typingsSlinky.authmosphere.oauthconfigMod.CredentialsUserClientConfig
  type CredentialsUserClientConfig = typingsSlinky.authmosphere.oauthconfigMod.CredentialsClientConfig with typingsSlinky.authmosphere.oauthconfigMod.CredentialsUserConfig
  type OAuthConfig = typingsSlinky.authmosphere.oauthconfigMod.ClientCredentialsGrantConfig | typingsSlinky.authmosphere.oauthconfigMod.AuthorizationCodeGrantConfig | typingsSlinky.authmosphere.oauthconfigMod.PasswordCredentialsGrantConfig | typingsSlinky.authmosphere.oauthconfigMod.RefreshGrantConfig
  type PasswordCredentialsGrantConfig = typingsSlinky.authmosphere.oauthconfigMod.CredentialsPasswordConfig with typingsSlinky.authmosphere.oauthconfigMod.GrantConfigBase
  type RefreshGrantConfig = typingsSlinky.authmosphere.oauthconfigMod.CredentialsConfig with typingsSlinky.authmosphere.oauthconfigMod.GrantConfigBase with typingsSlinky.authmosphere.anon.RefreshToken
  type TokenCacheOAuthConfig = (typingsSlinky.authmosphere.oauthconfigMod.ClientCredentialsGrantConfig | typingsSlinky.authmosphere.oauthconfigMod.PasswordCredentialsGrantConfig) with typingsSlinky.authmosphere.anon.TokenInfoEndpoint
}
