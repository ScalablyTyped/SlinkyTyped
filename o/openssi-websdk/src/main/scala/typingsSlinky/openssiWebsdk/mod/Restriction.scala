package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Restriction extends js.Object {
  var cred_def_id: js.UndefOr[CredentialDefinitionID] = js.native
  var issuer_did: js.UndefOr[DID] = js.native
  var schema_id: js.UndefOr[CredentialSchemaID] = js.native
  var schema_issuer_did: js.UndefOr[DID] = js.native
  var schema_name: js.UndefOr[String] = js.native
  var schema_version: js.UndefOr[String] = js.native
}

object Restriction {
  @scala.inline
  def apply(): Restriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Restriction]
  }
  @scala.inline
  implicit class RestrictionOps[Self <: Restriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCred_def_id(value: CredentialDefinitionID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cred_def_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCred_def_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cred_def_id")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer_did(value: DID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer_did")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer_did: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer_did")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema_id(value: CredentialSchemaID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema_issuer_did(value: DID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_issuer_did")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema_issuer_did: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_issuer_did")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_name")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema_version")(js.undefined)
        ret
    }
  }
  
}

