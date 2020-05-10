package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35DeliveryRestrictions extends js.Object {
  /**
    * Corresponds to SCTE-35 archive_allowed_flag.
    */
  var ArchiveAllowedFlag: Scte35ArchiveAllowedFlag = js.native
  /**
    * Corresponds to SCTE-35 device_restrictions parameter.
    */
  var DeviceRestrictions: Scte35DeviceRestrictions = js.native
  /**
    * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
    */
  var NoRegionalBlackoutFlag: Scte35NoRegionalBlackoutFlag = js.native
  /**
    * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
    */
  var WebDeliveryAllowedFlag: Scte35WebDeliveryAllowedFlag = js.native
}

object Scte35DeliveryRestrictions {
  @scala.inline
  def apply(
    ArchiveAllowedFlag: Scte35ArchiveAllowedFlag,
    DeviceRestrictions: Scte35DeviceRestrictions,
    NoRegionalBlackoutFlag: Scte35NoRegionalBlackoutFlag,
    WebDeliveryAllowedFlag: Scte35WebDeliveryAllowedFlag
  ): Scte35DeliveryRestrictions = {
    val __obj = js.Dynamic.literal(ArchiveAllowedFlag = ArchiveAllowedFlag.asInstanceOf[js.Any], DeviceRestrictions = DeviceRestrictions.asInstanceOf[js.Any], NoRegionalBlackoutFlag = NoRegionalBlackoutFlag.asInstanceOf[js.Any], WebDeliveryAllowedFlag = WebDeliveryAllowedFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35DeliveryRestrictions]
  }
  @scala.inline
  implicit class Scte35DeliveryRestrictionsOps[Self <: Scte35DeliveryRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchiveAllowedFlag(value: Scte35ArchiveAllowedFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveAllowedFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceRestrictions(value: Scte35DeviceRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoRegionalBlackoutFlag(value: Scte35NoRegionalBlackoutFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoRegionalBlackoutFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebDeliveryAllowedFlag(value: Scte35WebDeliveryAllowedFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebDeliveryAllowedFlag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

