package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of devices and their state. */
@js.native
trait DeviceStates extends js.Object {
  /** The SIM lock status if Type = Cellular and SIMPresent = True. */
  var SIMLockStatus: js.UndefOr[typingsSlinky.chromeApps.chrome.networking.onc.SIMLockStatus] = js.native
  /** Set to the SIM present state if the device type is Cellular. */
  var SIMPresent: js.UndefOr[Boolean] = js.native
  /** Set if the device is enabled. True if the device is currently scanning. */
  var Scanning: js.UndefOr[Boolean] = js.native
  /**
    * The current state of the device.
    *
    * **Uninitialized**
    *  - Device is available but not initialized.
    * **Disabled**
    *  - Device is initialized but not enabled.
    * **Enabling**
    *  - Enabled state has been requested but has not completed.
    * **Enabled**
    *  - Device is enabled.
    * **Prohibited**
    *  - Device is prohibited.
    */
  var State: DeviceState = js.native
  /** The network type associated with the device (Cellular, Ethernet, WiFi, or WiMAX). */
  var Type: NetworkType = js.native
}

object DeviceStates {
  @scala.inline
  def apply(State: DeviceState, Type: NetworkType): DeviceStates = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStates]
  }
  @scala.inline
  implicit class DeviceStatesOps[Self <: DeviceStates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: DeviceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: NetworkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIMLockStatus(value: SIMLockStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIMLockStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIMLockStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIMLockStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSIMPresent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIMPresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIMPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIMPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withScanning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scanning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scanning")(js.undefined)
        ret
    }
  }
  
}

