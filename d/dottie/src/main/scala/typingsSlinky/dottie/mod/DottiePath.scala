package typingsSlinky.dottie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait DottiePath extends js.Object

object DottiePath {
  @scala.inline
  implicit def apply(value: js.Array[String]): DottiePath = value.asInstanceOf[DottiePath]
  @scala.inline
  implicit def apply(value: String): DottiePath = value.asInstanceOf[DottiePath]
}

