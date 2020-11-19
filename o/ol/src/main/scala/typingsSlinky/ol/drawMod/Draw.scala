package typingsSlinky.ol.drawMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olStrings.drawabort
import typingsSlinky.ol.olStrings.drawend
import typingsSlinky.ol.olStrings.drawstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draw
  extends typingsSlinky.ol.pointerMod.default {
  
  def abortDrawing(): Unit = js.native
  
  def appendCoordinates(coordinates: LineCoordType): Unit = js.native
  
  def extend(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.lineStringMod.default]): Unit = js.native
  
  def finishDrawing(): Unit = js.native
  
  def getOverlay(): typingsSlinky.ol.vectorMod.default = js.native
  
  @JSName("on")
  def on_drawabort(`type`: drawabort, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_drawabort(`type`: drawabort, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  
  def removeLastPoint(): Unit = js.native
  
  @JSName("un")
  def un_drawabort(`type`: drawabort, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
}
