package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEncryptedvalue extends js.Object {
  var encrypted_value: AnonType = js.native
  var key_id: AnonType = js.native
  var name: AnonRequired = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
}

object AnonEncryptedvalue {
  @scala.inline
  def apply(
    encrypted_value: AnonType,
    key_id: AnonType,
    name: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonEncryptedvalue = {
    val __obj = js.Dynamic.literal(encrypted_value = encrypted_value.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncryptedvalue]
  }
  @scala.inline
  implicit class AnonEncryptedvalueOps[Self <: AnonEncryptedvalue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncrypted_value(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey_id(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

