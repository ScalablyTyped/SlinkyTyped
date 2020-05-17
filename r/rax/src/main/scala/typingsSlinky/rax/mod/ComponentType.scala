package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rax.mod.ComponentClass[P, typingsSlinky.rax.mod.ComponentState]
  - typingsSlinky.rax.mod.FunctionComponent[P]
*/
trait ComponentType[P] extends ElementType[P]

object ComponentType {
  @scala.inline
  implicit def apply[P](value: ComponentClass[P, ComponentState]): ComponentType[P] = value.asInstanceOf[ComponentType[P]]
  @scala.inline
  implicit def apply[P](value: FunctionComponent[P]): ComponentType[P] = value.asInstanceOf[ComponentType[P]]
}

