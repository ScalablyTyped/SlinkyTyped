package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account keys list response.
  */
@js.native
trait SchemaListServiceAccountKeysResponse extends js.Object {
  /**
    * The public keys for the service account.
    */
  var keys: js.UndefOr[js.Array[SchemaServiceAccountKey]] = js.native
}

object SchemaListServiceAccountKeysResponse {
  @scala.inline
  def apply(): SchemaListServiceAccountKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceAccountKeysResponse]
  }
  @scala.inline
  implicit class SchemaListServiceAccountKeysResponseOps[Self <: SchemaListServiceAccountKeysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeys(value: js.Array[SchemaServiceAccountKey]): Self = {
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

