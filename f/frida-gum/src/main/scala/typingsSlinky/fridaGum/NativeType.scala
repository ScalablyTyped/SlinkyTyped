package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[js.Any]
*/
trait NativeType extends js.Object

object NativeType {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): NativeType = value.asInstanceOf[NativeType]
  @scala.inline
  implicit def apply(value: String): NativeType = value.asInstanceOf[NativeType]
}

