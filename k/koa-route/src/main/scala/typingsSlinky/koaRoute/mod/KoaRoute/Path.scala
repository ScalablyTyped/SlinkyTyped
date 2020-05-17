package typingsSlinky.koaRoute.mod.KoaRoute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Array[java.lang.String | typingsSlinky.std.RegExp]
*/
trait Path extends js.Object

object Path {
  @scala.inline
  implicit def apply(value: js.Array[String | js.RegExp]): Path = value.asInstanceOf[Path]
  @scala.inline
  implicit def apply(value: js.RegExp): Path = value.asInstanceOf[Path]
  @scala.inline
  implicit def apply(value: String): Path = value.asInstanceOf[Path]
}

