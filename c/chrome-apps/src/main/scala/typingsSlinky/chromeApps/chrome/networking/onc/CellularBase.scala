package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellularBase extends js.Object {
  /** Carrier account activation state. */
  var ActivationState: js.UndefOr[ActivationStateType] = js.native
  /** If the modem is registered on a network, the network technology currently in use. */
  var NetworkTechnology: js.UndefOr[String] = js.native
  /** The roaming state of the cellular modem on the current network. */
  var RoamingState: js.UndefOr[String] = js.native
  /** Whether a SIM card is present. */
  var SIMPresent: js.UndefOr[Boolean] = js.native
  /** The current network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.native
}

object CellularBase {
  @scala.inline
  def apply(): CellularBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellularBase]
  }
  @scala.inline
  implicit class CellularBaseOps[Self <: CellularBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationState(value: ActivationStateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationState")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkTechnology(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkTechnology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkTechnology: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkTechnology")(js.undefined)
        ret
    }
    @scala.inline
    def withRoamingState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoamingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoamingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoamingState")(js.undefined)
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
    def withSignalStrength(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalStrength")(js.undefined)
        ret
    }
  }
  
}

