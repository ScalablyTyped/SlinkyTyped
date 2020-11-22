package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`open-street-map`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`web-tile`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTileLayer
  extends Layer
     with ScaleRangeLayer
     with RefreshableLayer
     with PortalLayer
     with BlendLayer {
  
  /**
    * The attribution information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * This method fetches a tile for the given level, row and column present in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#fetchTile)
    */
  def fetchTile(level: Double, row: Double, column: Double): js.Promise[HTMLImageElement] = js.native
  def fetchTile(level: Double, row: Double, column: Double, options: WebTileLayerFetchTileOptions): js.Promise[HTMLImageElement] = js.native
  
  /**
    * This method returns a URL to a tile for a given level, row and column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#getTileUrl)
    */
  def getTileUrl(level: Double, row: Double, col: Double): String = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  
  /**
    * A string of subDomain names where tiles are served to speed up tile retrieval.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains)
    */
  var subDomains: js.Array[String] = js.native
  
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  
  /**
    * The list of tile server urls for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#tileServers)
    */
  val tileServers: js.Array[String] = js.native
  
  /**
    * For [WebTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html) the type is `web-tile`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#type)
    */
  @JSName("type")
  val type_WebTileLayer: `web-tile` | `open-street-map` = js.native
  
  /**
    * The url template is a string that specifies the URL of the hosted tile images to load.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate)
    */
  var urlTemplate: String = js.native
}
