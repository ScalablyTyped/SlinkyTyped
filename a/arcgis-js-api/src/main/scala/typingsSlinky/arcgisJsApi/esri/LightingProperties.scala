package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightingProperties extends js.Object {
  /**
    * The time and date for which the sun position and light direction is computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#date)
    *
    * @default null
    */
  var date: js.UndefOr[DateProperties] = js.native
  /**
    * Indicates whether to show shadows cast by the sun. Shadows are only displayed for real world 3D objects. Terrain doesn't cast shadows. In local scenes at small zoom levels, shadows are not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#directShadowsEnabled)
    *
    * @default false
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The UTC time zone offset in hours that should be displayed in the UI to represent the date. This value does not have an impact on the actual lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#displayUTCOffset)
    *
    * @default null
    */
  var displayUTCOffset: js.UndefOr[Double] = js.native
}

object LightingProperties {
  @scala.inline
  def apply(): LightingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightingProperties]
  }
  @scala.inline
  implicit class LightingPropertiesOps[Self <: LightingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withDisplayUTCOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayUTCOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayUTCOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayUTCOffset")(js.undefined)
        ret
    }
  }
  
}

