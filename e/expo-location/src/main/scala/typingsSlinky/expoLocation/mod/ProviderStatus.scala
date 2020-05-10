package typingsSlinky.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderStatus extends js.Object {
  var backgroundModeEnabled: Boolean = js.native
  var gpsAvailable: js.UndefOr[Boolean] = js.native
  var locationServicesEnabled: Boolean = js.native
  var networkAvailable: js.UndefOr[Boolean] = js.native
  var passiveAvailable: js.UndefOr[Boolean] = js.native
}

object ProviderStatus {
  @scala.inline
  def apply(backgroundModeEnabled: Boolean, locationServicesEnabled: Boolean): ProviderStatus = {
    val __obj = js.Dynamic.literal(backgroundModeEnabled = backgroundModeEnabled.asInstanceOf[js.Any], locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderStatus]
  }
  @scala.inline
  implicit class ProviderStatusOps[Self <: ProviderStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundModeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundModeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationServicesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationServicesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGpsAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpsAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpsAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpsAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withPassiveAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passiveAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassiveAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passiveAvailable")(js.undefined)
        ret
    }
  }
  
}

