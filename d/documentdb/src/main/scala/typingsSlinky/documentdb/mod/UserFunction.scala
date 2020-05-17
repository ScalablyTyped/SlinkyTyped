package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * repeated * / js.Any, scala.Unit]
  - java.lang.String
*/
trait UserFunction extends js.Object

object UserFunction {
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ js.Any, Unit]): UserFunction = value.asInstanceOf[UserFunction]
  @scala.inline
  implicit def apply(value: String): UserFunction = value.asInstanceOf[UserFunction]
}

