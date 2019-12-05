package typingsSlinky.ol.interactionInteractionMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.`change:active`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interaction
  extends typingsSlinky.ol.objectMod.default {
  def getActive(): Boolean = js.native
  def getMap(): typingsSlinky.ol.pluggableMapMod.default = js.native
  def handleEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default): Boolean = js.native
  @JSName("on")
  def on_changeactive(`type`: `change:active`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeactive(`type`: `change:active`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setActive(active: Boolean): Unit = js.native
  def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
  @JSName("un")
  def un_changeactive(`type`: `change:active`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

