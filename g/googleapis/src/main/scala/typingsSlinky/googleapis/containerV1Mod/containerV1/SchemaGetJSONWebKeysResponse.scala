package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GetJSONWebKeysResponse is a valid JSON Web Key Set as specififed in rfc
  * 7517
  */
@js.native
trait SchemaGetJSONWebKeysResponse extends js.Object {
  /**
    * The public component of the keys used by the cluster to sign token
    * requests.
    */
  var keys: js.UndefOr[js.Array[SchemaJwk]] = js.native
}

object SchemaGetJSONWebKeysResponse {
  @scala.inline
  def apply(): SchemaGetJSONWebKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetJSONWebKeysResponse]
  }
  @scala.inline
  implicit class SchemaGetJSONWebKeysResponseOps[Self <: SchemaGetJSONWebKeysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeys(value: js.Array[SchemaJwk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
  }
  
}

