package typingsSlinky.firebaseFirestore.apiCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.apiCredentialsMod.FirstPartyCredentialsSettings
  - typingsSlinky.firebaseFirestore.apiCredentialsMod.ProviderCredentialsSettings
*/
trait CredentialsSettings extends js.Object

object CredentialsSettings {
  @scala.inline
  implicit def apply(value: FirstPartyCredentialsSettings): CredentialsSettings = value.asInstanceOf[CredentialsSettings]
  @scala.inline
  implicit def apply(value: ProviderCredentialsSettings): CredentialsSettings = value.asInstanceOf[CredentialsSettings]
}

