package typingsSlinky.firebaseAdmin.admin.auth

import typingsSlinky.firebaseAdmin.AnonEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the properties to update on the provided tenant.
  */
@js.native
trait UpdateTenantRequest extends js.Object {
  /**
    * The tenant display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email sign in configuration.
    */
  var emailSignInConfig: js.UndefOr[AnonEnabled] = js.native
}

object UpdateTenantRequest {
  @scala.inline
  def apply(): UpdateTenantRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTenantRequest]
  }
  @scala.inline
  implicit class UpdateTenantRequestOps[Self <: UpdateTenantRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailSignInConfig(value: AnonEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSignInConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailSignInConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSignInConfig")(js.undefined)
        ret
    }
  }
  
}

