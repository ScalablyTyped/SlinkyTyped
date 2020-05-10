package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.cesium.mod.Billboard.CreateImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillboardOptions extends js.Object {
  var alignedAxis: js.UndefOr[Cartesian3] = js.native
  var color: js.UndefOr[Color] = js.native
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.native
  var eyeOffset: js.UndefOr[Cartesian3] = js.native
  var height: js.UndefOr[Double] = js.native
  var heightReference: js.UndefOr[HeightReference] = js.native
  var horizontalOrigin: js.UndefOr[HorizontalOrigin] = js.native
  var id: js.UndefOr[js.Any] = js.native
  var image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | String | CreateImageCallback] = js.native
  var imageSubRegion: js.UndefOr[BoundingRectangle] = js.native
  var pixelOffset: js.UndefOr[Cartesian2] = js.native
  var pixelOffsetScaleByDistance: js.UndefOr[NearFarScalar] = js.native
  var position: js.UndefOr[Cartesian3] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var scaleByDistance: js.UndefOr[NearFarScalar] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var sizeInMeters: js.UndefOr[Boolean] = js.native
  var translucencyByDistance: js.UndefOr[NearFarScalar] = js.native
  var verticalOrigin: js.UndefOr[VerticalOrigin] = js.native
  var width: js.UndefOr[Double] = js.native
}

object BillboardOptions {
  @scala.inline
  def apply(): BillboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillboardOptions]
  }
  @scala.inline
  implicit class BillboardOptionsOps[Self <: BillboardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignedAxis(value: Cartesian3): Self = {
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
    def withColor(value: Color): Self = {
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
    def withDistanceDisplayCondition(value: DistanceDisplayCondition): Self = {
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
    def withEyeOffset(value: Cartesian3): Self = {
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
    def withHeight(value: Double): Self = {
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
    def withHeightReference(value: HeightReference): Self = {
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
    def withHorizontalOrigin(value: HorizontalOrigin): Self = {
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
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImageFunction1(
      value: /* id */ String => HTMLImageElement | HTMLCanvasElement | (js.Promise[HTMLImageElement | HTMLCanvasElement])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImageHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: HTMLImageElement | HTMLCanvasElement | String | CreateImageCallback): Self = {
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
    def withImageSubRegion(value: BoundingRectangle): Self = {
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
    def withPixelOffset(value: Cartesian2): Self = {
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
    def withPixelOffsetScaleByDistance(value: NearFarScalar): Self = {
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
    def withPosition(value: Cartesian3): Self = {
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
    def withRotation(value: Double): Self = {
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
    def withScale(value: Double): Self = {
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
    def withScaleByDistance(value: NearFarScalar): Self = {
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
    def withShow(value: Boolean): Self = {
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
    def withSizeInMeters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInMeters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInMeters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInMeters")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslucencyByDistance(value: NearFarScalar): Self = {
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
    def withVerticalOrigin(value: VerticalOrigin): Self = {
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
    def withWidth(value: Double): Self = {
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

