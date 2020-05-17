package typingsSlinky.griddleReact.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentClass[T, typingsSlinky.react.mod.ComponentState]
  - typingsSlinky.react.mod.StatelessComponent[T]
*/
trait GriddleComponent[T] extends js.Object

object GriddleComponent {
  @scala.inline
  implicit def apply[T](value: ComponentClass[T, js.Object]): GriddleComponent[T] = value.asInstanceOf[GriddleComponent[T]]
  @scala.inline
  implicit def apply[T](value: StatelessComponent[T]): GriddleComponent[T] = value.asInstanceOf[GriddleComponent[T]]
}

