package typingsSlinky.heremaps.H

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.heremaps.H.Map_.EngineType
import typingsSlinky.heremaps.H.geo.IPoint
import typingsSlinky.heremaps.H.geo.Rect
import typingsSlinky.heremaps.H.map.DataModel
import typingsSlinky.heremaps.H.map.Group
import typingsSlinky.heremaps.H.map.Imprint
import typingsSlinky.heremaps.H.map.Object
import typingsSlinky.heremaps.H.map.ViewModel
import typingsSlinky.heremaps.H.map.ViewModel.ILookAtData
import typingsSlinky.heremaps.H.map.ViewPort
import typingsSlinky.heremaps.H.map.layer.BaseTileLayer
import typingsSlinky.heremaps.H.map.layer.Layer
import typingsSlinky.heremaps.H.map.render.p2d.RenderEngine
import typingsSlinky.heremaps.H.math.Point
import typingsSlinky.heremaps.H.util.EventTarget
import typingsSlinky.heremaps.H.util.ICapturable
import typingsSlinky.heremaps.H.util.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** Map *****/
/**
  * Map class defines map instance in the application. By creating this object you will initialize a visible map object which is attached to the provided dom element.
  * Map class is an entry point to all operations related to layers, map objects and geo-screen transformations. By specifying options you can initialize map with predefined view.
  */
@js.native
trait Map__ extends EventTarget {
  
  /**
    * This method adds a layer to the map.
    * @param layer {H.map.layer.Layer} - The map layer to be added
    * @param opt_idx {number=} - index at which the new layer should be inserted
    * @returns {H.Map} - current map instance
    */
  def addLayer(layer: Layer): Map_ = js.native
  def addLayer(layer: Layer, opt_idx: Double): Map_ = js.native
  
  /**
    * This method adds an map object to the map. Map object can be a marker or a spatial object like polygon or polyline.
    * @param mapObject {!H.map.Object} - The map object to add
    * @returns {!H.map.Object} - the added map object
    */
  def addObject(mapObject: Object): Object = js.native
  
  /**
    * This method adds an array of objects or an object group to the map.
    * @param mapObjects {Array<!H.map.Object>}
    * @returns {H.Map} - the map instance
    */
  def addObjects(mapObjects: js.Array[Object]): Map_ = js.native
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * This method captures desired region of the map and objects on it. Result is returned as an HTML5 Canvas element.
    * Origin of coordinate system for capturing is in the top left corner of the viewport.
    * @param callback {function(HTMLCanvasElement=)} - Callback function to call once result of the capturing is ready
    * @param opt_capturables {Array<H.util.ICapturable>=} - Collection of "capturable" element(s) to draw into the resulting canvas
    * @param opt_x1 {number=} - The X coordinate of the left edge of the capturing rectangle defaults to 0
    * @param opt_y1 {number=} - The Y coordinate of the top edge of the capturing rectangle defaults to 0
    * @param opt_x2 {number=} - The X coordinate of the right edge of the capturing rectangle defaults to viewport width
    * @param opt_y2 {number=} - The Y coordinate of the bottom edge of the capturing rectangle defaults to viewport height
    */
  def capture(
    callback: js.UndefOr[js.Function1[/* canvas */ HTMLCanvasElement, Unit]],
    opt_capturables: js.UndefOr[js.Array[ICapturable]],
    opt_x1: js.UndefOr[Double],
    opt_y1: js.UndefOr[Double],
    opt_x2: js.UndefOr[Double],
    opt_y2: js.UndefOr[Double]
  ): Unit = js.native
  
  /**
    * To clear the entire stored content
    * @param opt_onprogress {function(H.util.Request)=} - A callback which is invoked every time when the progress state of the returned clear request changes
    * @returns {H.util.Request} - A handle to the created flush request
    */
  def clearContent(): Request = js.native
  def clearContent(opt_onprogress: js.Function1[/* req */ Request, Unit]): Request = js.native
  
  /**
    * Returns the screen coordinates according to the given geographical coordinates. This method returns a screen pixel coordinates for the provided geo point.
    * @param geoPoint {H.geo.IPoint} - point on the map
    * @returns {?H.math.Point}
    */
  def geoToScreen(geoPoint: IPoint): Point = js.native
  
  /**
    * To get the current base map layer.
    * @returns {?H.map.layer.Layer}
    */
  def getBaseLayer(): Layer = js.native
  
  /**
    * This method returns currently rendered center of the map.
    * @returns {H.geo.Point}
    */
  def getCenter(): typingsSlinky.heremaps.H.geo.Point = js.native
  
  /**
    * This method returns the map root html element
    * @returns {Element}
    */
  def getElement(): Element = js.native
  
  /**
    * This returns the map's render engine
    * @return {H.map.render.p2d.RenderEngine} - map render engine
    */
  def getEngine(): RenderEngine = js.native
  
  /**
    * This method returns the imprint object for this map.
    * @returns {H.map.Imprint}
    */
  def getImprint(): Imprint = js.native
  
  /**
    * This method returns the map's current layer collection.
    * @returns {H.map.DataModel}
    */
  def getLayers(): DataModel = js.native
  
  /**
    * Returns the top most z-ordered map object found under the specific screen coordinates. Coordinates are viewport pixel coordinates starting from top left corner as (0, 0) point.
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    * @param callback {function}
    * @returns {?H.map.Object} - the encountered top most map object or null if no object found
    */
  def getObjectAt(x: Double, y: Double, callback: js.Function1[/* obj */ Object, _]): Object = js.native
  
  /**
    * This method retrieves the list of all objects which have been added to the map.
    * @returns {Array<H.map.Object>} - the list of all use objects which are currently on the map.
    */
  def getObjects(): js.Array[Object] = js.native
  
  /**
    * Returns a list of map objects in descending z-order found under the specific screen coordinates. Coordinates are viewport pixel coordinates starting from top left corner as (0, 0) point.
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    * @returns {Array<!H.map.Object>}
    */
  def getObjectsAt(x: Double, y: Double): js.Array[Object] = js.native
  
  /**
    * This method returns current view model. View model can be used to modify the current view or camera. H.map.ViewModel
    * @returns {H.map.ViewModel}
    */
  def getViewModel(): ViewModel = js.native
  
  /**
    * This method returns current map viewport.
    * Viewport can be used to modify padding and margin which will reflect the position of the viewport center and the amount of extra data loaded (for margin)
    * @returns {H.map.ViewPort}
    */
  def getViewPort(): ViewPort = js.native
  
  /**
    * This method returns currently rendered zoom level.
    * @returns {number}
    */
  def getZoom(): Double = js.native
  
  /**
    * This method removes layer from the map.
    * @param layer {H.map.layer.Layer} - The map layer to be removed
    * @returns {H.Map} - current map instance
    */
  def removeLayer(layer: Layer): Map_ = js.native
  
  /**
    * This method removes previously added map object from the map.
    * @param mapObject {!H.map.Object} - The map object to remove
    * @returns {!H.map.Object} - the removed map object
    */
  def removeObject(mapObject: Object): Object = js.native
  
  /**
    * This method removes an array of object or an object group from the map.
    * @param mapObjects {(Array<H.map.Object> | H.map.Group)}
    * @returns {H.Map} - the map instance
    */
  def removeObjects(mapObjects: js.Array[Object]): Map_ = js.native
  def removeObjects(mapObjects: Group): Map_ = js.native
  
  /**
    * Returns the geographical coordinates according to the given screen coordinates.
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    * @returns {?H.geo.Point}
    */
  def screenToGeo(x: Double, y: Double): typingsSlinky.heremaps.H.geo.Point = js.native
  
  /**
    * Returns the camera data according to the given screen coordinates. Method converts screen pixel coordinates to correct camera data object
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    * @returns {H.map.ViewModel.ILookAtData}
    */
  def screenToLookAtData(x: Double, y: Double): ILookAtData = js.native
  
  /**
    * This method will set provided layer as base map. The layer will be inserted as the bottom most layer in the map.
    * @param layer {H.map.layer.Layer} - The layer to use as base map
    * @returns {H.Map} - the instance itself
    */
  def setBaseLayer(layer: Layer): Map_ = js.native
  
  /**
    * This method sets the new center on a map.
    * @param center {H.geo.IPoint} - requested center to be set
    * @param opt_animate {boolean=} - parameter indicates if animated transition should be applied, default is false
    * @returns {H.Map} - the instance itself
    */
  def setCenter(center: IPoint): Map_ = js.native
  def setCenter(center: IPoint, opt_animate: Boolean): Map_ = js.native
  
  /**
    * This method sets the rendering engine type for the map. Rendering engine is responsible for displaying i.e tiles and data on the map.
    * @param type {H.Map.EngineType}
    * @returns {H.Map} - the map itself
    */
  def setEngineType(`type`: EngineType): Map_ = js.native
  
  /**
    * This method sets the zoom level on the map. Every zoom level represents different scale i.e map at zoom level 2 is twice as large as the map at zoom level 1.
    * @param zoom {number} - requested zoom level
    * @param opt_animate {boolean=} - parameter indicates if animated transition should be applied, default is false
    * @returns {H.Map} - the instance itself
    */
  def setZoom(zoom: Double): Map_ = js.native
  def setZoom(zoom: Double, opt_animate: Boolean): Map_ = js.native
  
  /**
    * To persistently store the content of a map layer for a given area and range of zoom levels.
    * It can be used to enable map rendering when no internet connection is established and also to reduce the download traffic for frequently visited map areas.
    * @param opt_onprogress {function(H.util.Request)=} - A callback which is invoked every time when the progress state of the returned store request changes.
    * @param opt_bounds {H.geo.Rect=} - The area to store, default is the current view bounds
    * @param opt_min {number=} - The minimum zoom level to store, default is the current zoom level
    * @param opt_max {number=} - The maximum zoom level to store, default is the current zoom level
    * @param opt_layer {H.map.layer.BaseTileLayer=} - The layer to store, default is the current base layer
    * @returns {H.util.Request} - A handle to the created storage request
    */
  def storeContent(): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: js.UndefOr[scala.Nothing],
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(opt_onprogress: js.UndefOr[scala.Nothing], opt_bounds: js.UndefOr[scala.Nothing], opt_min: Double): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: Double,
    opt_max: js.UndefOr[scala.Nothing],
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: Double,
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: Double,
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(opt_onprogress: js.UndefOr[scala.Nothing], opt_bounds: Rect): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: Rect,
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: js.UndefOr[scala.Nothing],
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: Rect,
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: Rect,
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(opt_onprogress: js.UndefOr[scala.Nothing], opt_bounds: Rect, opt_min: Double): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: Rect,
    opt_min: Double,
    opt_max: js.UndefOr[scala.Nothing],
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(opt_onprogress: js.UndefOr[scala.Nothing], opt_bounds: Rect, opt_min: Double, opt_max: Double): Request = js.native
  def storeContent(
    opt_onprogress: js.UndefOr[scala.Nothing],
    opt_bounds: Rect,
    opt_min: Double,
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(opt_onprogress: js.Function1[/* req */ Request, Unit]): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: js.UndefOr[scala.Nothing],
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: Double,
    opt_max: js.UndefOr[scala.Nothing],
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: Double,
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: js.UndefOr[scala.Nothing],
    opt_min: Double,
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(opt_onprogress: js.Function1[/* req */ Request, Unit], opt_bounds: Rect): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: js.UndefOr[scala.Nothing],
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: js.UndefOr[scala.Nothing],
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(opt_onprogress: js.Function1[/* req */ Request, Unit], opt_bounds: Rect, opt_min: Double): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: Double,
    opt_max: js.UndefOr[scala.Nothing],
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: Double,
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: Double,
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  
  /**
    * This method changes the map zoom while keeping target screen coordinates specified as x,y at the same place where they were before.
    * @param zoom {number} - new zoom level
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    */
  def zoomAt(zoom: Double, x: Double, y: Double): Unit = js.native
}
