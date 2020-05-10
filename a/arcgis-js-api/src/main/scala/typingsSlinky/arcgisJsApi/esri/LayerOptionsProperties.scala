package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerOptionsProperties extends js.Object {
  /**
    * Applicable to [Imagery Layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html). Indicates whether or not only the topmost raster should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html#returnTopmostRaster)
    *
    * @default false
    */
  var returnTopmostRaster: js.UndefOr[Boolean] = js.native
  /**
    * Applicable to [Imagery Layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html). Indicates whether records without data should display within the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html#showNoDataRecords)
    *
    * @default true
    */
  var showNoDataRecords: js.UndefOr[Boolean] = js.native
}

object LayerOptionsProperties {
  @scala.inline
  def apply(): LayerOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerOptionsProperties]
  }
  @scala.inline
  implicit class LayerOptionsPropertiesOps[Self <: LayerOptionsProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnTopmostRaster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnTopmostRaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnTopmostRaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnTopmostRaster")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNoDataRecords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNoDataRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNoDataRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNoDataRecords")(js.undefined)
        ret
    }
  }
  
}

