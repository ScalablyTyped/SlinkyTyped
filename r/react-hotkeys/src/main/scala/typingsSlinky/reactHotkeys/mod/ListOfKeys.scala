package typingsSlinky.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait ListOfKeys extends js.Object

object ListOfKeys {
  @scala.inline
  implicit def apply(value: js.Array[String]): ListOfKeys = value.asInstanceOf[ListOfKeys]
  @scala.inline
  implicit def apply(value: String): ListOfKeys = value.asInstanceOf[ListOfKeys]
}

