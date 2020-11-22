package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.IHandle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`double-click`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`immediate-click`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`immediate-double-click`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`key-down`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`key-up`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`layerview-create-error`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`layerview-create`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`layerview-destroy`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`mouse-wheel`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`pointer-down`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`pointer-enter`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`pointer-leave`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`pointer-move`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`pointer-up`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blur
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.click
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.drag
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.focus
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hold
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View
  extends Accessor
     with corePromise
     with Evented
     with DOMContainer {
  
  /**
    * Collection containing a flat list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) related to the basemap, operational layers, and group layers in this view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#allLayerViews)
    */
  var allLayerViews: Collection[LayerView] = js.native
  
  /**
    * Represents an ongoing view animation initialized by [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#animation)
    */
  var animation: ViewAnimation = js.native
  
  /**
    * Represents the view for a single basemap after it has been added to the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#basemapView)
    */
  var basemapView: BasemapView = js.native
  
  /**
    * A fatal [error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) returned when the view loses its WebGL context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#fatalError)
    */
  var fatalError: Error = js.native
  
  /**
    * Sets the focus on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#focus)
    */
  def focus(): Unit = js.native
  
  /**
    * Allows for adding [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) directly to the default graphics in the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics)
    */
  var graphics: Collection[Graphic] = js.native
  
  /**
    * Options to configure input handling of the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#input)
    */
  val input: inputInput = js.native
  
  /**
    * Indication whether the view is being interacted with (for example when panning or by an interactive tool).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#interacting)
    */
  val interacting: Boolean = js.native
  
  /**
    * A collection containing a hierarchical list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of the [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#layerViews)
    */
  var layerViews: Collection[LayerView] = js.native
  
  /**
    * An instance of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) object to display in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map)
    */
  var map: Map = js.native
  
  /**
    * Indication whether the view is being navigated (for example when panning).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#navigating)
    */
  val navigating: Boolean = js.native
  
  /**
    * Options to configure the navigation behavior of the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#navigation)
    */
  var navigation: Navigation = js.native
  
  /**
    * Registers an event handler on the instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#on)
    */
  def on(`type`: String, modifiersOrHandler: js.Array[String]): js.Any = js.native
  def on(`type`: String, modifiersOrHandler: js.Array[String], handler: js.Function): js.Any = js.native
  def on(`type`: String, modifiersOrHandler: js.Function): js.Any = js.native
  def on(`type`: String, modifiersOrHandler: js.Function, handler: js.Function): js.Any = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Array[String]): js.Any = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Array[String], handler: js.Function): js.Any = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Function): js.Any = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Function, handler: js.Function): js.Any = js.native
  @JSName("on")
  def on_blur(name: blur, eventHandler: ViewBlurEventHandler): IHandle = js.native
  @JSName("on")
  def on_blur(name: blur, modifiers: js.Array[String], eventHandler: ViewBlurEventHandler): IHandle = js.native
  @JSName("on")
  def on_click(name: click, eventHandler: ViewClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_click(name: click, modifiers: js.Array[String], eventHandler: ViewClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_doubleclick(name: `double-click`, eventHandler: ViewDoubleClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_doubleclick(name: `double-click`, modifiers: js.Array[String], eventHandler: ViewDoubleClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_drag(name: drag, eventHandler: ViewDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_drag(name: drag, modifiers: js.Array[String], eventHandler: ViewDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_focus(name: focus, eventHandler: ViewFocusEventHandler): IHandle = js.native
  @JSName("on")
  def on_focus(name: focus, modifiers: js.Array[String], eventHandler: ViewFocusEventHandler): IHandle = js.native
  @JSName("on")
  def on_hold(name: hold, eventHandler: ViewHoldEventHandler): IHandle = js.native
  @JSName("on")
  def on_hold(name: hold, modifiers: js.Array[String], eventHandler: ViewHoldEventHandler): IHandle = js.native
  @JSName("on")
  def on_immediateclick(name: `immediate-click`, eventHandler: ViewImmediateClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_immediateclick(name: `immediate-click`, modifiers: js.Array[String], eventHandler: ViewImmediateClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_immediatedoubleclick(name: `immediate-double-click`, eventHandler: ViewImmediateDoubleClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_immediatedoubleclick(
    name: `immediate-double-click`,
    modifiers: js.Array[String],
    eventHandler: ViewImmediateDoubleClickEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_keydown(name: `key-down`, eventHandler: ViewKeyDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_keydown(name: `key-down`, modifiers: js.Array[String], eventHandler: ViewKeyDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_keyup(name: `key-up`, eventHandler: ViewKeyUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_keyup(name: `key-up`, modifiers: js.Array[String], eventHandler: ViewKeyUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: ViewLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreate(
    name: `layerview-create`,
    modifiers: js.Array[String],
    eventHandler: ViewLayerviewCreateEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: ViewLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(
    name: `layerview-create-error`,
    modifiers: js.Array[String],
    eventHandler: ViewLayerviewCreateErrorEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: ViewLayerviewDestroyEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(
    name: `layerview-destroy`,
    modifiers: js.Array[String],
    eventHandler: ViewLayerviewDestroyEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_mousewheel(name: `mouse-wheel`, eventHandler: ViewMouseWheelEventHandler): IHandle = js.native
  @JSName("on")
  def on_mousewheel(name: `mouse-wheel`, modifiers: js.Array[String], eventHandler: ViewMouseWheelEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerdown(name: `pointer-down`, eventHandler: ViewPointerDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerdown(name: `pointer-down`, modifiers: js.Array[String], eventHandler: ViewPointerDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerenter(name: `pointer-enter`, eventHandler: ViewPointerEnterEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerenter(name: `pointer-enter`, modifiers: js.Array[String], eventHandler: ViewPointerEnterEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerleave(name: `pointer-leave`, eventHandler: ViewPointerLeaveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerleave(name: `pointer-leave`, modifiers: js.Array[String], eventHandler: ViewPointerLeaveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointermove(name: `pointer-move`, eventHandler: ViewPointerMoveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointermove(name: `pointer-move`, modifiers: js.Array[String], eventHandler: ViewPointerMoveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerup(name: `pointer-up`, eventHandler: ViewPointerUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerup(name: `pointer-up`, modifiers: js.Array[String], eventHandler: ViewPointerUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_resize(name: resize, eventHandler: ViewResizeEventHandler): IHandle = js.native
  @JSName("on")
  def on_resize(name: resize, modifiers: js.Array[String], eventHandler: ViewResizeEventHandler): IHandle = js.native
  
  /**
    * Use the padding property to make the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center), and [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent), etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#padding)
    */
  var padding: ViewPadding = js.native
  
  /**
    * When `true`, this property indicates whether the view successfully satisfied all dependencies, signaling that the following conditions are met.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#ready)
    */
  val ready: Boolean = js.native
  
  /**
    * Represents the current value of one pixel in the unit of the view's [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#resolution)
    */
  val resolution: Double = js.native
  
  /**
    * The spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * Indication whether the view is animating, being navigated with or resizing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#stationary)
    */
  val stationary: Boolean = js.native
  
  /**
    * The view's time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
  
  /**
    * Call this method to clear any [fatal errors](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#fatalError) resulting from a lost WebGL context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#tryFatalErrorRecovery)
    */
  def tryFatalErrorRecovery(): Unit = js.native
  
  /**
    * The type of the view is either `2d` (indicating a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html)) or `3d` (indicating a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#type)
    */
  val `type`: String = js.native
  
  /**
    * Indicates whether the view is being updated by additional data requests to the network, or by processing received data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#updating)
    */
  val updating: Boolean = js.native
  
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: CSVLayer): js.Promise[CSVLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: FeatureLayer): js.Promise[FeatureLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: GeoJSONLayer): js.Promise[GeoJSONLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: GeoRSSLayer): js.Promise[GeoRSSLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: GraphicsLayer): js.Promise[GraphicsLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: ImageryLayer): js.Promise[ImageryLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: KMLLayer): js.Promise[KMLLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: Layer): js.Promise[LayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: PointCloudLayer): js.Promise[PointCloudLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: SceneLayer): js.Promise[SceneLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    */
  def whenLayerView(layer: StreamLayer): js.Promise[StreamLayerView] = js.native
}
