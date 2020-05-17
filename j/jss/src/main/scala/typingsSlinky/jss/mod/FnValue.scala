package typingsSlinky.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: Type data better, currently typed as any for allowing to override it
/* Rewritten from type alias, can be one of: 
  - R
  - js.Function1[/ * data * / js.Any, R]
*/
trait FnValue[R] extends js.Object

object FnValue {
  @scala.inline
  implicit def apply[R](value: js.Function1[/* data */ js.Any, R]): FnValue[R] = value.asInstanceOf[FnValue[R]]
  @scala.inline
  implicit def apply[R](value: R): FnValue[R] = value.asInstanceOf[FnValue[R]]
}

