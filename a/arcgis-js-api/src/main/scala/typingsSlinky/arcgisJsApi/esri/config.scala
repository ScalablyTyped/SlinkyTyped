package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configure global properties of the library.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html)
  */
@js.native
trait config extends js.Object {
  /**
    * The URL for font resources used by the [Font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family) class in [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) and [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) labels. To use your own hosted fonts, the font files need to be in `.pbf` format, and you must follow the kebab-case naming convention (e.g. "arial-unicode-ms-bold").
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#fontsUrl)
    *
    * @default "https://static.arcgis.com/fonts"
    */
  var fontsUrl: String = js.native
  /**
    * The URL for the utility service used by [GeoRSSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html) to convert GeoRSS documents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geoRSSServiceUrl)
    *
    * @default "https://utility.arcgis.com/sharing/rss"
    */
  var geoRSSServiceUrl: String = js.native
  /**
    * The default [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html) used by widgets and other operations, such as on-the-fly projections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geometryServiceUrl)
    *
    * @default "https://utility.arcgisonline.com/arcgis/rest/services/Geometry/GeometryServer"
    */
  var geometryServiceUrl: String = js.native
  /**
    * The URL for the utility service used by [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) to convert KML documents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#kmlServiceUrl)
    *
    * @default "https://utility.arcgis.com/sharing/kml"
    */
  var kmlServiceUrl: String = js.native
  /**
    * The default URL of new portal instances. If using an on-premise portal, this value should be set to the portal instance, for example: `https://www.example.com/arcgis`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl)
    *
    * @default "https://www.arcgis.com"
    */
  var portalUrl: String = js.native
  /**
    * An object with properties that control various aspects of communication between the library and web servers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var request: configRequest = js.native
  /**
    * The AMD loader's configuration object, which is loaded with each worker. Modify the configuration to specify locations of packages to be loaded with [the workers framework](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html) or to define a feature detection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var workers: configWorkers = js.native
}

object config {
  @scala.inline
  def apply(
    fontsUrl: String,
    geoRSSServiceUrl: String,
    geometryServiceUrl: String,
    kmlServiceUrl: String,
    portalUrl: String,
    request: configRequest,
    workers: configWorkers
  ): config = {
    val __obj = js.Dynamic.literal(fontsUrl = fontsUrl.asInstanceOf[js.Any], geoRSSServiceUrl = geoRSSServiceUrl.asInstanceOf[js.Any], geometryServiceUrl = geometryServiceUrl.asInstanceOf[js.Any], kmlServiceUrl = kmlServiceUrl.asInstanceOf[js.Any], portalUrl = portalUrl.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
  @scala.inline
  implicit class configOps[Self <: config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeoRSSServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoRSSServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometryServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmlServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmlServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: configRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkers(value: configWorkers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

