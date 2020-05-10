package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceManagementPartner extends Entity {
  // Partner display name
  var displayName: js.UndefOr[String] = js.native
  // Whether device management partner is configured or not
  var isConfigured: js.UndefOr[Boolean] = js.native
  // Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.native
  // Partner App type. Possible values are: unknown, singleTenantApp, multiTenantApp.
  var partnerAppType: js.UndefOr[DeviceManagementPartnerAppType] = js.native
  // Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
  var partnerState: js.UndefOr[DeviceManagementPartnerTenantState] = js.native
  // Partner Single tenant App id
  var singleTenantAppId: js.UndefOr[String] = js.native
  // DateTime in UTC when PartnerDevices will be marked as NonCompliant
  var whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime: js.UndefOr[String] = js.native
  // DateTime in UTC when PartnerDevices will be removed
  var whenPartnerDevicesWillBeRemovedDateTime: js.UndefOr[String] = js.native
}

object DeviceManagementPartner {
  @scala.inline
  def apply(): DeviceManagementPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementPartner]
  }
  @scala.inline
  implicit class DeviceManagementPartnerOps[Self <: DeviceManagementPartner] (val x: Self) extends AnyVal {
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
    def withIsConfigured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConfigured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConfigured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConfigured")(js.undefined)
        ret
    }
    @scala.inline
    def withLastHeartbeatDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastHeartbeatDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastHeartbeatDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastHeartbeatDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPartnerAppType(value: DeviceManagementPartnerAppType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerAppType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnerAppType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerAppType")(js.undefined)
        ret
    }
    @scala.inline
    def withPartnerState(value: DeviceManagementPartnerTenantState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnerState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerState")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleTenantAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleTenantAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleTenantAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleTenantAppId")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenPartnerDevicesWillBeRemovedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenPartnerDevicesWillBeRemovedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhenPartnerDevicesWillBeRemovedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenPartnerDevicesWillBeRemovedDateTime")(js.undefined)
        ret
    }
  }
  
}

