package typingsSlinky.ol.pluggableMapMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.featureMod.FeatureLike
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.`change:layerGroup`
import typingsSlinky.ol.olStrings.`change:size`
import typingsSlinky.ol.olStrings.`change:target`
import typingsSlinky.ol.olStrings.`change:view`
import typingsSlinky.ol.olStrings.click
import typingsSlinky.ol.olStrings.dblclick
import typingsSlinky.ol.olStrings.moveend
import typingsSlinky.ol.olStrings.movestart
import typingsSlinky.ol.olStrings.pointerdrag
import typingsSlinky.ol.olStrings.pointermove
import typingsSlinky.ol.olStrings.postcompose
import typingsSlinky.ol.olStrings.postrender
import typingsSlinky.ol.olStrings.precompose
import typingsSlinky.ol.olStrings.rendercomplete
import typingsSlinky.ol.olStrings.singleclick
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluggableMap
  extends typingsSlinky.ol.objectMod.default {
  var controls: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] = js.native
  var interactions: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default] = js.native
  def addControl(control: typingsSlinky.ol.controlControlMod.default): Unit = js.native
  def addInteraction(interaction: typingsSlinky.ol.interactionInteractionMod.default): Unit = js.native
  def addLayer(layer: typingsSlinky.ol.layerBaseMod.default): Unit = js.native
  def addOverlay(overlay: typingsSlinky.ol.overlayMod.default): Unit = js.native
  def createRenderer(): typingsSlinky.ol.rendererMapMod.default = js.native
  def forEachFeatureAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[/* this */ S, /* p0 */ FeatureLike, /* p1 */ typingsSlinky.ol.layerLayerMod.default, T]
  ): js.UndefOr[T] = js.native
  def forEachFeatureAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[/* this */ S, /* p0 */ FeatureLike, /* p1 */ typingsSlinky.ol.layerLayerMod.default, T],
    opt_options: AtPixelOptions
  ): js.UndefOr[T] = js.native
  def forEachLayerAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ typingsSlinky.ol.layerLayerMod.default, 
      /* p1 */ scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint8Array, 
      T
    ]
  ): js.UndefOr[T] = js.native
  def forEachLayerAtPixel[S, T](
    pixel: Pixel,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ typingsSlinky.ol.layerLayerMod.default, 
      /* p1 */ scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint8Array, 
      T
    ],
    opt_options: AtPixelOptions
  ): js.UndefOr[T] = js.native
  def getControls(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] = js.native
  def getCoordinateFromPixel(pixel: Pixel): Coordinate = js.native
  def getEventCoordinate(event: typingsSlinky.ol.eventsEventMod.default): Coordinate = js.native
  def getEventPixel(event: typingsSlinky.ol.eventsEventMod.default): Pixel = js.native
  def getEventPixel(event: TouchEvent): Pixel = js.native
  def getFeaturesAtPixel(pixel: Pixel): js.Array[FeatureLike] = js.native
  def getFeaturesAtPixel(pixel: Pixel, opt_options: AtPixelOptions): js.Array[FeatureLike] = js.native
  def getInteractions(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default] = js.native
  def getLayerGroup(): typingsSlinky.ol.layerGroupMod.default = js.native
  def getLayers(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.layerBaseMod.default] = js.native
  def getOverlayById(id: String): typingsSlinky.ol.overlayMod.default = js.native
  def getOverlayById(id: Double): typingsSlinky.ol.overlayMod.default = js.native
  def getOverlayContainer(): HTMLElement = js.native
  def getOverlayContainerStopEvent(): HTMLElement = js.native
  def getOverlays(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.overlayMod.default] = js.native
  def getPixelFromCoordinate(coordinate: Coordinate): Pixel = js.native
  def getRenderer(): typingsSlinky.ol.rendererMapMod.default = js.native
  def getSize(): js.UndefOr[Size] = js.native
  def getTarget(): js.UndefOr[HTMLElement | String] = js.native
  def getTargetElement(): HTMLElement = js.native
  def getTilePriority(
    tile: typingsSlinky.ol.tileMod.default,
    tileSourceKey: String,
    tileCenter: Coordinate,
    tileResolution: Double
  ): Double = js.native
  def getView(): typingsSlinky.ol.viewMod.default = js.native
  def getViewport(): HTMLElement = js.native
  def handleBrowserEvent(browserEvent: typingsSlinky.ol.eventsEventMod.default): Unit = js.native
  def handleBrowserEvent(browserEvent: typingsSlinky.ol.eventsEventMod.default, opt_type: String): Unit = js.native
  def handleMapBrowserEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default): Unit = js.native
  /* protected */ def handlePostRender(): Unit = js.native
  def hasFeatureAtPixel[U](pixel: Pixel): Boolean = js.native
  def hasFeatureAtPixel[U](pixel: Pixel, opt_options: AtPixelOptions): Boolean = js.native
  def isRendered(): Boolean = js.native
  @JSName("on")
  def on_changelayerGroup(`type`: `change:layerGroup`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changesize(`type`: `change:size`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetarget(`type`: `change:target`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeview(`type`: `change:view`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_click(`type`: click, listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_dblclick(
    `type`: dblclick,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_moveend(`type`: moveend, listener: js.Function1[/* evt */ typingsSlinky.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_movestart(`type`: movestart, listener: js.Function1[/* evt */ typingsSlinky.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_pointerdrag(
    `type`: pointerdrag,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_pointermove(
    `type`: pointermove,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_postrender(`type`: postrender, listener: js.Function1[/* evt */ typingsSlinky.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_precompose(
    `type`: precompose,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_rendercomplete(
    `type`: rendercomplete,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_singleclick(
    `type`: singleclick,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_changelayerGroup(`type`: `change:layerGroup`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changesize(`type`: `change:size`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetarget(`type`: `change:target`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeview(`type`: `change:view`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_click(`type`: click, listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_dblclick(
    `type`: dblclick,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_moveend(`type`: moveend, listener: js.Function1[/* evt */ typingsSlinky.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_movestart(`type`: movestart, listener: js.Function1[/* evt */ typingsSlinky.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_pointerdrag(
    `type`: pointerdrag,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_pointermove(
    `type`: pointermove,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_postrender(`type`: postrender, listener: js.Function1[/* evt */ typingsSlinky.ol.mapEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_precompose(
    `type`: precompose,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_rendercomplete(
    `type`: rendercomplete,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_singleclick(
    `type`: singleclick,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): EventsKey = js.native
  def removeControl(control: typingsSlinky.ol.controlControlMod.default): js.UndefOr[typingsSlinky.ol.controlControlMod.default] = js.native
  def removeInteraction(interaction: typingsSlinky.ol.interactionInteractionMod.default): js.UndefOr[typingsSlinky.ol.interactionInteractionMod.default] = js.native
  def removeLayer(layer: typingsSlinky.ol.layerBaseMod.default): js.UndefOr[typingsSlinky.ol.layerBaseMod.default] = js.native
  def removeOverlay(overlay: typingsSlinky.ol.overlayMod.default): js.UndefOr[typingsSlinky.ol.overlayMod.default] = js.native
  def render(): Unit = js.native
  def renderSync(): Unit = js.native
  def setLayerGroup(layerGroup: typingsSlinky.ol.layerGroupMod.default): Unit = js.native
  def setSize(): Unit = js.native
  def setSize(size: Size): Unit = js.native
  def setTarget(): Unit = js.native
  def setTarget(target: String): Unit = js.native
  def setTarget(target: typingsSlinky.std.HTMLElement): Unit = js.native
  def setView(view: typingsSlinky.ol.viewMod.default): Unit = js.native
  def skipFeature(feature: typingsSlinky.ol.featureMod.default): Unit = js.native
  @JSName("un")
  def un_changelayerGroup(`type`: `change:layerGroup`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changesize(`type`: `change:size`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetarget(`type`: `change:target`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeview(`type`: `change:view`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_click(`type`: click, listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_dblclick(
    `type`: dblclick,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_moveend(`type`: moveend, listener: js.Function1[/* evt */ typingsSlinky.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_movestart(`type`: movestart, listener: js.Function1[/* evt */ typingsSlinky.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_pointerdrag(
    `type`: pointerdrag,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_pointermove(
    `type`: pointermove,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_postrender(`type`: postrender, listener: js.Function1[/* evt */ typingsSlinky.ol.mapEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_precompose(
    `type`: precompose,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_rendercomplete(
    `type`: rendercomplete,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): Unit = js.native
  @JSName("un")
  def un_singleclick(
    `type`: singleclick,
    listener: js.Function1[/* evt */ typingsSlinky.ol.mapBrowserEventMod.default, Unit]
  ): Unit = js.native
  def unskipFeature(feature: typingsSlinky.ol.featureMod.default): Unit = js.native
  def updateSize(): Unit = js.native
}

