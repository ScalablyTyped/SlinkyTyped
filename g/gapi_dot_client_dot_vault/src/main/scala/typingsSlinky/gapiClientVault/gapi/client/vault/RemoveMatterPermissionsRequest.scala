package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveMatterPermissionsRequest extends js.Object {
  /** The account ID. */
  var accountId: js.UndefOr[String] = js.native
}

object RemoveMatterPermissionsRequest {
  @scala.inline
  def apply(): RemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveMatterPermissionsRequest]
  }
  @scala.inline
  implicit class RemoveMatterPermissionsRequestOps[Self <: RemoveMatterPermissionsRequest] (val x: Self) extends AnyVal {
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

