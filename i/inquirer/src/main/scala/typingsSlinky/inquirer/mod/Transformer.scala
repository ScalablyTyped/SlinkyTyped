package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.anon.IsFinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to transform an answer.
  *
  * @template T
  * The type of the answers.
  */
/* Rewritten from type alias, can be one of: 
  - js.Function3[
/ * input * / js.Any, 
/ * answers * / T, 
/ * flags * / typingsSlinky.inquirer.anon.IsFinal, 
java.lang.String | js.Promise[java.lang.String]]
  - js.UndefOr[scala.Nothing]
*/
trait Transformer[T /* <: Answers */] extends js.Object

object Transformer {
  @scala.inline
  implicit def apply[T](
    value: js.Function3[/* input */ js.Any, /* answers */ T, /* flags */ IsFinal, String | js.Promise[String]]
  ): Transformer[T] = value.asInstanceOf[Transformer[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => Transformer[T]): Transformer[T] = value.asInstanceOf[Transformer[T]]
}

