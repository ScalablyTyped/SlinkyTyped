package typingsSlinky.ol.groupMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonlayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerGroup
  extends typingsSlinky.ol.baseMod.default {
  
  def getLayers(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.baseMod.default] = js.native
  
  @JSName("on")
  def on_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  def setLayers(layers: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.baseMod.default]): Unit = js.native
  
  @JSName("un")
  def un_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
