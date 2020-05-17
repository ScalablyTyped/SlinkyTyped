package typingsSlinky.history.mod.History

import typingsSlinky.history.mod.LocationDescriptorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.history.mod.History.Path
  - typingsSlinky.history.mod.LocationDescriptorObject[S]
*/
trait LocationDescriptor[S] extends js.Object

object LocationDescriptor {
  @scala.inline
  implicit def apply[S](value: LocationDescriptorObject[S]): LocationDescriptor[S] = value.asInstanceOf[LocationDescriptor[S]]
  @scala.inline
  implicit def apply[S](value: Path): LocationDescriptor[S] = value.asInstanceOf[LocationDescriptor[S]]
}

