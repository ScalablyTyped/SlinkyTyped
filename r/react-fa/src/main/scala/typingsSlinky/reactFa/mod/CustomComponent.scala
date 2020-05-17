package typingsSlinky.reactFa.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.react.mod.ComponentClass[js.Any, typingsSlinky.react.mod.ComponentState]
  - typingsSlinky.react.mod.StatelessComponent[js.Any]
*/
trait CustomComponent extends js.Object

object CustomComponent {
  @scala.inline
  implicit def apply(value: ComponentClass[js.Any, js.Object]): CustomComponent = value.asInstanceOf[CustomComponent]
  @scala.inline
  implicit def apply(value: StatelessComponent[js.Any]): CustomComponent = value.asInstanceOf[CustomComponent]
  @scala.inline
  implicit def apply(value: String): CustomComponent = value.asInstanceOf[CustomComponent]
}

