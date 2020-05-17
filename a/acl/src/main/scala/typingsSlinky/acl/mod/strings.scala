package typingsSlinky.acl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait strings extends js.Object

object strings {
  @scala.inline
  implicit def apply(value: js.Array[String]): strings = value.asInstanceOf[strings]
  @scala.inline
  implicit def apply(value: String): strings = value.asInstanceOf[strings]
}

