package typingsSlinky.authmosphere.oauthconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.authmosphere.oauthconfigMod.CredentialsDirConfig
  - typingsSlinky.authmosphere.oauthconfigMod.CredentialsClientConfig
*/
trait CredentialsConfig extends js.Object

object CredentialsConfig {
  @scala.inline
  implicit def apply(value: CredentialsClientConfig): CredentialsConfig = value.asInstanceOf[CredentialsConfig]
  @scala.inline
  implicit def apply(value: CredentialsDirConfig): CredentialsConfig = value.asInstanceOf[CredentialsConfig]
}

