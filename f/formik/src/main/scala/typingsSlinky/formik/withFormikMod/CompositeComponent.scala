package typingsSlinky.formik.withFormikMod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentClass[P, typingsSlinky.react.mod.ComponentState]
  - typingsSlinky.react.mod.StatelessComponent[P]
*/
trait CompositeComponent[P] extends js.Object

object CompositeComponent {
  @scala.inline
  implicit def apply[P](value: ComponentClass[P, js.Object]): CompositeComponent[P] = value.asInstanceOf[CompositeComponent[P]]
  @scala.inline
  implicit def apply[P](value: StatelessComponent[P]): CompositeComponent[P] = value.asInstanceOf[CompositeComponent[P]]
}

