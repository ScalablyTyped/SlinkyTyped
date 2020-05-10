package typingsSlinky.keycloakJs.keycloakAuthzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationRequestMetadata extends js.Object {
  /**
    * A boolean value indicating to the server if resource names should be included in the RPT’s permissions.
    * If false, only the resource identifier is included.
    */
  var responseIncludeResourceName: js.UndefOr[js.Any] = js.native
  /**
    * An integer N that defines a limit for the amount of permissions an RPT can have. When used together with
    * rpt parameter, only the last N requested permissions will be kept in the RPT.
    */
  var response_permissions_limit: js.UndefOr[Double] = js.native
}

object AuthorizationRequestMetadata {
  @scala.inline
  def apply(): AuthorizationRequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationRequestMetadata]
  }
  @scala.inline
  implicit class AuthorizationRequestMetadataOps[Self <: AuthorizationRequestMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseIncludeResourceName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseIncludeResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseIncludeResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseIncludeResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_permissions_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_permissions_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_permissions_limit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_permissions_limit")(js.undefined)
        ret
    }
  }
  
}

