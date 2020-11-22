package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.IHandle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`base-dynamic`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`base-elevation`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`base-tile`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bing-maps`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`building-scene`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`geo-rss`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`imagery-tile`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`integrated-mesh`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`layerview-create-error`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`layerview-create`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`layerview-destroy`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`map-image`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`map-notes`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`ogc-feature`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`open-street-map`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`point-cloud`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vector-tile`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`web-tile`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.csv
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.elevation
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feature
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geojson
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.graphics
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.group
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hide
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.imagery
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kml
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.route
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.scene
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.show
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.stream
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tile
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.unknown
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.unsupported
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.wcs
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.wms
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.wmts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer
  extends Accessor
     with Loadable
     with Evented
     with IntersectItem
     with _HitTestItem {
  
  /**
    * Called by the views, such as [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), when the layer is added to the [Map.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) collection and a layer view must be created for it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#createLayerView)
    */
  def createLayerView(view: js.Any): js.Promise[LayerView] = js.native
  def createLayerView(view: js.Any, options: LayerCreateLayerViewOptions): js.Promise[LayerView] = js.native
  
  /**
    * Fetches custom attribution data for the layer when it becomes available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fetchAttributionData)
    */
  def fetchAttributionData(): js.Promise[_] = js.native
  
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fullExtent)
    */
  var fullExtent: Extent = js.native
  
  /**
    * The unique ID assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)
    */
  var id: String = js.native
  
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#listMode)
    */
  var listMode: show | hide | `hide-children` = js.native
  
  /**
    * Indicates whether the layer's resources have loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#loaded)
    */
  val loaded: Boolean = js.native
  
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: LayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: LayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: LayerLayerviewDestroyEventHandler): IHandle = js.native
  
  /**
    * The opacity of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#opacity)
    */
  var opacity: Double = js.native
  
  /**
    * The title of the layer used to identify it in places such as the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) and [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#title)
    */
  var title: String = js.native
  
  /**
    * The layer type provides a convenient way to check the type of the layer without the need to import specific layer modules.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#type)
    */
  val `type`: `base-dynamic` | `base-elevation` | `base-tile` | `bing-maps` | `building-scene` | csv | elevation | feature | geojson | `geo-rss` | graphics | group | imagery | `imagery-tile` | `integrated-mesh` | kml | `map-image` | `map-notes` | `ogc-feature` | `open-street-map` | `point-cloud` | route | scene | stream | tile | unknown | unsupported | `vector-tile` | wcs | `web-tile` | wms | wmts = js.native
  
  /**
    * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#visible)
    */
  var visible: Boolean = js.native
}
