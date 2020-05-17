package typingsSlinky.preact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type alias for a component instance considered generally, whether stateless or stateful.
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.preact.mod.FunctionComponent[P]
  - typingsSlinky.preact.mod.Component[P, S]
*/
trait AnyComponent[P, S] extends js.Object

object AnyComponent {
  @scala.inline
  implicit def apply[P, S](value: Component[P, S]): AnyComponent[P, S] = value.asInstanceOf[AnyComponent[P, S]]
  @scala.inline
  implicit def apply[P, S](value: FunctionComponent[P]): AnyComponent[P, S] = value.asInstanceOf[AnyComponent[P, S]]
}

