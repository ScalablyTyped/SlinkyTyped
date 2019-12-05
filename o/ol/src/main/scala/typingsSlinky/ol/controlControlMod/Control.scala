package typingsSlinky.ol.controlControlMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.eventsMod.EventsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control
  extends typingsSlinky.ol.objectMod.default {
  var element: HTMLElement = js.native
  var listenerKeys: js.Array[EventsKey] = js.native
  def getMap(): typingsSlinky.ol.pluggableMapMod.default = js.native
  def setMap(map: typingsSlinky.ol.pluggableMapMod.default): Unit = js.native
  def setTarget(target: String): Unit = js.native
  def setTarget(target: typingsSlinky.std.HTMLElement): Unit = js.native
}

