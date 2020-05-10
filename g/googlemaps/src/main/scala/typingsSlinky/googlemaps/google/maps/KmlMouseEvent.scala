package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlMouseEvent extends js.Object {
  var featureData: KmlFeatureData = js.native
  var latLng: LatLng = js.native
  var pixelOffset: Size = js.native
}

object KmlMouseEvent {
  @scala.inline
  def apply(featureData: KmlFeatureData, latLng: LatLng, pixelOffset: Size): KmlMouseEvent = {
    val __obj = js.Dynamic.literal(featureData = featureData.asInstanceOf[js.Any], latLng = latLng.asInstanceOf[js.Any], pixelOffset = pixelOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlMouseEvent]
  }
  @scala.inline
  implicit class KmlMouseEventOps[Self <: KmlMouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureData(value: KmlFeatureData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatLng(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelOffset(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

