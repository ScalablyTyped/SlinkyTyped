package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addscopes extends js.Object {
  var add_scopes: Type = js.native
  var authorization_id: Required = js.native
  var fingerprint: Type = js.native
  var note: Type = js.native
  var note_url: Type = js.native
  var remove_scopes: Type = js.native
  var scopes: Type = js.native
}

object Addscopes {
  @scala.inline
  def apply(
    add_scopes: Type,
    authorization_id: Required,
    fingerprint: Type,
    note: Type,
    note_url: Type,
    remove_scopes: Type,
    scopes: Type
  ): Addscopes = {
    val __obj = js.Dynamic.literal(add_scopes = add_scopes.asInstanceOf[js.Any], authorization_id = authorization_id.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], remove_scopes = remove_scopes.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addscopes]
  }
  @scala.inline
  implicit class AddscopesOps[Self <: Addscopes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd_scopes(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorization_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote_url(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove_scopes(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

