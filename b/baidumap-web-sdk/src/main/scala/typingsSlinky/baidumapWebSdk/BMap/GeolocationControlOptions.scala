package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.native
  var enableAutoLocation: js.UndefOr[Boolean] = js.native
  var locationIcon: js.UndefOr[Icon] = js.native
  var offset: js.UndefOr[Size] = js.native
  var showAddressBar: js.UndefOr[Boolean] = js.native
}

object GeolocationControlOptions {
  @scala.inline
  def apply(): GeolocationControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationControlOptions]
  }
  @scala.inline
  implicit class GeolocationControlOptionsOps[Self <: GeolocationControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: ControlAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationIcon(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAddressBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAddressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAddressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAddressBar")(js.undefined)
        ret
    }
  }
  
}

