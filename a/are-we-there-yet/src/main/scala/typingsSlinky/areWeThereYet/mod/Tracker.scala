package typingsSlinky.areWeThereYet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("are-we-there-yet", "Tracker")
@js.native
class Tracker ()
  extends TrackerBase
     with TrackerObject {
  def this(name: String) = this()
  def this(name: String, todo: Double) = this()
  def addWork(work: Double): Unit = js.native
  def completeWork(completed: Double): Unit = js.native
  def completed(): Double = js.native
  def finish(): Unit = js.native
}

