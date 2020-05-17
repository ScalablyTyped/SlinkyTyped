package typingsSlinky.humaneJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait logMessage extends js.Object

object logMessage {
  @scala.inline
  implicit def apply(value: js.Array[String]): logMessage = value.asInstanceOf[logMessage]
  @scala.inline
  implicit def apply(value: String): logMessage = value.asInstanceOf[logMessage]
}

