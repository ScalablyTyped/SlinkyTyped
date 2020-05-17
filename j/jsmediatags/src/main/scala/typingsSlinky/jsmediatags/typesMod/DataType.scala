package typingsSlinky.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.jsmediatags.typesMod.TypedArray
  - java.lang.String
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  implicit def apply(value: js.Array[Double]): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: String): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: TypedArray): DataType = value.asInstanceOf[DataType]
}

