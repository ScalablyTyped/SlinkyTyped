package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEntitlementsUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  /**
    * The ID of the entitlement (a product ID), e.g.
    * "app:com.google.android.gm".
    */
  var entitlementId: js.UndefOr[String] = js.native
  /**
    * Set to true to also install the product on all the user's devices where
    * possible. Failure to install on one or more devices will not prevent this
    * operation from returning successfully, as long as the entitlement was
    * successfully assigned to the user.
    */
  var install: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEntitlement] = js.native
  /**
    * The ID of the user.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsResourceEntitlementsUpdate {
  @scala.inline
  def apply(): ParamsResourceEntitlementsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEntitlementsUpdate]
  }
  @scala.inline
  implicit class ParamsResourceEntitlementsUpdateOps[Self <: ParamsResourceEntitlementsUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseId")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitlementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlementId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaEntitlement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

