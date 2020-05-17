package typingsSlinky.checkError.mod

import typingsSlinky.checkError.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Error
  - typingsSlinky.checkError.anon.Instantiable
  - js.Function1[/ * repeated * / js.Any, typingsSlinky.std.Error]
*/
trait ErrorInstanceOrConstructor extends js.Object

object ErrorInstanceOrConstructor {
  @scala.inline
  implicit def apply(value: js.Error): ErrorInstanceOrConstructor = value.asInstanceOf[ErrorInstanceOrConstructor]
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ js.Any, js.Error]): ErrorInstanceOrConstructor = value.asInstanceOf[ErrorInstanceOrConstructor]
  @scala.inline
  implicit def apply(value: Instantiable): ErrorInstanceOrConstructor = value.asInstanceOf[ErrorInstanceOrConstructor]
}

