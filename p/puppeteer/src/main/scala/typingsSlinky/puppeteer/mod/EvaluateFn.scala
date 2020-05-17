package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function2[/ * arg1 * / T, / * repeated * / js.Any, js.Any]
*/
trait EvaluateFn[T] extends js.Object

object EvaluateFn {
  @scala.inline
  implicit def apply[T](value: js.Function2[/* arg1 */ T, /* repeated */ js.Any, js.Any]): EvaluateFn[T] = value.asInstanceOf[EvaluateFn[T]]
  @scala.inline
  implicit def apply[T](value: String): EvaluateFn[T] = value.asInstanceOf[EvaluateFn[T]]
}

