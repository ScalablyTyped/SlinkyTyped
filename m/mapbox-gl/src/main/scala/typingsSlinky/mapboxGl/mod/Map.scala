package typingsSlinky.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.mapboxGl.anon.Data
import typingsSlinky.mapboxGl.anon.Diff
import typingsSlinky.mapboxGl.anon.PixelRatio
import typingsSlinky.mapboxGl.anon.layersArraystringundefine
import typingsSlinky.mapboxGl.anon.sourceLayerstringundefine
import typingsSlinky.mapboxGl.mapboxGlStrings.`bottom-left`
import typingsSlinky.mapboxGl.mapboxGlStrings.`bottom-right`
import typingsSlinky.mapboxGl.mapboxGlStrings.`top-left`
import typingsSlinky.mapboxGl.mapboxGlStrings.`top-right`
import typingsSlinky.mapboxGl.mapboxGlStrings.boxzoomcancel
import typingsSlinky.mapboxGl.mapboxGlStrings.boxzoomend
import typingsSlinky.mapboxGl.mapboxGlStrings.boxzoomstart
import typingsSlinky.mapboxGl.mapboxGlStrings.click
import typingsSlinky.mapboxGl.mapboxGlStrings.contextmenu
import typingsSlinky.mapboxGl.mapboxGlStrings.data
import typingsSlinky.mapboxGl.mapboxGlStrings.dataloading
import typingsSlinky.mapboxGl.mapboxGlStrings.dblclick
import typingsSlinky.mapboxGl.mapboxGlStrings.drag
import typingsSlinky.mapboxGl.mapboxGlStrings.dragend
import typingsSlinky.mapboxGl.mapboxGlStrings.dragstart
import typingsSlinky.mapboxGl.mapboxGlStrings.error
import typingsSlinky.mapboxGl.mapboxGlStrings.idle
import typingsSlinky.mapboxGl.mapboxGlStrings.load
import typingsSlinky.mapboxGl.mapboxGlStrings.mousedown
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseenter
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseleave
import typingsSlinky.mapboxGl.mapboxGlStrings.mousemove
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseout
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseover
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseup
import typingsSlinky.mapboxGl.mapboxGlStrings.move
import typingsSlinky.mapboxGl.mapboxGlStrings.moveend
import typingsSlinky.mapboxGl.mapboxGlStrings.movestart
import typingsSlinky.mapboxGl.mapboxGlStrings.pitch
import typingsSlinky.mapboxGl.mapboxGlStrings.pitchend
import typingsSlinky.mapboxGl.mapboxGlStrings.pitchstart
import typingsSlinky.mapboxGl.mapboxGlStrings.remove
import typingsSlinky.mapboxGl.mapboxGlStrings.render
import typingsSlinky.mapboxGl.mapboxGlStrings.resize
import typingsSlinky.mapboxGl.mapboxGlStrings.rotate
import typingsSlinky.mapboxGl.mapboxGlStrings.rotateend
import typingsSlinky.mapboxGl.mapboxGlStrings.rotatestart
import typingsSlinky.mapboxGl.mapboxGlStrings.sourcedata
import typingsSlinky.mapboxGl.mapboxGlStrings.sourcedataloading
import typingsSlinky.mapboxGl.mapboxGlStrings.styledata
import typingsSlinky.mapboxGl.mapboxGlStrings.styledataloading
import typingsSlinky.mapboxGl.mapboxGlStrings.tiledataloading
import typingsSlinky.mapboxGl.mapboxGlStrings.touchcancel
import typingsSlinky.mapboxGl.mapboxGlStrings.touchend
import typingsSlinky.mapboxGl.mapboxGlStrings.touchmove
import typingsSlinky.mapboxGl.mapboxGlStrings.touchstart
import typingsSlinky.mapboxGl.mapboxGlStrings.webglcontextlost
import typingsSlinky.mapboxGl.mapboxGlStrings.webglcontextrestored
import typingsSlinky.mapboxGl.mapboxGlStrings.wheel
import typingsSlinky.mapboxGl.mapboxGlStrings.zoom
import typingsSlinky.mapboxGl.mapboxGlStrings.zoomend
import typingsSlinky.mapboxGl.mapboxGlStrings.zoomstart
import typingsSlinky.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "Map")
@js.native
class Map () extends Evented {
  def this(options: MapboxOptions) = this()
  
  def addControl(control: Control): this.type = js.native
  def addControl(control: IControl): this.type = js.native
  @JSName("addControl")
  def addControl_bottomleft(control: Control, position: `bottom-left`): this.type = js.native
  @JSName("addControl")
  def addControl_bottomleft(control: IControl, position: `bottom-left`): this.type = js.native
  @JSName("addControl")
  def addControl_bottomright(control: Control, position: `bottom-right`): this.type = js.native
  @JSName("addControl")
  def addControl_bottomright(control: IControl, position: `bottom-right`): this.type = js.native
  @JSName("addControl")
  def addControl_topleft(control: Control, position: `top-left`): this.type = js.native
  @JSName("addControl")
  def addControl_topleft(control: IControl, position: `top-left`): this.type = js.native
  @JSName("addControl")
  def addControl_topright(control: Control, position: `top-right`): this.type = js.native
  @JSName("addControl")
  def addControl_topright(control: IControl, position: `top-right`): this.type = js.native
  
  def addImage(name: String, image: js.typedarray.ArrayBufferView): this.type = js.native
  def addImage(name: String, image: js.typedarray.ArrayBufferView, options: PixelRatio): this.type = js.native
  def addImage(name: String, image: HTMLImageElement): this.type = js.native
  def addImage(name: String, image: HTMLImageElement, options: PixelRatio): this.type = js.native
  def addImage(name: String, image: ImageData): this.type = js.native
  def addImage(name: String, image: ImageData, options: PixelRatio): this.type = js.native
  def addImage(name: String, image: Data): this.type = js.native
  def addImage(name: String, image: Data, options: PixelRatio): this.type = js.native
  def addImage(name: String, image: ImageBitmap): this.type = js.native
  def addImage(name: String, image: ImageBitmap, options: PixelRatio): this.type = js.native
  
  def addLayer(layer: CustomLayerInterface): this.type = js.native
  def addLayer(layer: CustomLayerInterface, before: String): this.type = js.native
  def addLayer(layer: Layer): this.type = js.native
  def addLayer(layer: Layer, before: String): this.type = js.native
  
  def addSource(id: String, source: AnySourceData): this.type = js.native
  
  def areTilesLoaded(): Boolean = js.native
  
  var boxZoom: BoxZoomHandler = js.native
  
  def cameraForBounds(bounds: LngLatBoundsLike): js.UndefOr[CameraForBoundsResult] = js.native
  def cameraForBounds(bounds: LngLatBoundsLike, options: CameraForBoundsOptions): js.UndefOr[CameraForBoundsResult] = js.native
  
  var doubleClickZoom: DoubleClickZoomHandler = js.native
  
  var dragPan: DragPanHandler = js.native
  
  var dragRotate: DragRotateHandler = js.native
  
  def easeTo(options: EaseToOptions): this.type = js.native
  def easeTo(options: EaseToOptions, eventData: EventData): this.type = js.native
  
  def fitBounds(bounds: LngLatBoundsLike): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: js.UndefOr[scala.Nothing], eventData: EventData): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions, eventData: EventData): this.type = js.native
  
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double, options: AnimationOptions with CameraOptions): this.type = js.native
  def fitScreenCoordinates(
    p0: PointLike,
    p1: PointLike,
    bearing: Double,
    options: AnimationOptions with CameraOptions,
    eventData: EventData
  ): this.type = js.native
  def fitScreenCoordinates(
    p0: PointLike,
    p1: PointLike,
    bearing: Double,
    options: js.UndefOr[scala.Nothing],
    eventData: EventData
  ): this.type = js.native
  
  def flyTo(options: FlyToOptions): this.type = js.native
  def flyTo(options: FlyToOptions, eventData: EventData): this.type = js.native
  
  def getBearing(): Double = js.native
  
  def getBounds(): LngLatBounds = js.native
  
  def getCanvas(): HTMLCanvasElement = js.native
  
  def getCanvasContainer(): HTMLElement = js.native
  
  def getCenter(): LngLat = js.native
  
  def getContainer(): HTMLElement = js.native
  
  def getFeatureState(feature: FeatureIdentifier): StringDictionary[js.Any] = js.native
  def getFeatureState(feature: MapboxGeoJSONFeature): StringDictionary[js.Any] = js.native
  
  def getFilter(layer: String): js.Array[_] = js.native
  
  def getLayer(id: String): Layer = js.native
  
  def getLayoutProperty(layer: String, name: String): js.Any = js.native
  
  def getLight(): Light = js.native
  
  def getMaxBounds(): LngLatBounds | Null = js.native
  
  def getMaxPitch(): Double = js.native
  
  def getMaxZoom(): Double = js.native
  
  def getMinPitch(): Double = js.native
  
  def getMinZoom(): Double = js.native
  
  /**
    * Returns the current padding applied around the map viewport.
    *
    * @memberof Map#
    * @returns The current padding around the map viewport.
    */
  def getPadding(): PaddingOptions = js.native
  
  def getPaintProperty(layer: String, name: String): js.Any = js.native
  
  def getPitch(): Double = js.native
  
  def getRenderWorldCopies(): Boolean = js.native
  
  def getSource(id: String): AnySourceImpl = js.native
  
  def getStyle(): Style = js.native
  
  def getZoom(): Double = js.native
  
  def hasImage(name: String): Boolean = js.native
  
  def isEasing(): Boolean = js.native
  
  def isMoving(): Boolean = js.native
  
  def isRotating(): Boolean = js.native
  
  def isSourceLoaded(id: String): Boolean = js.native
  
  def isStyleLoaded(): Boolean = js.native
  
  def isZooming(): Boolean = js.native
  
  def jumpTo(options: CameraOptions): this.type = js.native
  def jumpTo(options: CameraOptions, eventData: EventData): this.type = js.native
  
  var keyboard: KeyboardHandler = js.native
  
  def listImages(): js.Array[String] = js.native
  
  def loadImage(url: String, callback: js.Function): this.type = js.native
  
  def loaded(): Boolean = js.native
  
  def moveLayer(id: String): this.type = js.native
  def moveLayer(id: String, beforeId: String): this.type = js.native
  
  def off(`type`: String, listener: js.Function1[/* ev */ js.Any, Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_drag(
    `type`: drag,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dragend(
    `type`: dragend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dragstart(
    `type`: dragstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_idle(
    `type`: idle,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_load(
    `type`: load,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pitch(
    `type`: pitch,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_pitchend(
    `type`: pitchend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_remove(
    `type`: remove,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_render(
    `type`: render,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_resize(
    `type`: resize,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rotate(
    `type`: rotate,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rotateend(
    `type`: rotateend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_sourcedataloading(
    `type`: sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_styledataloading(`type`: styledataloading, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_webglcontextrestored(
    `type`: webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  
  def on(`type`: String, listener: js.Function1[/* ev */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_drag(
    `type`: drag,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dragend(
    `type`: dragend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dragstart(
    `type`: dragstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_idle(
    `type`: idle,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_load(
    `type`: load,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pitch(
    `type`: pitch,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pitchend(
    `type`: pitchend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_remove(
    `type`: remove,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_render(
    `type`: render,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_resize(
    `type`: resize,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rotate(
    `type`: rotate,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rotateend(
    `type`: rotateend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_sourcedataloading(
    `type`: sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_styledataloading(`type`: styledataloading, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_webglcontextrestored(
    `type`: webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  
  def once(`type`: String, listener: js.Function1[/* ev */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_drag(
    `type`: drag,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dragend(
    `type`: dragend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dragstart(
    `type`: dragstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_idle(
    `type`: idle,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_load(
    `type`: load,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pitch(
    `type`: pitch,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pitchend(
    `type`: pitchend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remove(
    `type`: remove,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_render(
    `type`: render,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_resize(
    `type`: resize,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rotate(
    `type`: rotate,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rotateend(
    `type`: rotateend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_sourcedataloading(
    `type`: sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_styledataloading(`type`: styledataloading, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_webglcontextrestored(
    `type`: webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  
  def panBy(offset: PointLike): this.type = js.native
  def panBy(offset: PointLike, options: js.UndefOr[scala.Nothing], eventData: EventData): this.type = js.native
  def panBy(offset: PointLike, options: AnimationOptions): this.type = js.native
  def panBy(offset: PointLike, options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def panTo(lnglat: LngLatLike): this.type = js.native
  def panTo(lnglat: LngLatLike, options: js.UndefOr[scala.Nothing], eventdata: EventData): this.type = js.native
  def panTo(lnglat: LngLatLike, options: AnimationOptions): this.type = js.native
  def panTo(lnglat: LngLatLike, options: AnimationOptions, eventdata: EventData): this.type = js.native
  
  def project(lnglat: LngLatLike): Point = js.native
  
  /**
    * Returns an array of GeoJSON Feature objects representing visible features that satisfy the query parameters.
    *
    * The properties value of each returned feature object contains the properties of its source feature. For GeoJSON sources, only string and numeric property values are supported (i.e. null, Array, and Object values are not supported).
    *
    * Each feature includes top-level layer, source, and sourceLayer properties. The layer property is an object representing the style layer to which the feature belongs. Layout and paint properties in this object contain values which are fully evaluated for the given zoom level and feature.
    *
    * Only features that are currently rendered are included. Some features will not be included, like:
    *
    * - Features from layers whose visibility property is "none".
    * - Features from layers whose zoom range excludes the current zoom level.
    * - Symbol features that have been hidden due to text or icon collision.
    *
    * Features from all other layers are included, including features that may have no visible contribution to the rendered result; for example, because the layer's opacity or color alpha component is set to 0.
    *
    * The topmost rendered feature appears first in the returned array, and subsequent features are sorted by descending z-order. Features that are rendered multiple times (due to wrapping across the antimeridian at low zoom levels) are returned only once (though subject to the following caveat).
    *
    * Because features come from tiled vector data or GeoJSON data that is converted to tiles internally, feature geometries may be split or duplicated across tile boundaries and, as a result, features may appear multiple times in query results. For example, suppose there is a highway running through the bounding rectangle of a query. The results of the query will be those parts of the highway that lie within the map tiles covering the bounding rectangle, even if the highway extends into other tiles, and the portion of the highway within each map tile will be returned as a separate feature. Similarly, a point feature near a tile boundary may appear in multiple tiles due to tile buffering.
    *
    * @param pointOrBox The geometry of the query region: either a single point or southwest and northeast points describing a bounding box. Omitting this parameter (i.e. calling Map#queryRenderedFeatures with zero arguments, or with only a  options argument) is equivalent to passing a bounding box encompassing the entire map viewport.
    * @param options
    */
  def queryRenderedFeatures(): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: js.UndefOr[PointLike], options: layersArraystringundefine): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: js.Tuple2[PointLike, PointLike]): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: js.Tuple2[PointLike, PointLike], options: layersArraystringundefine): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: PointLike): js.Array[MapboxGeoJSONFeature] = js.native
  
  /**
    * Returns an array of GeoJSON Feature objects representing features within the specified vector tile or GeoJSON source that satisfy the query parameters.
    *
    * In contrast to Map#queryRenderedFeatures, this function returns all features matching the query parameters, whether or not they are rendered by the current style (i.e. visible). The domain of the query includes all currently-loaded vector tiles and GeoJSON source tiles: this function does not check tiles outside the currently visible viewport.
    *
    * Because features come from tiled vector data or GeoJSON data that is converted to tiles internally, feature geometries may be split or duplicated across tile boundaries and, as a result, features may appear multiple times in query results. For example, suppose there is a highway running through the bounding rectangle of a query. The results of the query will be those parts of the highway that lie within the map tiles covering the bounding rectangle, even if the highway extends into other tiles, and the portion of the highway within each map tile will be returned as a separate feature. Similarly, a point feature near a tile boundary may appear in multiple tiles due to tile buffering.
    *
    * @param sourceID The ID of the vector tile or GeoJSON source to query.
    * @param parameters
    */
  def querySourceFeatures(sourceID: String): js.Array[MapboxGeoJSONFeature] = js.native
  def querySourceFeatures(sourceID: String, parameters: sourceLayerstringundefine): js.Array[MapboxGeoJSONFeature] = js.native
  
  def remove(): Unit = js.native
  
  def removeControl(control: Control): this.type = js.native
  def removeControl(control: IControl): this.type = js.native
  
  def removeFeatureState(target: FeatureIdentifier): Unit = js.native
  def removeFeatureState(target: FeatureIdentifier, key: String): Unit = js.native
  def removeFeatureState(target: MapboxGeoJSONFeature): Unit = js.native
  def removeFeatureState(target: MapboxGeoJSONFeature, key: String): Unit = js.native
  
  def removeImage(name: String): this.type = js.native
  
  def removeLayer(id: String): this.type = js.native
  
  def removeSource(id: String): this.type = js.native
  
  var repaint: Boolean = js.native
  
  def resetNorth(): this.type = js.native
  def resetNorth(options: js.UndefOr[scala.Nothing], eventData: EventData): this.type = js.native
  def resetNorth(options: AnimationOptions): this.type = js.native
  def resetNorth(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def resetNorthPitch(): this.type = js.native
  def resetNorthPitch(options: js.UndefOr[scala.Nothing], eventData: EventData): this.type = js.native
  def resetNorthPitch(options: Null, eventData: EventData): this.type = js.native
  def resetNorthPitch(options: AnimationOptions): this.type = js.native
  def resetNorthPitch(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def resize(): this.type = js.native
  def resize(eventData: EventData): this.type = js.native
  
  def rotateTo(bearing: Double): this.type = js.native
  def rotateTo(bearing: Double, options: js.UndefOr[scala.Nothing], eventData: EventData): this.type = js.native
  def rotateTo(bearing: Double, options: AnimationOptions): this.type = js.native
  def rotateTo(bearing: Double, options: AnimationOptions, eventData: EventData): this.type = js.native
  
  var scrollZoom: ScrollZoomHandler = js.native
  
  def setBearing(bearing: Double): this.type = js.native
  def setBearing(bearing: Double, eventData: EventData): this.type = js.native
  
  def setCenter(center: LngLatLike): this.type = js.native
  def setCenter(center: LngLatLike, eventData: EventData): this.type = js.native
  
  def setFeatureState(feature: FeatureIdentifier, state: StringDictionary[js.Any]): Unit = js.native
  def setFeatureState(feature: MapboxGeoJSONFeature, state: StringDictionary[js.Any]): Unit = js.native
  
  def setFilter(layer: String): this.type = js.native
  def setFilter(layer: String, filter: js.UndefOr[scala.Nothing], options: FilterOptions): this.type = js.native
  def setFilter(layer: String, filter: js.Array[_]): this.type = js.native
  def setFilter(layer: String, filter: js.Array[_], options: FilterOptions): this.type = js.native
  def setFilter(layer: String, filter: Boolean): this.type = js.native
  def setFilter(layer: String, filter: Boolean, options: FilterOptions): this.type = js.native
  def setFilter(layer: String, filter: Null, options: FilterOptions): this.type = js.native
  
  def setLayerZoomRange(layerId: String, minzoom: Double, maxzoom: Double): this.type = js.native
  
  def setLayoutProperty(layer: String, name: String, value: js.Any): this.type = js.native
  
  def setLight(options: Light): this.type = js.native
  def setLight(options: Light, lightOptions: js.Any): this.type = js.native
  
  def setMaxBounds(): this.type = js.native
  def setMaxBounds(lnglatbounds: LngLatBoundsLike): this.type = js.native
  
  def setMaxPitch(): this.type = js.native
  def setMaxPitch(maxPitch: Double): this.type = js.native
  
  def setMaxZoom(): this.type = js.native
  def setMaxZoom(maxZoom: Double): this.type = js.native
  
  def setMinPitch(): this.type = js.native
  def setMinPitch(minPitch: Double): this.type = js.native
  
  def setMinZoom(): this.type = js.native
  def setMinZoom(minZoom: Double): this.type = js.native
  
  /**
    * Sets the padding in pixels around the viewport.
    *
    * Equivalent to `jumpTo({padding: padding})`.
    *
    * @memberof Map#
    * @param padding The desired padding. Format: { left: number, right: number, top: number, bottom: number }
    * @param eventData Additional properties to be added to event objects of events triggered by this method.
    * @fires movestart
    * @fires moveend
    * @returns {Map} `this`
    * @example
    * // Sets a left padding of 300px, and a top padding of 50px
    * map.setPadding({ left: 300, top: 50 });
    */
  def setPadding(padding: PaddingOptions): this.type = js.native
  def setPadding(padding: PaddingOptions, eventData: EventData): this.type = js.native
  
  def setPaintProperty(layer: String, name: String, value: js.Any): this.type = js.native
  def setPaintProperty(layer: String, name: String, value: js.Any, klass: String): this.type = js.native
  
  def setPitch(pitch: Double): this.type = js.native
  def setPitch(pitch: Double, eventData: EventData): this.type = js.native
  
  def setRenderWorldCopies(): this.type = js.native
  def setRenderWorldCopies(renderWorldCopies: Boolean): this.type = js.native
  
  def setStyle(style: String): this.type = js.native
  def setStyle(style: String, options: Diff): this.type = js.native
  def setStyle(style: Style): this.type = js.native
  def setStyle(style: Style, options: Diff): this.type = js.native
  
  def setZoom(zoom: Double): this.type = js.native
  def setZoom(zoom: Double, eventData: EventData): this.type = js.native
  
  var showCollisionBoxes: Boolean = js.native
  
  /**
    * Gets and sets a Boolean indicating whether the map will visualize
    * the padding offsets.
    *
    * @name showPadding
    * @type {boolean}
    * @instance
    * @memberof Map
    */
  var showPadding: Boolean = js.native
  
  var showTileBoundaries: Boolean = js.native
  
  def snapToNorth(): this.type = js.native
  def snapToNorth(options: js.UndefOr[scala.Nothing], eventData: EventData): this.type = js.native
  def snapToNorth(options: AnimationOptions): this.type = js.native
  def snapToNorth(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def stop(): this.type = js.native
  
  var touchPitch: TouchPitchHandler = js.native
  
  var touchZoomRotate: TouchZoomRotateHandler = js.native
  
  def triggerRepaint(): Unit = js.native
  
  def unproject(point: PointLike): LngLat = js.native
  
  def zoomIn(): this.type = js.native
  def zoomIn(options: js.UndefOr[scala.Nothing], eventData: EventData): this.type = js.native
  def zoomIn(options: AnimationOptions): this.type = js.native
  def zoomIn(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def zoomOut(): this.type = js.native
  def zoomOut(options: js.UndefOr[scala.Nothing], eventData: EventData): this.type = js.native
  def zoomOut(options: AnimationOptions): this.type = js.native
  def zoomOut(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def zoomTo(zoom: Double): this.type = js.native
  def zoomTo(zoom: Double, options: js.UndefOr[scala.Nothing], eventData: EventData): this.type = js.native
  def zoomTo(zoom: Double, options: AnimationOptions): this.type = js.native
  def zoomTo(zoom: Double, options: AnimationOptions, eventData: EventData): this.type = js.native
}
