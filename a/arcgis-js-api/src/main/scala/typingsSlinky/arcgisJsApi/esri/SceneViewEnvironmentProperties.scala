package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewEnvironmentProperties extends Object {
  /**
    * Atmosphere conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphere: js.UndefOr[SceneViewEnvironmentAtmosphereProperties] = js.native
  /**
    * Indicates whether atmosphere visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed. By default this is simply a single, fully opaque, black color. Currently [ColorBackground](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html) is the only type of background supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var background: js.UndefOr[BackgroundProperties] = js.native
  /**
    * Lighting conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var lighting: js.UndefOr[SceneViewEnvironmentLightingProperties] = js.native
  /**
    * Indicates whether stars visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default true
    */
  var starsEnabled: js.UndefOr[Boolean] = js.native
}

object SceneViewEnvironmentProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewEnvironmentProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewEnvironmentProperties]
  }
  @scala.inline
  implicit class SceneViewEnvironmentPropertiesOps[Self <: SceneViewEnvironmentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtmosphere(value: SceneViewEnvironmentAtmosphereProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atmosphere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtmosphere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atmosphere")(js.undefined)
        ret
    }
    @scala.inline
    def withAtmosphereEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atmosphereEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtmosphereEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atmosphereEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: BackgroundProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withLighting(value: SceneViewEnvironmentLightingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighting")(js.undefined)
        ret
    }
    @scala.inline
    def withStarsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starsEnabled")(js.undefined)
        ret
    }
  }
  
}

