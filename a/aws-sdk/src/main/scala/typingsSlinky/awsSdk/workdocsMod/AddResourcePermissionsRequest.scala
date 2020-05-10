package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddResourcePermissionsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The notification options.
    */
  var NotificationOptions: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.NotificationOptions] = js.native
  /**
    * The users, groups, or organization being granted permission.
    */
  var Principals: SharePrincipalList = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}

object AddResourcePermissionsRequest {
  @scala.inline
  def apply(Principals: SharePrincipalList, ResourceId: ResourceIdType): AddResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(Principals = Principals.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResourcePermissionsRequest]
  }
  @scala.inline
  implicit class AddResourcePermissionsRequestOps[Self <: AddResourcePermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrincipals(value: SharePrincipalList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: ResourceIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationToken(value: AuthenticationHeaderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationOptions(value: NotificationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationOptions")(js.undefined)
        ret
    }
  }
  
}

