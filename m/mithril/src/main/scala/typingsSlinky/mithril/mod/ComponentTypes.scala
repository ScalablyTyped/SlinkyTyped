package typingsSlinky.mithril.mod

import typingsSlinky.mithril.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse. Components can be consumed via the m() utility. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mithril.mod.Component[A, S]
  - typingsSlinky.mithril.anon.Instantiable[A]
  - typingsSlinky.mithril.mod.FactoryComponent[A]
*/
trait ComponentTypes[A, S /* <: Lifecycle[A, S] */] extends js.Object

object ComponentTypes {
  @scala.inline
  implicit def apply[A, S](value: Component[A, S]): ComponentTypes[A, S] = value.asInstanceOf[ComponentTypes[A, S]]
  @scala.inline
  implicit def apply[A, S](value: FactoryComponent[A]): ComponentTypes[A, S] = value.asInstanceOf[ComponentTypes[A, S]]
  @scala.inline
  implicit def apply[A, S](value: Instantiable[A]): ComponentTypes[A, S] = value.asInstanceOf[ComponentTypes[A, S]]
}

