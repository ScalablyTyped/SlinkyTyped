package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsApproveRequest extends js.Object {
  /**
    * The approval URL that was shown to the user. Only the permissions shown to the user with that URL will be accepted, which may not be the product's
    * entire set of permissions. For example, the URL may only display new permissions from an update after the product was approved, or not include new
    * permissions if the product was updated since the URL was generated.
    */
  var approvalUrlInfo: js.UndefOr[ApprovalUrlInfo] = js.native
  /**
    * Sets how new permission requests for the product are handled. "allPermissions" automatically approves all current and future permissions for the
    * product. "currentPermissionsOnly" approves the current set of permissions for the product, but any future permissions added through updates will
    * require manual reapproval. If not specified, only the current set of permissions will be approved.
    */
  var approvedPermissions: js.UndefOr[String] = js.native
}

object ProductsApproveRequest {
  @scala.inline
  def apply(): ProductsApproveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductsApproveRequest]
  }
  @scala.inline
  implicit class ProductsApproveRequestOps[Self <: ProductsApproveRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalUrlInfo(value: ApprovalUrlInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalUrlInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalUrlInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalUrlInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovedPermissions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovedPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvedPermissions")(js.undefined)
        ret
    }
  }
  
}

