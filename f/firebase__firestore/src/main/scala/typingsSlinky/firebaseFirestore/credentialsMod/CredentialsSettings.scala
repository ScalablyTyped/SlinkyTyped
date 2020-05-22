package typingsSlinky.firebaseFirestore.credentialsMod

import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.gapi
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.provider
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
  def FirstPartyCredentialsSettings(client: js.Any, sessionIndex: String, `type`: gapi): CredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], sessionIndex = sessionIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsSettings]
  }
  @scala.inline
  def ProviderCredentialsSettings(client: CredentialsProvider, `type`: provider): CredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsSettings]
  }
}

