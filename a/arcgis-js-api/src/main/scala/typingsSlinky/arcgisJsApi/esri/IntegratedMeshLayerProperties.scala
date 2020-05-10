package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegratedMeshLayerProperties
  extends LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  /**
    * Specifies how the mesh is placed on the vertical axis (z). This property only affects [IntegratedMeshLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html) when using the `absolute-height` mode. Integrated mesh layers always render in front of the ground surface, so setting negative offset values will not render them below the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[IntegratedMeshLayerElevationInfo] = js.native
}

object IntegratedMeshLayerProperties {
  @scala.inline
  def apply(): IntegratedMeshLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegratedMeshLayerProperties]
  }
  @scala.inline
  implicit class IntegratedMeshLayerPropertiesOps[Self <: IntegratedMeshLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElevationInfo(value: IntegratedMeshLayerElevationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevationInfo")(js.undefined)
        ret
    }
  }
  
}

