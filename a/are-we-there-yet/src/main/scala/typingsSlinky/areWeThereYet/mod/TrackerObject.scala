package typingsSlinky.areWeThereYet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.areWeThereYet.mod.Tracker
  - typingsSlinky.areWeThereYet.mod.TrackerGroup
  - typingsSlinky.areWeThereYet.mod.TrackerStream
*/
trait TrackerObject extends js.Object

object TrackerObject {
  @scala.inline
  implicit def apply(value: Tracker): TrackerObject = value.asInstanceOf[TrackerObject]
  @scala.inline
  implicit def apply(value: TrackerGroup): TrackerObject = value.asInstanceOf[TrackerObject]
  @scala.inline
  implicit def apply(value: TrackerStream): TrackerObject = value.asInstanceOf[TrackerObject]
}

