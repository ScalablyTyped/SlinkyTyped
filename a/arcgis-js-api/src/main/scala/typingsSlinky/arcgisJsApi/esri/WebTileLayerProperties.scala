package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebTileLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with PortalLayerProperties {
  /**
    * The attribution information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * A string of subDomain names where tiles are served to speed up tile retrieval. If subDomains are specified, the [urlTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate) should include a `{subDomain}` place holder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains)
    */
  var subDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.native
  /**
    * URL template for the hosted tiles. The `urlTemplate` should contain a `{subDomain}` place holder if [subDomains](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains) are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate)
    */
  var urlTemplate: js.UndefOr[String] = js.native
}

object WebTileLayerProperties {
  @scala.inline
  def apply(): WebTileLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebTileLayerProperties]
  }
  @scala.inline
  implicit class WebTileLayerPropertiesOps[Self <: WebTileLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withSubDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withTileInfo(value: TileInfoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTemplate")(js.undefined)
        ret
    }
  }
  
}

