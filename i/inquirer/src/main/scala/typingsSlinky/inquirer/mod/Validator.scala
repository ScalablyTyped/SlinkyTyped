package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to validate answers.
  *
  * @template T
  * The type of the answers.
  */
/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * input * / js.Any, 
/ * answers * / js.UndefOr[T], 
scala.Boolean | java.lang.String | (js.Promise[scala.Boolean | java.lang.String])]
  - js.UndefOr[scala.Nothing]
*/
trait Validator[T /* <: Answers */] extends js.Object

object Validator {
  @scala.inline
  implicit def apply[T](
    value: js.Function2[
      /* input */ js.Any, 
      /* answers */ js.UndefOr[T], 
      Boolean | String | (js.Promise[Boolean | String])
    ]
  ): Validator[T] = value.asInstanceOf[Validator[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => Validator[T]): Validator[T] = value.asInstanceOf[Validator[T]]
}

