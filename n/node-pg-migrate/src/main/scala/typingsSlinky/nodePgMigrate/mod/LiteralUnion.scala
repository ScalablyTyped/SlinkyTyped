package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - U with js.Object
*/
trait LiteralUnion[T /* <: U */, U] extends js.Object

object LiteralUnion {
  @scala.inline
  implicit def apply[T, U](value: (U with js.Object) | T): LiteralUnion[T, U] = value.asInstanceOf[LiteralUnion[T, U]]
}

