package typingsSlinky.openssiWebsdk.mod

import typingsSlinky.openssiWebsdk.AnonAttributes
import typingsSlinky.openssiWebsdk.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credential extends js.Object {
  var credential_definition_id: CredentialDefinitionID = js.native
  var id: String = js.native
  var issuer_did: DID = js.native
  var offer: js.UndefOr[AnonAttributes] = js.native
  var properties: Properties = js.native
  var role: String = js.native
  var schema_name: String = js.native
  var schema_version: String = js.native
  var state: CredentialState = js.native
  var to: AnonName = js.native
}

object Credential {
  @scala.inline
  def apply(
    credential_definition_id: CredentialDefinitionID,
    id: String,
    issuer_did: DID,
    properties: Properties,
    role: String,
    schema_name: String,
    schema_version: String,
    state: CredentialState,
    to: AnonName
  ): Credential = {
    val __obj = js.Dynamic.literal(credential_definition_id = credential_definition_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issuer_did = issuer_did.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], schema_name = schema_name.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
  @scala.inline
  implicit class CredentialOps[Self <: Credential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredential_definition_id(value: CredentialDefinitionID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential_definition_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer_did(value: DID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer_did")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: CredentialState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffer(value: AnonAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offer")(js.undefined)
        ret
    }
  }
  
}

