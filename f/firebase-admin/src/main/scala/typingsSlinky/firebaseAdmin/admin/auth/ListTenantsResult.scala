package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the object returned from a
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listTenants `listTenants()`}
  * operation.
  * Contains the list of tenants for the current batch and the next page token if available.
  */
@js.native
trait ListTenantsResult extends js.Object {
  /**
    * The next page token if available. This is needed for the next batch download.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The list of {@link admin.auth.Tenant `Tenant`} objects for the downloaded batch.
    */
  var tenants: js.Array[Tenant] = js.native
}

object ListTenantsResult {
  @scala.inline
  def apply(tenants: js.Array[Tenant]): ListTenantsResult = {
    val __obj = js.Dynamic.literal(tenants = tenants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTenantsResult]
  }
  @scala.inline
  implicit class ListTenantsResultOps[Self <: ListTenantsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTenants(value: js.Array[Tenant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

