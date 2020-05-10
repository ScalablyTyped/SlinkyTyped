package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of signing out user.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySignOutUserResponse extends js.Object {
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartySignOutUserResponse {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySignOutUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySignOutUserResponseOps[Self <: SchemaIdentitytoolkitRelyingpartySignOutUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(js.undefined)
        ret
    }
  }
  
}

