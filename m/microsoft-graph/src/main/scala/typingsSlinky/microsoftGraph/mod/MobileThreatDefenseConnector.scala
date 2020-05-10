package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileThreatDefenseConnector extends Entity {
  // For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant
  var androidDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.native
  // For Android, set whether data from the data sync partner should be used during compliance evaluations
  var androidEnabled: js.UndefOr[Boolean] = js.native
  // For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant
  var iosDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.native
  // For IOS, get or set whether data from the data sync partner should be used during compliance evaluations
  var iosEnabled: js.UndefOr[Boolean] = js.native
  // DateTime of last Heartbeat recieved from the Data Sync Partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.native
  // Data Sync Partner state for this account. Possible values are: unavailable, available, enabled, unresponsive.
  var partnerState: js.UndefOr[MobileThreatPartnerTenantState] = js.native
  // Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
  var partnerUnresponsivenessThresholdInDays: js.UndefOr[Double] = js.native
  /**
    * Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the
    * Data Sync Partner
    */
  var partnerUnsupportedOsVersionBlocked: js.UndefOr[Boolean] = js.native
}

object MobileThreatDefenseConnector {
  @scala.inline
  def apply(): MobileThreatDefenseConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileThreatDefenseConnector]
  }
  @scala.inline
  implicit class MobileThreatDefenseConnectorOps[Self <: MobileThreatDefenseConnector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidDeviceBlockedOnMissingPartnerData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceBlockedOnMissingPartnerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDeviceBlockedOnMissingPartnerData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceBlockedOnMissingPartnerData")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIosDeviceBlockedOnMissingPartnerData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDeviceBlockedOnMissingPartnerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosDeviceBlockedOnMissingPartnerData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDeviceBlockedOnMissingPartnerData")(js.undefined)
        ret
    }
    @scala.inline
    def withIosEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosEnabled")(js.undefined)
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
    def withPartnerState(value: MobileThreatPartnerTenantState): Self = {
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
    def withPartnerUnresponsivenessThresholdInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerUnresponsivenessThresholdInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnerUnresponsivenessThresholdInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerUnresponsivenessThresholdInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withPartnerUnsupportedOsVersionBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerUnsupportedOsVersionBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnerUnsupportedOsVersionBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerUnsupportedOsVersionBlocked")(js.undefined)
        ret
    }
  }
  
}

