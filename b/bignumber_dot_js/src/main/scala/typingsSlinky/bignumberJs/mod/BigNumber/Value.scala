package typingsSlinky.bignumberJs.mod.BigNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.bignumberJs.mod.BigNumber.Instance
*/
trait Value extends js.Object

object Value {
  @scala.inline
  implicit def apply(value: Double): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Instance): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
}

