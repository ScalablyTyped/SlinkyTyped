package typingsSlinky.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.kdbxweb.mod.ProtectedValue
  - java.lang.String
*/
trait StringProtected extends js.Object

object StringProtected {
  @scala.inline
  implicit def apply(value: ProtectedValue): StringProtected = value.asInstanceOf[StringProtected]
  @scala.inline
  implicit def apply(value: String): StringProtected = value.asInstanceOf[StringProtected]
}

