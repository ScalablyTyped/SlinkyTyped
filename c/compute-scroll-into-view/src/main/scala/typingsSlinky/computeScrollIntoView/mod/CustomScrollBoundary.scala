package typingsSlinky.computeScrollIntoView.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Element
  - typingsSlinky.computeScrollIntoView.mod.CustomScrollBoundaryCallback
  - scala.Null
*/
trait CustomScrollBoundary extends js.Object

object CustomScrollBoundary {
  @scala.inline
  implicit def apply(value: CustomScrollBoundaryCallback): CustomScrollBoundary = value.asInstanceOf[CustomScrollBoundary]
  @scala.inline
  implicit def apply(value: Element): CustomScrollBoundary = value.asInstanceOf[CustomScrollBoundary]
  @scala.inline
  implicit def apply(value: Null): CustomScrollBoundary = value.asInstanceOf[CustomScrollBoundary]
}

