package typingsSlinky.reactJsonschemaForm.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.StatelessComponent[typingsSlinky.reactJsonschemaForm.mod.FieldProps[js.Any]]
  - typingsSlinky.react.mod.ComponentClass[
typingsSlinky.reactJsonschemaForm.mod.FieldProps[js.Any], 
typingsSlinky.react.mod.ComponentState]
*/
trait Field extends js.Object

object Field {
  @scala.inline
  implicit def apply(value: ComponentClass[FieldProps[js.Any], js.Object]): Field = value.asInstanceOf[Field]
  @scala.inline
  implicit def apply(value: StatelessComponent[FieldProps[js.Any]]): Field = value.asInstanceOf[Field]
}

