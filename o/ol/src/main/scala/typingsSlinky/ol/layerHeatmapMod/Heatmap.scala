package typingsSlinky.ol.layerHeatmapMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonblur
import typingsSlinky.ol.olStrings.changeColongradient
import typingsSlinky.ol.olStrings.changeColonradius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heatmap
  extends typingsSlinky.ol.layerVectorMod.default {
  def getBlur(): Double = js.native
  def getGradient(): js.Array[String] = js.native
  def getRadius(): Double = js.native
  @JSName("on")
  def on_changeblur(`type`: changeColonblur, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changegradient(`type`: changeColongradient, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeradius(`type`: changeColonradius, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeblur(`type`: changeColonblur, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changegradient(`type`: changeColongradient, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeradius(`type`: changeColonradius, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setBlur(blur: Double): Unit = js.native
  def setGradient(colors: js.Array[String]): Unit = js.native
  def setRadius(radius: Double): Unit = js.native
  @JSName("un")
  def un_changeblur(`type`: changeColonblur, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changegradient(`type`: changeColongradient, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeradius(`type`: changeColonradius, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

