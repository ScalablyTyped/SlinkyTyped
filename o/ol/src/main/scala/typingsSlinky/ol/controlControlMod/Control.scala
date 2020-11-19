package typingsSlinky.ol.controlControlMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.eventsMod.EventsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control
  extends typingsSlinky.ol.objectMod.default {
  
  var element: HTMLElement = js.native
  
  def getMap(): typingsSlinky.ol.pluggableMapMod.default = js.native
  
  var listenerKeys: js.Array[EventsKey] = js.native
  
  def render(mapEvent: typingsSlinky.ol.mapEventMod.default): Unit = js.native
  
  def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
  
  def setTarget(target: String): Unit = js.native
  def setTarget(target: HTMLElement): Unit = js.native
}
