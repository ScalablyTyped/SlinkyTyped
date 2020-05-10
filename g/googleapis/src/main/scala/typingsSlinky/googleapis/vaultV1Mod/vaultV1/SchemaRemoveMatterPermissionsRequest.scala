package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remove an account as a matter collaborator.
  */
@js.native
trait SchemaRemoveMatterPermissionsRequest extends js.Object {
  /**
    * The account ID.
    */
  var accountId: js.UndefOr[String] = js.native
}

object SchemaRemoveMatterPermissionsRequest {
  @scala.inline
  def apply(): SchemaRemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveMatterPermissionsRequest]
  }
  @scala.inline
  implicit class SchemaRemoveMatterPermissionsRequestOps[Self <: SchemaRemoveMatterPermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
  }
  
}

