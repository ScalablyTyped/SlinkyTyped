package typingsSlinky.cesium

import typingsSlinky.cesium.mod.ArcType
import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.ClassificationType
import typingsSlinky.cesium.mod.MaterialProperty
import typingsSlinky.cesium.mod.Property
import typingsSlinky.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDepthFailMaterial extends js.Object {
  var arcType: js.UndefOr[Property | ArcType] = js.native
  var clampToGround: js.UndefOr[Property | Boolean] = js.native
  var classificationType: js.UndefOr[Property | ClassificationType] = js.native
  var depthFailMaterial: js.UndefOr[MaterialProperty] = js.native
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  var granularity: js.UndefOr[Property] = js.native
  var material: js.UndefOr[MaterialProperty] = js.native
  var positions: js.UndefOr[Property | js.Array[Cartesian3]] = js.native
  var shadows: js.UndefOr[Property | ShadowMode] = js.native
  var show: js.UndefOr[Property | Boolean] = js.native
  var width: js.UndefOr[Property | Double] = js.native
  var zIndex: js.UndefOr[Property | Double] = js.native
}

object AnonDepthFailMaterial {
  @scala.inline
  def apply(): AnonDepthFailMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDepthFailMaterial]
  }
  @scala.inline
  implicit class AnonDepthFailMaterialOps[Self <: AnonDepthFailMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArcType(value: Property | ArcType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcType")(js.undefined)
        ret
    }
    @scala.inline
    def withClampToGround(value: Property | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClampToGround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(js.undefined)
        ret
    }
    @scala.inline
    def withClassificationType(value: Property | ClassificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationType")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthFailMaterial(value: MaterialProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthFailMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthFailMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthFailMaterial")(js.undefined)
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
    def withGranularity(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: MaterialProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(js.undefined)
        ret
    }
    @scala.inline
    def withPositions(value: Property | js.Array[Cartesian3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(js.undefined)
        ret
    }
    @scala.inline
    def withShadows(value: Property | ShadowMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Property | Boolean): Self = {
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
    def withWidth(value: Property | Double): Self = {
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
    @scala.inline
    def withZIndex(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

