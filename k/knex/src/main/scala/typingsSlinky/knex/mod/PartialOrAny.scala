package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Boxing is necessary to prevent distribution of conditional types:
// https://lorefnon.tech/2019/05/02/using-boxing-to-prevent-distribution-of-conditional-types/
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.knex.mod.SafePick[TBase, TKeys with (/ * keyof TBase * / java.lang.String)]
  - js.Object
*/
trait PartialOrAny[TBase, TKeys] extends js.Object

object PartialOrAny {
  @scala.inline
  implicit def apply[TBase, TKeys](value: js.Object): PartialOrAny[TBase, TKeys] = value.asInstanceOf[PartialOrAny[TBase, TKeys]]
  @scala.inline
  implicit def apply[TBase, TKeys](value: SafePick[TBase, TKeys with (/* keyof TBase */ String)]): PartialOrAny[TBase, TKeys] = value.asInstanceOf[PartialOrAny[TBase, TKeys]]
}

