package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[Property] = js.native
  var backgroundPadding: js.UndefOr[Property] = js.native
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  var eyeOffset: js.UndefOr[Property] = js.native
  var fillColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  var font: js.UndefOr[String] = js.native
  var heightReference: js.UndefOr[Property] = js.native
  var horizontalOrigin: js.UndefOr[Property] = js.native
  var outlineColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  var outlineWidth: js.UndefOr[Double] = js.native
  var pixelOffset: js.UndefOr[Property] = js.native
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.native
  var scale: js.UndefOr[Property] = js.native
  var scaleByDistance: js.UndefOr[Property] = js.native
  var show: js.UndefOr[Property] = js.native
  var showBackground: js.UndefOr[Property] = js.native
  var style: js.UndefOr[Property] = js.native
  var text: js.UndefOr[Property] = js.native
  var translucencyByDistance: js.UndefOr[Property] = js.native
  var verticalOrigin: js.UndefOr[Property] = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundPadding(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceDisplayCondition(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceDisplayCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceDisplayCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceDisplayCondition")(js.undefined)
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
    def withFillColor(value: typingsSlinky.cesium.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
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
    def withOutlineColor(value: typingsSlinky.cesium.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(js.undefined)
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
    def withShowBackground(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
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
  }
  
}

