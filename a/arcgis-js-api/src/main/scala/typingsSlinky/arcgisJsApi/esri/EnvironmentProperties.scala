package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentProperties extends js.Object {
  /**
    * Specifies whether the atmosphere should be displayed. Typically this consists of haze and sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#atmosphereEnabled)
    *
    * @default true
    */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed. The default value of `null` displays a single, fully opaque, black color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#background)
    *
    * @default null
    */
  var background: js.UndefOr[BackgroundProperties] = js.native
  /**
    * Settings for defining the lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#lighting)
    */
  var lighting: js.UndefOr[LightingProperties] = js.native
  /**
    * Specifies whether stars should be displayed in the sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#starsEnabled)
    *
    * @default true
    */
  var starsEnabled: js.UndefOr[Boolean] = js.native
}

object EnvironmentProperties {
  @scala.inline
  def apply(): EnvironmentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentProperties]
  }
  @scala.inline
  implicit class EnvironmentPropertiesOps[Self <: EnvironmentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLighting(value: LightingProperties): Self = {
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

