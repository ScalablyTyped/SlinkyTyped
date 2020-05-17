package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - scala.Boolean
  - java.lang.String
  - scala.Double
  - typingsSlinky.nodePgMigrate.mod.PgLiteral
  - typingsSlinky.nodePgMigrate.mod.ValueArray
*/
trait Value extends js.Object

object Value {
  @scala.inline
  implicit def apply(value: Boolean): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Double): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Null): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: PgLiteral): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: ValueArray): Value = value.asInstanceOf[Value]
}

