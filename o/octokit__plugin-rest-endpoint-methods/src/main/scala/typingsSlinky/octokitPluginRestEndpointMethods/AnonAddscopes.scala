package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddscopes extends js.Object {
  var add_scopes: AnonType = js.native
  var authorization_id: AnonRequired = js.native
  var fingerprint: AnonType = js.native
  var note: AnonType = js.native
  var note_url: AnonType = js.native
  var remove_scopes: AnonType = js.native
  var scopes: AnonType = js.native
}

object AnonAddscopes {
  @scala.inline
  def apply(
    add_scopes: AnonType,
    authorization_id: AnonRequired,
    fingerprint: AnonType,
    note: AnonType,
    note_url: AnonType,
    remove_scopes: AnonType,
    scopes: AnonType
  ): AnonAddscopes = {
    val __obj = js.Dynamic.literal(add_scopes = add_scopes.asInstanceOf[js.Any], authorization_id = authorization_id.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], remove_scopes = remove_scopes.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddscopes]
  }
  @scala.inline
  implicit class AnonAddscopesOps[Self <: AnonAddscopes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd_scopes(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorization_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote_url(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove_scopes(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

