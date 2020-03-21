package typingsSlinky.ol.overlayMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonelement
import typingsSlinky.ol.olStrings.changeColonmap
import typingsSlinky.ol.olStrings.changeColonoffset
import typingsSlinky.ol.olStrings.changeColonposition
import typingsSlinky.ol.olStrings.changeColonpositioning
import typingsSlinky.ol.overlayPositioningMod.OverlayPositioning
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay
  extends typingsSlinky.ol.objectMod.default {
  var autoPan: Boolean = js.native
  var autoPanAnimation: PanOptions = js.native
  var autoPanMargin: Double = js.native
  var element: HTMLElement = js.native
  var id: Double | String = js.native
  var insertFirst: Boolean = js.native
  var mapPostrenderListenerKey: EventsKey = js.native
  var options: Options = js.native
  var rendered: js.Any = js.native
  var stopEvent: Boolean = js.native
  def getElement(): HTMLElement = js.native
  def getId(): Double | String = js.native
  def getMap(): typingsSlinky.ol.pluggableMapMod.default = js.native
  def getOffset(): js.Array[Double] = js.native
  def getOptions(): Options = js.native
  def getPosition(): Coordinate = js.native
  def getPositioning(): OverlayPositioning = js.native
  /* protected */ def getRect(element: HTMLElement, size: Size): Extent = js.native
  /* protected */ def handleElementChanged(): Unit = js.native
  /* protected */ def handleMapChanged(): Unit = js.native
  /* protected */ def handleOffsetChanged(): Unit = js.native
  /* protected */ def handlePositionChanged(): Unit = js.native
  /* protected */ def handlePositioningChanged(): Unit = js.native
  @JSName("on")
  def on_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  /* protected */ def panIntoView(): Unit = js.native
  /* protected */ def render(): Unit = js.native
  def setElement(): Unit = js.native
  def setElement(element: HTMLElement): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
  def setOffset(offset: js.Array[Double]): Unit = js.native
  def setPosition(): Unit = js.native
  def setPosition(position: Coordinate): Unit = js.native
  def setPositioning(positioning: OverlayPositioning): Unit = js.native
  /* protected */ def setVisible(visible: Boolean): Unit = js.native
  @JSName("un")
  def un_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  /* protected */ def updatePixelPosition(): Unit = js.native
  /* protected */ def updateRenderedPosition(pixel: Pixel): Unit = js.native
  /* protected */ def updateRenderedPosition(pixel: Pixel, mapSize: Size): Unit = js.native
}

