package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.MaterialProperty
import typingsSlinky.cesium.mod.Property
import typingsSlinky.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthFailMaterial extends js.Object {
  var arcType: js.UndefOr[Property | typingsSlinky.cesium.mod.ArcType] = js.native
  var clampToGround: js.UndefOr[Property | Boolean] = js.native
  var classificationType: js.UndefOr[Property | typingsSlinky.cesium.mod.ClassificationType] = js.native
  var depthFailMaterial: js.UndefOr[MaterialProperty] = js.native
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  var granularity: js.UndefOr[Property] = js.native
  var material: js.UndefOr[MaterialProperty | typingsSlinky.cesium.mod.Color] = js.native
  var positions: js.UndefOr[Property | js.Array[Cartesian3]] = js.native
  var shadows: js.UndefOr[Property | ShadowMode] = js.native
  var show: js.UndefOr[Property | Boolean] = js.native
  var width: js.UndefOr[Property | Double] = js.native
  var zIndex: js.UndefOr[Property | Double] = js.native
}

object DepthFailMaterial {
  @scala.inline
  def apply(): DepthFailMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthFailMaterial]
  }
  @scala.inline
  implicit class DepthFailMaterialOps[Self <: DepthFailMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArcType(value: Property | typingsSlinky.cesium.mod.ArcType): Self = this.set("arcType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcType: Self = this.set("arcType", js.undefined)
    @scala.inline
    def setClampToGround(value: Property | Boolean): Self = this.set("clampToGround", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClampToGround: Self = this.set("clampToGround", js.undefined)
    @scala.inline
    def setClassificationType(value: Property | typingsSlinky.cesium.mod.ClassificationType): Self = this.set("classificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassificationType: Self = this.set("classificationType", js.undefined)
    @scala.inline
    def setDepthFailMaterial(value: MaterialProperty): Self = this.set("depthFailMaterial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepthFailMaterial: Self = this.set("depthFailMaterial", js.undefined)
    @scala.inline
    def setDistanceDisplayCondition(value: Property): Self = this.set("distanceDisplayCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceDisplayCondition: Self = this.set("distanceDisplayCondition", js.undefined)
    @scala.inline
    def setGranularity(value: Property): Self = this.set("granularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    @scala.inline
    def setMaterial(value: MaterialProperty | typingsSlinky.cesium.mod.Color): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setPositionsVarargs(value: Cartesian3*): Self = this.set("positions", js.Array(value :_*))
    @scala.inline
    def setPositions(value: Property | js.Array[Cartesian3]): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
    @scala.inline
    def setShadows(value: Property | ShadowMode): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    @scala.inline
    def setShow(value: Property | Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setWidth(value: Property | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Property | Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

