package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSSublayerProperties extends js.Object {
  /**
    * Description for the WMTS sublayer. This defaults to the value of the Abstract property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#fullExtent)
    */
  var fullExtent: js.UndefOr[ExtentProperties] = js.native
  /**
    * The unique ID assigned to the sublayer. If not set by the developer, it is automatically generated when the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#id)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The map image format (MIME type) to request. Defaults to the first item in [imageFormats](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats). Must be one of the supported [imageFormats](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[String] = js.native
  /**
    * Supported image formats as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats)
    */
  var imageFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * The [WMTSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#layer)
    */
  var layer: js.UndefOr[WMTSLayerProperties] = js.native
  /**
    * The [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html) to request. Defaults to the id of the first item in [styles](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles). Should be one of the supported [styles](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styleId)
    */
  var styleId: js.UndefOr[String] = js.native
  /**
    * A collection of supported [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html)s as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles)
    */
  var styles: js.UndefOr[CollectionProperties[WMTSStyleProperties]] = js.native
  /**
    * The [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request. Defaults to the first item in [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet) that matches the spatialReference of the view. Must be one of the supported [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet)
    */
  var tileMatrixSet: js.UndefOr[TileMatrixSetProperties] = js.native
  /**
    * The id of the [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request. Defaults to the id of the first item in [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet) that matches the spatialReference of the view. Must be one of the supported [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSetId)
    */
  var tileMatrixSetId: js.UndefOr[String] = js.native
  /**
    * A collection of supported [TileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSets)
    */
  var tileMatrixSets: js.UndefOr[CollectionProperties[TileMatrixSetProperties]] = js.native
  /**
    * The title of the WMTS sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets. This defaults to the value of the Title property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#title)
    */
  var title: js.UndefOr[String] = js.native
}

object WMTSSublayerProperties {
  @scala.inline
  def apply(): WMTSSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMTSSublayerProperties]
  }
  @scala.inline
  implicit class WMTSSublayerPropertiesOps[Self <: WMTSSublayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFullExtent(value: ExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImageFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withImageFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withLayer(value: WMTSLayerProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: CollectionProperties[WMTSStyleProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTileMatrixSet(value: TileMatrixSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMatrixSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileMatrixSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMatrixSet")(js.undefined)
        ret
    }
    @scala.inline
    def withTileMatrixSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMatrixSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileMatrixSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMatrixSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withTileMatrixSets(value: CollectionProperties[TileMatrixSetProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMatrixSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileMatrixSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMatrixSets")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

