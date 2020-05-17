package typingsSlinky.antd.treeSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait RawValue extends SelectValue

object RawValue {
  @scala.inline
  implicit def apply(value: Double): RawValue = value.asInstanceOf[RawValue]
  @scala.inline
  implicit def apply(value: String): RawValue = value.asInstanceOf[RawValue]
}

