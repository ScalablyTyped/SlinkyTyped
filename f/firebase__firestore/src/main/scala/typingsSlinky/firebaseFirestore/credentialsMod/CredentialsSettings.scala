package typingsSlinky.firebaseFirestore.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.credentialsMod.FirstPartyCredentialsSettings
  - typingsSlinky.firebaseFirestore.credentialsMod.ProviderCredentialsSettings
*/
trait CredentialsSettings extends js.Object

object CredentialsSettings {
  @scala.inline
  implicit def apply(value: FirstPartyCredentialsSettings): CredentialsSettings = value.asInstanceOf[CredentialsSettings]
  @scala.inline
  implicit def apply(value: ProviderCredentialsSettings): CredentialsSettings = value.asInstanceOf[CredentialsSettings]
}

