package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewPermissionsEvent extends js.Object {
  /**
    * The set of permissions that the enterprise admin has already approved for this application. Use Permissions.Get on the EMM API to retrieve details
    * about these permissions.
    */
  var approvedPermissions: js.UndefOr[js.Array[String]] = js.native
  /** The id of the product (e.g. "app:com.google.android.gm") for which new permissions were added. This field will always be present. */
  var productId: js.UndefOr[String] = js.native
  /** The set of permissions that the app is currently requesting. Use Permissions.Get on the EMM API to retrieve details about these permissions. */
  var requestedPermissions: js.UndefOr[js.Array[String]] = js.native
}

object NewPermissionsEvent {
  @scala.inline
  def apply(): NewPermissionsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewPermissionsEvent]
  }
  @scala.inline
  implicit class NewPermissionsEventOps[Self <: NewPermissionsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovedPermissions(value: js.Array[String]): Self = {
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
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedPermissions")(js.undefined)
        ret
    }
  }
  
}

