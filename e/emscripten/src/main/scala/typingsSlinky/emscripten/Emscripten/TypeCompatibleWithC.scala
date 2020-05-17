package typingsSlinky.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - js.Array[js.Any]
  - scala.Boolean
*/
trait TypeCompatibleWithC extends js.Object

object TypeCompatibleWithC {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): TypeCompatibleWithC = value.asInstanceOf[TypeCompatibleWithC]
  @scala.inline
  implicit def apply(value: Boolean): TypeCompatibleWithC = value.asInstanceOf[TypeCompatibleWithC]
  @scala.inline
  implicit def apply(value: Double): TypeCompatibleWithC = value.asInstanceOf[TypeCompatibleWithC]
  @scala.inline
  implicit def apply(value: String): TypeCompatibleWithC = value.asInstanceOf[TypeCompatibleWithC]
}

