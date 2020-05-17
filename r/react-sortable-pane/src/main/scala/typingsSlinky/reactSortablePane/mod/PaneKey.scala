package typingsSlinky.reactSortablePane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Null
*/
trait PaneKey extends js.Object

object PaneKey {
  @scala.inline
  implicit def apply(value: Double): PaneKey = value.asInstanceOf[PaneKey]
  @scala.inline
  implicit def apply(value: Null): PaneKey = value.asInstanceOf[PaneKey]
  @scala.inline
  implicit def apply(value: String): PaneKey = value.asInstanceOf[PaneKey]
}

