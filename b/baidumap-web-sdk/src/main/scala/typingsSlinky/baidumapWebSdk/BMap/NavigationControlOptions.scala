package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.native
  var enableGeolocation: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Size] = js.native
  var showZoomInfo: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[NavigationControlType] = js.native
}

object NavigationControlOptions {
  @scala.inline
  def apply(): NavigationControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControlOptions]
  }
  @scala.inline
  implicit class NavigationControlOptionsOps[Self <: NavigationControlOptions] (val x: Self) extends AnyVal {
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
    def withEnableGeolocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGeolocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGeolocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGeolocation")(js.undefined)
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
    def withShowZoomInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowZoomInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NavigationControlType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

