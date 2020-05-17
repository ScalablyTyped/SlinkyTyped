package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a union which preserves autocompletion.
  *
  * @template T
  * The keys which are available for autocompletion.
  *
  * @template F
  * The fallback-type.
  */
/* Rewritten from type alias, can be one of: 
  - T
  - F with js.Object
*/
trait LiteralUnion[T /* <: F */, F] extends js.Object

object LiteralUnion {
  @scala.inline
  implicit def apply[T, F](value: (F with js.Object) | T): LiteralUnion[T, F] = value.asInstanceOf[LiteralUnion[T, F]]
}

