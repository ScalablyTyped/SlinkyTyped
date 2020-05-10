package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUndeleteServiceAccountResponse extends js.Object {
  /**
    * Metadata for the restored service account.
    */
  var restoredAccount: js.UndefOr[SchemaServiceAccount] = js.native
}

object SchemaUndeleteServiceAccountResponse {
  @scala.inline
  def apply(): SchemaUndeleteServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteServiceAccountResponse]
  }
  @scala.inline
  implicit class SchemaUndeleteServiceAccountResponseOps[Self <: SchemaUndeleteServiceAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestoredAccount(value: SchemaServiceAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoredAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoredAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoredAccount")(js.undefined)
        ret
    }
  }
  
}

