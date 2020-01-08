package typingsSlinky.ol.layerLayerMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonsource
import typingsSlinky.ol.olStrings.postcompose
import typingsSlinky.ol.olStrings.precompose
import typingsSlinky.ol.olStrings.render
import typingsSlinky.ol.olStrings.rendercomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer
  extends typingsSlinky.ol.layerBaseMod.default {
  def getSource(): typingsSlinky.ol.sourceSourceMod.default = js.native
  @JSName("on")
  def on_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
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
  def on_render(`type`: render, listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_rendercomplete(
    `type`: rendercomplete,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
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
  def once_render(`type`: render, listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_rendercomplete(
    `type`: rendercomplete,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): EventsKey = js.native
  def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
  def setSource(source: typingsSlinky.ol.sourceSourceMod.default): Unit = js.native
  @JSName("un")
  def un_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
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
  def un_render(`type`: render, listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_rendercomplete(
    `type`: rendercomplete,
    listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
  ): Unit = js.native
}

