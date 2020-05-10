package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsCreateOrUpdateSecretForRepoParams extends js.Object {
  /**
    * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get your public key](https://developer.github.com/v3/actions/secrets/#get-your-public-key) endpoint.
    */
  var encrypted_value: js.UndefOr[String] = js.native
  /**
    * ID of the key you used to encrypt the secret.
    */
  var key_id: js.UndefOr[String] = js.native
  var name: String = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ActionsCreateOrUpdateSecretForRepoParams {
  @scala.inline
  def apply(name: String, owner: String, repo: String): ActionsCreateOrUpdateSecretForRepoParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateOrUpdateSecretForRepoParams]
  }
  @scala.inline
  implicit class ActionsCreateOrUpdateSecretForRepoParamsOps[Self <: ActionsCreateOrUpdateSecretForRepoParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted_value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted_value")(js.undefined)
        ret
    }
    @scala.inline
    def withKey_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_id")(js.undefined)
        ret
    }
  }
  
}

