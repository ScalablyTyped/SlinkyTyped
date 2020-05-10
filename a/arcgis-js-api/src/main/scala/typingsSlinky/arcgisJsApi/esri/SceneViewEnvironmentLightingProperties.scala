package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewEnvironmentLightingProperties extends Object {
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default false
    */
  var ambientOcclusionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the date and time of the simulated sun is automatically updated to maintain the current time of day while the camera changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default true
    */
  var cameraTrackingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The current date and time of the simulated sun. When setting the date, specifying the time zone is important, otherwise the time zone of the browser will be used. This might lead to different lighting for users in different time zones.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default new Date("March 15, 2019 12:00:00 UTC")
    */
  var date: js.UndefOr[DateProperties] = js.native
  /**
    * Indicates whether to show shadows cast by the sun. Shadows are only displayed for real world 3D objects. Terrain doesn't cast shadows. In local scenes at small zoom levels, shadows are not displayed. For more control on which 3D objects cast shadows use the `castShadows` property available on [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows), [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#castShadows), [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#castShadows), and [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#castShadows).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default false
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.native
}

object SceneViewEnvironmentLightingProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewEnvironmentLightingProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewEnvironmentLightingProperties]
  }
  @scala.inline
  implicit class SceneViewEnvironmentLightingPropertiesOps[Self <: SceneViewEnvironmentLightingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmbientOcclusionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambientOcclusionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmbientOcclusionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambientOcclusionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraTrackingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraTrackingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraTrackingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraTrackingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: DateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectShadowsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directShadowsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectShadowsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directShadowsEnabled")(js.undefined)
        ret
    }
  }
  
}

