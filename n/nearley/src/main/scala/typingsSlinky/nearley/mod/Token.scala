package typingsSlinky.nearley.mod

import typingsSlinky.nearley.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.nearley.anon.Value
*/
trait Token extends js.Object

object Token {
  @scala.inline
  implicit def apply(value: String): Token = value.asInstanceOf[Token]
  @scala.inline
  implicit def apply(value: Value): Token = value.asInstanceOf[Token]
}

