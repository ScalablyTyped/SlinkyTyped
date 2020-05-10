package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoRSSLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties {
  /**
    * Symbol used to represent line features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#lineSymbol)
    */
  var lineSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.native
  /**
    * Symbol used to represent point features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#pointSymbol)
    */
  var pointSymbol: js.UndefOr[PictureMarkerSymbolProperties | SimpleMarkerSymbolProperties] = js.native
  /**
    * Symbol used to represent polygon features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#polygonSymbol)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbolProperties] = js.native
  /**
    * The URL pointing to a GeoRSS file. This must be publicly available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object GeoRSSLayerProperties {
  @scala.inline
  def apply(): GeoRSSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoRSSLayerProperties]
  }
  @scala.inline
  implicit class GeoRSSLayerPropertiesOps[Self <: GeoRSSLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineSymbol(value: SimpleLineSymbolProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSymbol(value: PictureMarkerSymbolProperties | SimpleMarkerSymbolProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonSymbol(value: SimpleFillSymbolProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

