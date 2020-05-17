package typingsSlinky.amapJsSdk.anon

import typingsSlinky.amapJsSdk.AMap.Marker
import typingsSlinky.amapJsSdk.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoPosition extends js.Object {
  var autoPosition: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[Boolean] = js.native
  var liteStyle: js.UndefOr[Boolean] = js.native
  var locate: js.UndefOr[Boolean] = js.native
  var locationMarker: js.UndefOr[Marker] = js.native
  var noIpLocate: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Pixel] = js.native
  var position: js.UndefOr[String] = js.native
  var ruler: js.UndefOr[Boolean] = js.native
  var useNative: js.UndefOr[Boolean] = js.native
}

object AutoPosition {
  @scala.inline
  def apply(): AutoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPosition]
  }
  @scala.inline
  implicit class AutoPositionOps[Self <: AutoPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liteStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liteStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLocate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locate")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withNoIpLocate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIpLocate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoIpLocate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIpLocate")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Pixel): Self = {
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
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRuler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
  }
  
}

