package typingsSlinky.meteor.mod.Accounts

import typingsSlinky.meteor.anon.Digest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.meteor.anon.Digest
*/
trait Password extends js.Object

object Password {
  @scala.inline
  implicit def apply(value: Digest): Password = value.asInstanceOf[Password]
  @scala.inline
  implicit def apply(value: String): Password = value.asInstanceOf[Password]
}

