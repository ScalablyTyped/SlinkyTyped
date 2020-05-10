package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersGetGpgKeyResponseSubkeysItem extends js.Object {
  var can_certify: Boolean = js.native
  var can_encrypt_comms: Boolean = js.native
  var can_encrypt_storage: Boolean = js.native
  var can_sign: Boolean = js.native
  var created_at: String = js.native
  var emails: js.Array[_] = js.native
  var expires_at: Null = js.native
  var id: Double = js.native
  var key_id: String = js.native
  var primary_key_id: Double = js.native
  var public_key: String = js.native
  var subkeys: js.Array[_] = js.native
}

object UsersGetGpgKeyResponseSubkeysItem {
  @scala.inline
  def apply(
    can_certify: Boolean,
    can_encrypt_comms: Boolean,
    can_encrypt_storage: Boolean,
    can_sign: Boolean,
    created_at: String,
    emails: js.Array[_],
    expires_at: Null,
    id: Double,
    key_id: String,
    primary_key_id: Double,
    public_key: String,
    subkeys: js.Array[_]
  ): UsersGetGpgKeyResponseSubkeysItem = {
    val __obj = js.Dynamic.literal(can_certify = can_certify.asInstanceOf[js.Any], can_encrypt_comms = can_encrypt_comms.asInstanceOf[js.Any], can_encrypt_storage = can_encrypt_storage.asInstanceOf[js.Any], can_sign = can_sign.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any], primary_key_id = primary_key_id.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], subkeys = subkeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetGpgKeyResponseSubkeysItem]
  }
  @scala.inline
  implicit class UsersGetGpgKeyResponseSubkeysItemOps[Self <: UsersGetGpgKeyResponseSubkeysItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_certify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_certify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_encrypt_comms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_encrypt_comms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_encrypt_storage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_encrypt_storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_sign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmails(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_at(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary_key_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_key_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubkeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subkeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

