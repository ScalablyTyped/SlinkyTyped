package typingsSlinky.libraCore.eventsPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/events_pb", "EventsForVersions")
@js.native
class EventsForVersions_ () extends Message {
  
  def addEventsForVersion(): EventsList = js.native
  def addEventsForVersion(value: js.UndefOr[scala.Nothing], index: Double): EventsList = js.native
  def addEventsForVersion(value: EventsList): EventsList = js.native
  def addEventsForVersion(value: EventsList, index: Double): EventsList = js.native
  
  def clearEventsForVersionList(): Unit = js.native
  
  def getEventsForVersionList(): js.Array[EventsList] = js.native
  
  def setEventsForVersionList(value: js.Array[EventsList]): Unit = js.native
}
