package typingsSlinky.googleapis.cloudshellV1Mod.cloudshellV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A public SSH key, corresponding to a private SSH key held by the client.
  */
@js.native
trait SchemaPublicKey extends js.Object {
  /**
    * Required. Format of this key&#39;s content.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Required. Content of this key.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Output only. Full name of this resource, in the format
    * `users/{owner_email}/environments/{environment_id}/publicKeys/{key_id}`.
    * `{owner_email}` is the email address of the user to whom the key belongs.
    * `{environment_id}` is the identifier of the environment to which the key
    * grants access. `{key_id}` is the unique identifier of the key. For
    * example,
    * `users/someone@example.com/environments/default/publicKeys/myKey`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPublicKey {
  @scala.inline
  def apply(): SchemaPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKey]
  }
  @scala.inline
  implicit class SchemaPublicKeyOps[Self <: SchemaPublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

