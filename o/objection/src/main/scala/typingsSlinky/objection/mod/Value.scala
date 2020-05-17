package typingsSlinky.objection.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Partial revision of
// https://raw.githubusercontent.com/DefinitelyTyped/DefinitelyTyped/master/types/knex/index.d.ts,
// to change the signatures to return Objection's typed QueryBuilder wrapper:
//
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.std.Date
  - js.Array[scala.Boolean | typingsSlinky.std.Date | scala.Double | java.lang.String]
  - scala.Null
  - typingsSlinky.node.Buffer
  - typingsSlinky.objection.mod.Raw_
  - typingsSlinky.objection.mod.Literal
*/
trait Value extends js.Object

object Value {
  @scala.inline
  implicit def apply(value: js.Array[Boolean | js.Date | Double | String]): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Boolean): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Buffer): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: js.Date): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Double): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Literal): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Null): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Raw_): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
}

