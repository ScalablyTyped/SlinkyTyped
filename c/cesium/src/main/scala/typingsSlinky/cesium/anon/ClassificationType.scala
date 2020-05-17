package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.ConstantProperty
import typingsSlinky.cesium.mod.MaterialProperty
import typingsSlinky.cesium.mod.Property
import typingsSlinky.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationType extends js.Object {
  var arcType: js.UndefOr[Property | typingsSlinky.cesium.mod.ArcType] = js.native
  var classificationType: js.UndefOr[Property | typingsSlinky.cesium.mod.ClassificationType] = js.native
  var closeBottom: js.UndefOr[Boolean] = js.native
  var closeTop: js.UndefOr[Boolean] = js.native
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  var extrudedHeight: js.UndefOr[Property] = js.native
  var extrudedHeightReference: js.UndefOr[Property] = js.native
  var fill: js.UndefOr[Property | Boolean] = js.native
  var granularity: js.UndefOr[Property] = js.native
  var height: js.UndefOr[Property | Double] = js.native
  var heightReference: js.UndefOr[Property] = js.native
  var hierarchy: js.UndefOr[Property] = js.native
  var material: js.UndefOr[MaterialProperty | typingsSlinky.cesium.mod.Color] = js.native
  var outline: js.UndefOr[Property | Boolean] = js.native
  var outlineColor: js.UndefOr[Property | typingsSlinky.cesium.mod.Color] = js.native
  var outlineWidth: js.UndefOr[Property | Double] = js.native
  var perPositionHeight: js.UndefOr[Property] = js.native
  var shadows: js.UndefOr[Property | ShadowMode] = js.native
  var show: js.UndefOr[Property | Boolean] = js.native
  var stRotation: js.UndefOr[Property] = js.native
  var zIndex: js.UndefOr[ConstantProperty | Double] = js.native
}

object ClassificationType {
  @scala.inline
  def apply(): ClassificationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationType]
  }
  @scala.inline
  implicit class ClassificationTypeOps[Self <: ClassificationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArcType(value: Property | typingsSlinky.cesium.mod.ArcType): Self = {
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
    def withClassificationType(value: Property | typingsSlinky.cesium.mod.ClassificationType): Self = {
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
    def withCloseBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTop")(js.undefined)
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
    def withExtrudedHeight(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrudedHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withExtrudedHeightReference(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeightReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrudedHeightReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeightReference")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Property | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
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
    def withHeight(value: Property | Double): Self = {
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
    def withHierarchy(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchy")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: MaterialProperty | typingsSlinky.cesium.mod.Color): Self = {
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
    def withOutline(value: Property | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: Property | typingsSlinky.cesium.mod.Color): Self = {
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
    def withOutlineWidth(value: Property | Double): Self = {
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
    def withPerPositionHeight(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPositionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerPositionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPositionHeight")(js.undefined)
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
    def withStRotation(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: ConstantProperty | Double): Self = {
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

