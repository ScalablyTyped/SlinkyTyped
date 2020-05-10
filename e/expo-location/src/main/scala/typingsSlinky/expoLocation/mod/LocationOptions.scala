package typingsSlinky.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationOptions extends js.Object {
  var accuracy: js.UndefOr[LocationAccuracy] = js.native
  var distanceInterval: js.UndefOr[Double] = js.native
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  var mayShowUserSettingsDialog: js.UndefOr[Boolean] = js.native
  var timeInterval: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object LocationOptions {
  @scala.inline
  def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  @scala.inline
  implicit class LocationOptionsOps[Self <: LocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: LocationAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHighAccuracy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHighAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHighAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withMayShowUserSettingsDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayShowUserSettingsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMayShowUserSettingsDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayShowUserSettingsDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

