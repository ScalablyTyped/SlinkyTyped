package typingsSlinky.objectPathImmutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait Path extends js.Object

object Path {
  @scala.inline
  implicit def apply(value: js.Array[String]): Path = value.asInstanceOf[Path]
  @scala.inline
  implicit def apply(value: String): Path = value.asInstanceOf[Path]
}

