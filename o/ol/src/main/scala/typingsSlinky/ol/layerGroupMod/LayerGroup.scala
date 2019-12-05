package typingsSlinky.ol.layerGroupMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.`change:layers`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerGroup
  extends typingsSlinky.ol.layerBaseMod.default {
  def getLayers(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.layerBaseMod.default] = js.native
  @JSName("on")
  def on_changelayers(`type`: `change:layers`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changelayers(`type`: `change:layers`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setLayers(layers: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.layerBaseMod.default]): Unit = js.native
  @JSName("un")
  def un_changelayers(`type`: `change:layers`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

