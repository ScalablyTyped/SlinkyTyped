package typingsSlinky.ol.heatmapMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonblur
import typingsSlinky.ol.olStrings.changeColongradient
import typingsSlinky.ol.olStrings.changeColonradius
import typingsSlinky.ol.olStrings.postcompose
import typingsSlinky.ol.olStrings.precompose
import typingsSlinky.ol.olStrings.rendercomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heatmap
  extends typingsSlinky.ol.vectorMod.default {
  def getBlur(): Double = js.native
  def getGradient(): js.Array[String] = js.native
  def getRadius(): Double = js.native
  @JSName("on")
  def on_changeblur(`type`: changeColonblur, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changegradient(`type`: changeColongradient, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeradius(`type`: changeColonradius, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
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
  @JSName("once")
  def once_changeblur(`type`: changeColonblur, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changegradient(`type`: changeColongradient, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeradius(`type`: changeColonradius, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
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
  def setBlur(blur: Double): Unit = js.native
  def setGradient(colors: js.Array[String]): Unit = js.native
  def setRadius(radius: Double): Unit = js.native
  @JSName("un")
  def un_changeblur(`type`: changeColonblur, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changegradient(`type`: changeColongradient, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeradius(`type`: changeColonradius, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_postcompose(
    `type`: postcompose,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): Unit = js.native
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
}

