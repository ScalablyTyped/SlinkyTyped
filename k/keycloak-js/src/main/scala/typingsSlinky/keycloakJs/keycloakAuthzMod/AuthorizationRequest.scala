package typingsSlinky.keycloakJs.keycloakAuthzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationRequest extends js.Object {
  /**
    * Defines whether or not this authorization request should include the current RPT. If set to true, the RPT will
    * be sent and permissions in the current RPT will be included in the new RPT. Otherwise, only the permissions referenced in this
    * authorization request will be granted in the new RPT.
    */
  var incrementalAuthorization: js.UndefOr[Boolean] = js.native
  /**
    * Defines additional information about this authorization request in order to specify how it should be processed
    * by the server.
    */
  var metadata: js.UndefOr[AuthorizationRequestMetadata] = js.native
  /**
    * An array of objects representing the resource and scopes.
    */
  var permissions: js.UndefOr[js.Array[ResourcePermission]] = js.native
  /**
    * A boolean value indicating whether the server should create permission requests to the resources
    * and scopes referenced by a permission ticket. This parameter will only take effect when used together
    * with the ticket parameter as part of a UMA authorization process.
    */
  var submitRequest: js.UndefOr[Boolean] = js.native
  /**
    * A permission ticket obtained from a resource server when using UMA authorization protocol.
    */
  var ticket: js.UndefOr[String] = js.native
}

object AuthorizationRequest {
  @scala.inline
  def apply(): AuthorizationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationRequest]
  }
  @scala.inline
  implicit class AuthorizationRequestOps[Self <: AuthorizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncrementalAuthorization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementalAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementalAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementalAuthorization")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: AuthorizationRequestMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[ResourcePermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withTicket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(js.undefined)
        ret
    }
  }
  
}

