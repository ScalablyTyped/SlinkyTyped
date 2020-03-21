package typingsSlinky.ol.dragBoxMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olStrings.boxdrag
import typingsSlinky.ol.olStrings.boxend
import typingsSlinky.ol.olStrings.boxstart
import typingsSlinky.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragBox
  extends typingsSlinky.ol.pointerMod.default {
  def defaultBoxEndCondition(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default, startPixel: Pixel, endPixel: Pixel): Boolean = js.native
  def getGeometry(): typingsSlinky.ol.polygonMod.default = js.native
  @JSName("on")
  def on_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
  @JSName("un")
  def un_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
}

