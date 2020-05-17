package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignedAxis extends js.Object {
  var alignedAxis: js.UndefOr[Property] = js.native
  var color: js.UndefOr[Property] = js.native
  var disableDepthTestDistance: js.UndefOr[Property] = js.native
  var eyeOffset: js.UndefOr[Property] = js.native
  var height: js.UndefOr[Property] = js.native
  var heightReference: js.UndefOr[Property] = js.native
  var horizontalOrigin: js.UndefOr[Property] = js.native
  var image: js.UndefOr[Property] = js.native
  var imageSubRegion: js.UndefOr[Property] = js.native
  var pixelOffset: js.UndefOr[Property] = js.native
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.native
  var rotation: js.UndefOr[Property] = js.native
  var scale: js.UndefOr[Property] = js.native
  var scaleByDistance: js.UndefOr[Property] = js.native
  var show: js.UndefOr[Property] = js.native
  var translucencyByDistance: js.UndefOr[Property] = js.native
  var verticalOrigin: js.UndefOr[Property] = js.native
  var width: js.UndefOr[Property] = js.native
}

object AlignedAxis {
  @scala.inline
  def apply(): AlignedAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignedAxis]
  }
  @scala.inline
  implicit class AlignedAxisOps[Self <: AlignedAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignedAxis(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignedAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignedAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignedAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDepthTestDistance(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDepthTestDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDepthTestDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDepthTestDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withEyeOffset(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEyeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightReference(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightReference")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalOrigin(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSubRegion(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSubRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSubRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSubRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelOffset(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelOffsetScaleByDistance(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelOffsetScaleByDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelOffsetScaleByDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelOffsetScaleByDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleByDistance(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleByDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleByDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleByDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslucencyByDistance(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucencyByDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslucencyByDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucencyByDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalOrigin(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

