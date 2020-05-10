package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to sign out user.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySignOutUserRequest extends js.Object {
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartySignOutUserRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySignOutUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySignOutUserRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySignOutUserRequestOps[Self <: SchemaIdentitytoolkitRelyingpartySignOutUserRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
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

