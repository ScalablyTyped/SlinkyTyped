package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bmp
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.exclude
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.gif
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hide
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.include
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.pdf
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png24
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.show
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageParametersProperties extends js.Object {
  /**
    * Dots per inch setting for an module:esri/layersMapImageLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#dpi)
    *
    * @default 96
    */
  var dpi: js.UndefOr[Double] = js.native
  /**
    * Extent of map to be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  /**
    * Map image format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#format)
    *
    * @default png8
    */
  var format: js.UndefOr[png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg] = js.native
  /**
    * Requested image height in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#height)
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Spatial reference of exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#imageSpatialReference)
    */
  var imageSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * Array of layer definition expressions that allows you to filter the features of individual layers in the exported map image. Layer definitions with semicolons or colons are supported if using a map service published using ArcGIS Server 10 or later.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerDefinitions)
    */
  var layerDefinitions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of layer IDs, that represent which layers to include in the exported map. Use in combination with [layerOption](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerOption) to specify how layer visibility is handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The option for displaying or hiding the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerOption)
    */
  var layerOption: js.UndefOr[show | hide | include | exclude] = js.native
  /**
    * Indicates whether or not the background of the dynamic image is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#transparent)
    *
    * @default true
    */
  var transparent: js.UndefOr[Boolean] = js.native
  /**
    * Requested image width in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}

object ImageParametersProperties {
  @scala.inline
  def apply(): ImageParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageParametersProperties]
  }
  @scala.inline
  implicit class ImageParametersPropertiesOps[Self <: ImageParametersProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: ExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
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
    def withImageSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSpatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSpatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerDefinitions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerIds")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerOption(value: show | hide | include | exclude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerOption")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
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

