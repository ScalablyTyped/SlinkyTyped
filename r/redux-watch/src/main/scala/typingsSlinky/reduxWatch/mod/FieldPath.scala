package typingsSlinky.reduxWatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Array[java.lang.String | scala.Double]
*/
trait FieldPath extends js.Object

object FieldPath {
  @scala.inline
  implicit def apply(value: js.Array[String | Double]): FieldPath = value.asInstanceOf[FieldPath]
  @scala.inline
  implicit def apply(value: Double): FieldPath = value.asInstanceOf[FieldPath]
  @scala.inline
  implicit def apply(value: String): FieldPath = value.asInstanceOf[FieldPath]
}

