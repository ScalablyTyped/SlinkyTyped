package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaOptions extends js.Object {
  var aroundControl: Boolean = js.native
  var aroundControlOptions: AroundControlOptions = js.native
  var logoControl: Boolean = js.native
  var logoControlOptions: LogoControlOptions = js.native
  var maxScale: Double = js.native
  var maxZoom: Double = js.native
  var minScale: Double = js.native
  var minZoom: Double = js.native
  var panoId: String = js.native
  var position: LatLng | LatLngLiteral = js.native
  var pov: PanoramaPov = js.native
  var size: Size | SizeLiteral = js.native
  var visible: Boolean = js.native
  var zoomControl: Boolean = js.native
  var zoomControlOptions: ZoomControlOptions = js.native
}

object PanoramaOptions {
  @scala.inline
  def apply(
    aroundControl: Boolean,
    aroundControlOptions: AroundControlOptions,
    logoControl: Boolean,
    logoControlOptions: LogoControlOptions,
    maxScale: Double,
    maxZoom: Double,
    minScale: Double,
    minZoom: Double,
    panoId: String,
    position: LatLng | LatLngLiteral,
    pov: PanoramaPov,
    size: Size | SizeLiteral,
    visible: Boolean,
    zoomControl: Boolean,
    zoomControlOptions: ZoomControlOptions
  ): PanoramaOptions = {
    val __obj = js.Dynamic.literal(aroundControl = aroundControl.asInstanceOf[js.Any], aroundControlOptions = aroundControlOptions.asInstanceOf[js.Any], logoControl = logoControl.asInstanceOf[js.Any], logoControlOptions = logoControlOptions.asInstanceOf[js.Any], maxScale = maxScale.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], panoId = panoId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pov = pov.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zoomControl = zoomControl.asInstanceOf[js.Any], zoomControlOptions = zoomControlOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaOptions]
  }
  @scala.inline
  implicit class PanoramaOptionsOps[Self <: PanoramaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAroundControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAroundControlOptions(value: AroundControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogoControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogoControlOptions(value: LogoControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: LatLng | LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPov(value: PanoramaPov): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size | SizeLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomControlOptions(value: ZoomControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

