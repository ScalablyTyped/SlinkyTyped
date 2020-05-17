package typingsSlinky.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Either name a property or get the value of a property from an object. */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function2[/ * data * / js.Any, / * newval * / js.Any, js.Any]
*/
trait PropertyAccessor extends js.Object

object PropertyAccessor {
  @scala.inline
  implicit def apply(value: js.Function2[/* data */ js.Any, /* newval */ js.Any, js.Any]): PropertyAccessor = value.asInstanceOf[PropertyAccessor]
  @scala.inline
  implicit def apply(value: String): PropertyAccessor = value.asInstanceOf[PropertyAccessor]
}

