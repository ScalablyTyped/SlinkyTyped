package typingsSlinky.areWeThereYet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("are-we-there-yet", "TrackerGroup")
@js.native
class TrackerGroup ()
  extends TrackerBase
     with TrackerObject {
  def this(name: String) = this()
  def addUnit(tracker: TrackerBase): TrackerObject = js.native
  def addUnit(tracker: TrackerBase, weight: Double): TrackerObject = js.native
  def completed(): Double = js.native
  def debug(): String = js.native
  def finish(): Unit = js.native
  def newGroup(): TrackerGroup = js.native
  def newGroup(name: String): TrackerGroup = js.native
  def newGroup(name: String, weight: Double): TrackerGroup = js.native
  def newItem(): Tracker = js.native
  def newItem(name: String): Tracker = js.native
  def newItem(name: String, todo: Double): Tracker = js.native
  def newItem(name: String, todo: Double, weight: Double): Tracker = js.native
  def newStream(): TrackerStream = js.native
  def newStream(name: String): TrackerStream = js.native
  def newStream(name: String, todo: Double): TrackerStream = js.native
  def newStream(name: String, todo: Double, weight: Double): TrackerStream = js.native
}

