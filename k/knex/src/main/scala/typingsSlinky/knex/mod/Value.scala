package typingsSlinky.knex.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Utility Types
//
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.std.Date
  - js.Array[scala.Boolean | typingsSlinky.std.Date | scala.Double | java.lang.String]
  - typingsSlinky.node.Buffer
  - typingsSlinky.knex.mod.Raw[js.Any]
*/
trait Value extends RawBinding

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
  implicit def apply(value: Raw[js.Any]): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
}

