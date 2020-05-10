package typingsSlinky.amapJsSdk

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsSdk.AMap.CircleOptions
import typingsSlinky.amapJsSdk.AMap.MarkerOptions
import typingsSlinky.amapJsSdk.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonButtonDom extends js.Object {
  var buttonDom: js.UndefOr[String | HTMLElement] = js.native
  var buttonOffset: js.UndefOr[Pixel] = js.native
  var buttonPosition: js.UndefOr[String] = js.native
  var circleOptions: js.UndefOr[CircleOptions] = js.native
  var convert: js.UndefOr[Boolean] = js.native
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  var markerOptions: js.UndefOr[MarkerOptions] = js.native
  var maximumAge: js.UndefOr[Double] = js.native
  var noIpLocate: js.UndefOr[Boolean] = js.native
  var panToLocation: js.UndefOr[Boolean] = js.native
  var showButton: js.UndefOr[Boolean] = js.native
  var showCircle: js.UndefOr[Boolean] = js.native
  var showMarker: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var useNative: js.UndefOr[Boolean] = js.native
  var zoomToAccuracy: js.UndefOr[Boolean] = js.native
}

object AnonButtonDom {
  @scala.inline
  def apply(): AnonButtonDom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonButtonDom]
  }
  @scala.inline
  implicit class AnonButtonDomOps[Self <: AnonButtonDom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonDomHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonDom(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDom")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonOffset(value: Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleOptions(value: CircleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withConvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
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
    def withMarkerOptions(value: MarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(js.undefined)
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
    def withPanToLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panToLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanToLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panToLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCircle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMarker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMarker")(js.undefined)
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
    @scala.inline
    def withZoomToAccuracy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomToAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToAccuracy")(js.undefined)
        ret
    }
  }
  
}

