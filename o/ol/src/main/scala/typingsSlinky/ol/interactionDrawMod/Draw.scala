package typingsSlinky.ol.interactionDrawMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olStrings.drawend
import typingsSlinky.ol.olStrings.drawstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draw
  extends typingsSlinky.ol.interactionPointerMod.default {
  def extend(feature: typingsSlinky.ol.featureMod.default): Unit = js.native
  def finishDrawing(): Unit = js.native
  def getOverlay(): typingsSlinky.ol.layerVectorMod.default = js.native
  @JSName("on")
  def on_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  def removeLastPoint(): Unit = js.native
  @JSName("un")
  def un_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
}

