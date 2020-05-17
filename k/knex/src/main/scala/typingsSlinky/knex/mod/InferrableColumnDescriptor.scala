package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - / * keyof TRecord * / java.lang.String
  - typingsSlinky.knex.mod.Ref[js.Any, js.Any]
  - typingsSlinky.knex.mod.Dict[/ * keyof TRecord * / java.lang.String]
*/
trait InferrableColumnDescriptor[TRecord /* <: js.Object */] extends js.Object

object InferrableColumnDescriptor {
  @scala.inline
  implicit def apply[TRecord](value: Dict[/* keyof TRecord */ String]): InferrableColumnDescriptor[TRecord] = value.asInstanceOf[InferrableColumnDescriptor[TRecord]]
  @scala.inline
  implicit def apply[TRecord](value: Ref[js.Any, js.Any]): InferrableColumnDescriptor[TRecord] = value.asInstanceOf[InferrableColumnDescriptor[TRecord]]
  @scala.inline
  implicit def apply[TRecord](value: /* keyof TRecord */ String): InferrableColumnDescriptor[TRecord] = value.asInstanceOf[InferrableColumnDescriptor[TRecord]]
}

