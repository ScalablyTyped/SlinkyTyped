package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.MapSourceDataEvent
  - typingsSlinky.mapboxGl.mod.MapStyleDataEvent
*/
trait MapDataEvent extends js.Object

object MapDataEvent {
  @scala.inline
  implicit def apply(value: MapSourceDataEvent): MapDataEvent = value.asInstanceOf[MapDataEvent]
  @scala.inline
  implicit def apply(value: MapStyleDataEvent): MapDataEvent = value.asInstanceOf[MapDataEvent]
}

