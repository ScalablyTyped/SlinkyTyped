package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#selector-syntax
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Date
  - scala.Boolean
  - js.Object
  - scala.Null
*/
trait MangoValue extends js.Object

object MangoValue {
  @scala.inline
  implicit def apply(value: Boolean): MangoValue = value.asInstanceOf[MangoValue]
  @scala.inline
  implicit def apply(value: js.Date): MangoValue = value.asInstanceOf[MangoValue]
  @scala.inline
  implicit def apply(value: Double): MangoValue = value.asInstanceOf[MangoValue]
  @scala.inline
  implicit def apply(value: Null): MangoValue = value.asInstanceOf[MangoValue]
  @scala.inline
  implicit def apply(value: js.Object): MangoValue = value.asInstanceOf[MangoValue]
  @scala.inline
  implicit def apply(value: String): MangoValue = value.asInstanceOf[MangoValue]
}

