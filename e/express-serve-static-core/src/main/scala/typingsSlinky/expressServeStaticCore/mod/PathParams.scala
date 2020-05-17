package typingsSlinky.expressServeStaticCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Array[java.lang.String | typingsSlinky.std.RegExp]
*/
trait PathParams extends js.Object

object PathParams {
  @scala.inline
  implicit def apply(value: js.Array[String | js.RegExp]): PathParams = value.asInstanceOf[PathParams]
  @scala.inline
  implicit def apply(value: js.RegExp): PathParams = value.asInstanceOf[PathParams]
  @scala.inline
  implicit def apply(value: String): PathParams = value.asInstanceOf[PathParams]
}

