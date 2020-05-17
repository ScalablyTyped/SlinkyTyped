package typingsSlinky.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait RawValueType extends DefaultValueType

object RawValueType {
  @scala.inline
  implicit def apply(value: Double): RawValueType = value.asInstanceOf[RawValueType]
  @scala.inline
  implicit def apply(value: String): RawValueType = value.asInstanceOf[RawValueType]
}

