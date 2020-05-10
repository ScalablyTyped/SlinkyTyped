package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Respone of deleting account.
  */
@js.native
trait SchemaDeleteAccountResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#DeleteAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDeleteAccountResponse {
  @scala.inline
  def apply(): SchemaDeleteAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteAccountResponse]
  }
  @scala.inline
  implicit class SchemaDeleteAccountResponseOps[Self <: SchemaDeleteAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

