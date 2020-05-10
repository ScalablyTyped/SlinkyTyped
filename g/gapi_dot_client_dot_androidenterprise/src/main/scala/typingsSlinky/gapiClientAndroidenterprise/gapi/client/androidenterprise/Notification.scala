package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  /** Notifications about new app restrictions schema changes. */
  var appRestrictionsSchemaChangeEvent: js.UndefOr[AppRestrictionsSchemaChangeEvent] = js.native
  /** Notifications about app updates. */
  var appUpdateEvent: js.UndefOr[AppUpdateEvent] = js.native
  /** The ID of the enterprise for which the notification is sent. This will always be present. */
  var enterpriseId: js.UndefOr[String] = js.native
  /** Notifications about an app installation failure. */
  var installFailureEvent: js.UndefOr[InstallFailureEvent] = js.native
  /** Notifications about new devices. */
  var newDeviceEvent: js.UndefOr[NewDeviceEvent] = js.native
  /** Notifications about new app permissions. */
  var newPermissionsEvent: js.UndefOr[NewPermissionsEvent] = js.native
  /** Type of the notification. */
  var notificationType: js.UndefOr[String] = js.native
  /** Notifications about changes to a product's approval status. */
  var productApprovalEvent: js.UndefOr[ProductApprovalEvent] = js.native
  /** Notifications about product availability changes. */
  var productAvailabilityChangeEvent: js.UndefOr[ProductAvailabilityChangeEvent] = js.native
  /** The time when the notification was published in milliseconds since 1970-01-01T00:00:00Z. This will always be present. */
  var timestampMillis: js.UndefOr[String] = js.native
}

object Notification {
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppRestrictionsSchemaChangeEvent(value: AppRestrictionsSchemaChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appRestrictionsSchemaChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppRestrictionsSchemaChangeEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appRestrictionsSchemaChangeEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withAppUpdateEvent(value: AppUpdateEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUpdateEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppUpdateEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUpdateEvent")(js.undefined)
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
    def withInstallFailureEvent(value: InstallFailureEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installFailureEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallFailureEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installFailureEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withNewDeviceEvent(value: NewDeviceEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeviceEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewDeviceEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeviceEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPermissionsEvent(value: NewPermissionsEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPermissionsEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPermissionsEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPermissionsEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(js.undefined)
        ret
    }
    @scala.inline
    def withProductApprovalEvent(value: ProductApprovalEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productApprovalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductApprovalEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productApprovalEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withProductAvailabilityChangeEvent(value: ProductAvailabilityChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAvailabilityChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductAvailabilityChangeEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAvailabilityChangeEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampMillis")(js.undefined)
        ret
    }
  }
  
}

