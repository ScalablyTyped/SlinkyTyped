package typingsSlinky.ol.interactionInteractionMod

import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interaction
  extends typingsSlinky.ol.objectMod.default {
  
  /**
    * Return whether the interaction is currently active.
    */
  def getActive(): Boolean = js.native
  
  /**
    * Get the map associated with this interaction.
    */
  def getMap(): typingsSlinky.ol.pluggableMapMod.default = js.native
  
  /**
    * Handles the {@link module:ol/MapBrowserEvent map browser event}.
    */
  def handleEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
  
  @JSName("on")
  def on_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  /**
    * Activate or deactivate the interaction.
    */
  def setActive(active: Boolean): Unit = js.native
  
  /**
    * Remove the interaction from its current map and attach it to the new map.
    * Subclasses may set up event handlers to get notified about changes to
    * the map here.
    */
  def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
  
  @JSName("un")
  def un_changeactive(`type`: changeColonactive, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
