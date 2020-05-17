package typingsSlinky.preact.internalMod

import typingsSlinky.preact.mod.ComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.preact.mod.ComponentClass[P, js.Object]
  - typingsSlinky.preact.internalMod.FunctionalComponent[P]
*/
trait ComponentFactory[P] extends js.Object

object ComponentFactory {
  @scala.inline
  implicit def apply[P](value: ComponentClass[P, js.Object]): ComponentFactory[P] = value.asInstanceOf[ComponentFactory[P]]
  @scala.inline
  implicit def apply[P](value: FunctionalComponent[P]): ComponentFactory[P] = value.asInstanceOf[ComponentFactory[P]]
}

