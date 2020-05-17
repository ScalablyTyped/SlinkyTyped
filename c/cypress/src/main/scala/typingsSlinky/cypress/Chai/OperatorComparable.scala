package typingsSlinky.cypress.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Null
  - scala.Double
  - java.lang.String
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.std.Date
*/
trait OperatorComparable extends js.Object

object OperatorComparable {
  @scala.inline
  implicit def apply(value: Boolean): OperatorComparable = value.asInstanceOf[OperatorComparable]
  @scala.inline
  implicit def apply(value: js.Date): OperatorComparable = value.asInstanceOf[OperatorComparable]
  @scala.inline
  implicit def apply(value: Double): OperatorComparable = value.asInstanceOf[OperatorComparable]
  @scala.inline
  implicit def apply(value: Null): OperatorComparable = value.asInstanceOf[OperatorComparable]
  @scala.inline
  implicit def apply(value: String): OperatorComparable = value.asInstanceOf[OperatorComparable]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => OperatorComparable): OperatorComparable = value.asInstanceOf[OperatorComparable]
}

